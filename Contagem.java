package contador;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Contagem extends Thread implements ActionListener {
    private static JTextField tf;
    private static JLabel l; 
    private static boolean terminar;

    public Contagem(JTextField tf, JLabel l) {
            this.tf = tf;
            this.l = l;
    }

    //contador.setForeground(Color.red);
    @Override
    public void run() {
            terminar = false;
            int v;
            if (l.getText().contains("COUNTER")) {
                    v = Integer.valueOf(tf.getText());
            } else {
                    v = Integer.valueOf(l.getText());
            } 
            l.setText("" + v);
            while ((v > 0) && (!terminar)) {
                    try {
                            Thread.sleep(1000);
                    } catch (Exception e) {
                            e.printStackTrace();
                    }
                    v--;
                    l.setText(""+v);
            }
    }

    public static void terminarThread() {
            terminar = true;
    }

    public static void iniciarThread() {
            Contagem c = new Contagem(tf, l);
            c.start();
    }

    public void red(){
        System.out.println("COR: VERMELHO");
        Contagem.l.setForeground(Color.RED);
    }

    public void yellow(){
        System.out.println("COR: AMARELO");
        Contagem.l.setForeground(Color.YELLOW);
    }

    public void normal(){
        System.out.println("COR: PRETO");
        Contagem.l.setForeground(Color.BLACK);
    }

    @Override
    public void actionPerformed(ActionEvent e) {	
            JButton source = (JButton)e.getSource();
            if(source.getText().contentEquals("START")) {
                    System.out.println("INICIAR A THREAD DE CONTAGEM");
                    Contagem.iniciarThread();
//			source.setEnabled(false);
            }else if(source.getText().contentEquals("RED")) {
                    System.out.println("COR: VERMELHO");
                    Contagem.l.setForeground(Color.RED);
            }else if(source.getText().contentEquals("YELLOW")) {
                    System.out.println("COR: AMARELO");
                    Contagem.l.setForeground(Color.YELLOW);
            }else if(source.getText().contentEquals("NORMAL")) {
                    System.out.println("COR: PRETO");
                    Contagem.l.setForeground(Color.BLACK);
            }else {			
                    System.out.println("PARAR A THREAD DE CONTAGEM!");
                    Contagem.terminarThread();

            }
    }
}
