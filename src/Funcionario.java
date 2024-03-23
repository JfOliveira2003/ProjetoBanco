public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private boolean ativo;


    public void aumentarSalario(double valor){

    }
    public void demitir(){
        this.ativo = false;
    }

    public void SetNome(String nome){
        this.nome = nome;
    }
    public String GetNome(){
        return this.nome;
    }
    public void SetDepartamento(String dep){
        this.departamento= dep;
    }
    public String GetDepartamento(){
        return this.departamento;
    }
    public void SetSalario(double salario){
        this.salario = salario;
    }
    public double GetSalario(){
        return this.salario;
    }
}
