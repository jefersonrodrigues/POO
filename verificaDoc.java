package cadastro.socket;

import cadastro.DataTM;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

public class verificaDoc extends Thread implements FocusListener{
    
    private static boolean terminar;
    private static JFormattedTextField tfCpf;
    private static DataTM tableModel;
    
    public verificaDoc(JFormattedTextField tfCpf, DataTM tableModel) {
        this.tfCpf = tfCpf;
        this.tableModel = tableModel;
    }

    public void run() {
        terminar = false;
        while(!terminar){
            try{
                String st = tfCpf.getText();
                for(int i=0; i< tableModel.data.size();i++){
                    if(st.equalsIgnoreCase(tableModel.data.get(i).getCpf())){
                        JOptionPane.showMessageDialog(null, "Já existe um usuário cadastrado com esse número de CPF. \nTente recuperar sua senha, ou entre em contato com o nosso suporte!");
                        tfCpf.setText("");
                    }
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
       
	public static void terminarThread() {
		terminar = true;
	}
	
	public static void iniciarThread() {
		verificaDoc c = new verificaDoc(tfCpf, tableModel);
		c.start();
	}

    
    @Override
    public void focusGained(FocusEvent e) {
        System.out.println("INICIAR A THREAD DE VERIFICAÇÃO!");
        verificaDoc.iniciarThread();
    }
    @Override
    public void focusLost(FocusEvent e) {
        System.out.println("PARAR A THREAD DE VERIFICAÇÃO!");
        verificaDoc.terminarThread();
    }
}
