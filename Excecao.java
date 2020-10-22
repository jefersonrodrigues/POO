
package cadastro;

public class Excecao extends Exception { 
    protected String message;
    
    public Excecao(String message) {
        super(message);
        this.message = message;
    }  

    @Override
    public String toString() {
        return "É necessário preencher o campo de busca, para pesquisar algo"; 
    }
        
    
     
}
