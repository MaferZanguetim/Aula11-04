public class Trator {
    private String tracao;
    private int ano;
    private String combustivel;
    private double tamanhoRoda;
    private String modelo;
    public Trator(){

    }
    public Trator (String tracao, int ano, String combustivel, double tamanhoRoda, String modelo){
        this.tracao=tracao;
        this.ano=ano;
        this.combustivel=combustivel;
        this.tamanhoRoda=tamanhoRoda;
        this.modelo=modelo;

    }
    public void dadosVeiculo(){
        System.out.println(this.tracao+" " +this.ano+ " " +this.combustivel+" " +this.tamanhoRoda+" " +this.modelo);
    }
}
