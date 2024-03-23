public class Empresa {
    private String nome;
    private int numero;
    private String cnpj;
    private Funcionario[] empregados;
    private int posicaoAtualDoArray;

    public void Adiciona(Funcionario NovoEmpregado){
        this.empregados[this.posicaoAtualDoArray] = NovoEmpregado;
        posicaoAtualDoArray++;
    }
    
}
