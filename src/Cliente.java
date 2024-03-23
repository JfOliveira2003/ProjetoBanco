public class Cliente {
    private String nome;
    private String email;
    private String cpf;

    public String GetNome(){
        return this.nome;
    }
    public String SetNome(String nome){
        return this.nome = nome;
    }
    public String GetEmail(){
        return this.email;
    }
    public String SetEmail(String email){
        return this.email = email;
    }
    public String GetCpf(){
        return this.cpf;
    }
    public void SetCpf(String Cpf){
        if(this.validaCpf(Cpf)){
            this.cpf = Cpf;
        }
    }
    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", email=" + email + ", cpf=" + cpf + "]";
    }
    private boolean validaCpf(String cpf){
        if(cpf.length() == 11){
            return true;
        }
        return false;
    }
    
}
