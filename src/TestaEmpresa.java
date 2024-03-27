public class TestaEmpresa {

    public static void main(String[] args){
        Empresa empresa1 = new Empresa(3, 555660, "1246465456/23");
        Funcionario f1 = new Funcionario();


        f1.SetNome("Alfredo");
        f1.SetDepartamento("Vendas");
        f1.SetSalario(2300.00);
        f1.getDataNascimento().setDatanascimento("12", "04", "2005");

        empresa1.Adiciona(f1);

        System.out.println("funcionario: " + f1.getDataNascimento().dataNascimentoCompleta());

        Funcionario f2 = new Funcionario();

        f2.SetNome("Alcimar");
        f2.SetDepartamento("TI");
        f2.SetSalario(9000);
        f2.getDataNascimento().setDatanascimento("04", "09", "2003");

        empresa1.Adiciona(f2);

        Funcionario f3 = new Funcionario();

        f3.SetNome("Olinda");
        f3.SetDepartamento("RH");
        f3.SetSalario(4000);
        f3.getDataNascimento().setDatanascimento("07", "11", "1999");

        empresa1.Adiciona(f3);

        for (Funcionario empregado : empresa1.getEmpregados()) {
            System.out.println(empregado);
            System.out.println(empregado.GetNome());
        }
        System.out.println();
    }
}
