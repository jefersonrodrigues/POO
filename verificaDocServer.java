package cadastro.socket;

import java.net.*;  
import java.io.*; 

public class verificaDocServer extends Thread {
    
    verificaDoc c;

    public verificaDocServer(verificaDoc c) {
        this.c = c;
    }

    public void run() {
        while (true) {
            // Criar socket para espera na porta 3333
            ServerSocket ss = null;
            Socket s = null;
            DataInputStream din = null;
            try {
                ss = new ServerSocket(3333);
                //Aceita a conexão do cliente
                s = ss.accept();
                // Criar os canais para comunicação com o cliente (entrada e saída)
                din = new DataInputStream(s.getInputStream());  
            } catch (IOException e) {
                    //TODO Auto-generated catch block
            }
            String str = "";
            while (true) {
                //str = din.readUTF();
                if (str.equals("parar")) {
                    c.terminarThread();
                } else if (str.equals("iniciar")) {
                    c.iniciarThread();
                }
            }			  
	}
    }
} 
