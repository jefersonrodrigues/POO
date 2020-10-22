package cadastro;

public class User extends Address{
    
    public String nome;
    public String email;  
    public String sexo;
    public String celular;
    public String rg;
    public String cpf;
    public String dtNasc;
    public String login;
    public String senha;

    public User(String rua, int numero, String complemento, String cep, String cidade, String estado) {
        super(rua, numero, complemento, cep, cidade, estado);
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.celular = celular;
        this.rg = rg;
        this.cpf = cpf;
        this.dtNasc = dtNasc;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

 


}
