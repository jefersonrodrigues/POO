package contador;

import java.net.*;
import java.io.*; 

public class ContagemServidor extends Thread {
    Contagem c;

    public ContagemServidor(Contagem c) {
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
                        // Aceita a conexão do cliente
                        s = ss.accept();
                        // Criar os canais para comunicação com o cliente (entrada e saída)
                        din = new DataInputStream(s.getInputStream());  
                } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }  
                String str = "";  		
                while (true) {
                        try {
                                str = din.readUTF();
                                System.out.println(str);
                                if (str.equals("parar")) {
                                        c.terminarThread();
                                } else if (str.equals("iniciar")) {
                                        c.iniciarThread();
                                } else if (str.equals("red")) {
                                        c.red();
                                } else if (str.equals("yellow")) {
                                        c.yellow();
                                } else if (str.equals("normal")) {
                                        c.normal();
                                }
                        } catch (IOException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                        }
                }
/*
                try {
                        din.close();
                        s.close();  
                        ss.close();
                } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
*/			  
        }
    }
} 
