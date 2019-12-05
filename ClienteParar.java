package contador;

import java.net.*;  
import java.io.*; 

public class ClienteParar {
    public static void main(String args[])throws Exception{
    // Criar socket e já conectar no servidor
    Socket s = new Socket("localhost", 3333);  
    //Socket s=new Socket("localhost",3333); 
    // Criar os canais para comunicação com o cliente (entrada e saída)
    //DataInputStream din=new DataInputStream(s.getInputStream());  
    DataOutputStream dout=new DataOutputStream(s.getOutputStream()); 
    // Usado para teste de leitura via linha de comando
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  

    String str="", str2="";  
    while(true){  
            str = br.readLine();  
            dout.writeUTF(str); 
            dout.flush();    
    }  

/*			
    dout.close();  
    s.close();
    */  
    }
}  
