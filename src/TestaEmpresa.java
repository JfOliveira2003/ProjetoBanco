public class TestaEmpresa {

    public static void main(String[] args){
        Empresa empresa1 = new Empresa();
        Funcionario f1 = new Funcionario();

        f1.SetNome("Alfredo");
        f1.SetDepartamento("Vendas");
        f1.SetSalario(2300.00);

        empresa1.Adiciona(f1);


    }
}
