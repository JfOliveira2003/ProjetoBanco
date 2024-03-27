public class Empresa {
    private String nome;
    private int numero;
    private String cnpj;
    private Funcionario[] empregados;
    private int posicaoAtualDoArray;

    public Empresa(){

    }
    public Empresa(int arrayLengh, int numero, String cnpj){
        this.numero = numero;
        this.cnpj = cnpj;
        this.empregados = new Funcionario[arrayLengh];
    }
    public void Adiciona(Funcionario novoEmpregado){
        this.empregados[this.posicaoAtualDoArray] = novoEmpregado;
        posicaoAtualDoArray++;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNumero(int num){
        this.numero = num;
    }
    public int getNumero(){
        return this.numero;
    }
    public String getCnpj(){
        return this.cnpj;
    }
    public Funcionario[] getEmpregados(){
        return this.empregados;
    }
    public String mostradados(){
        /*
            aqui você está dando um mostraDados() no array / vetor de empregados.
            você precisaria usar laço de repetição para passar para cada empregado, chamando o método mostraDados() de cada empregado
         */
        return this.getEmpregados()[posicaoAtualDoArray].mostraDados();
    }
}
