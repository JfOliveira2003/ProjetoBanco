public class Conta {

    private int numero;
    private Cliente titular = new Cliente();
    private double saldo;

    public int SetNumero(int numero){
        return this.numero = numero;
    }
    public int GetNumero(){
        return this.numero;
    }
    public double SetSaldo(double valor){
        return this.saldo = valor;
    }
    public double GetSaldo(){
        return this.saldo;
    }
    public Cliente getTitular(){
        return this.titular;
    }
    @Override
    public String toString() {
        return "Conta [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + "]";
    }
}
