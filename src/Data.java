public class Data {
    private String dia, mes, ano;

    public Data(){

    }
    public Data(String dia, String mes, String ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public String dataNascimentoCompleta(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
    public void setDatanascimento(String dia, String mes, String ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
}
