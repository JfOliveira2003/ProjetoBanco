public class Teste {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.SetNumero(7347574);
        conta1.SetSaldo(80000000);
        conta1.getTitular().SetCpf("9999999900");
        conta1.getTitular().SetNome("O homem que programava");
        conta1.getTitular().SetEmail("alguem@algumlugar.com");

        System.out.println(conta1.GetNumero());
        System.out.println(conta1.GetSaldo());
        System.out.println(conta1.getTitular().GetNome());
        System.out.println(conta1.getTitular().GetEmail());
        System.out.println(conta1.toString());
    }
}
