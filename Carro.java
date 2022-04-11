public class Carro{
    private String motor;
    private String modelo;
    private int roda;
    private double preco;

    public Carro(){
    
    }
    public Carro(String motor, String modelo, int roda, double preco){
        this.motor=motor;
        this.modelo=modelo;
        this.roda=roda;
        this.preco=preco;

    }
    public void dadosVeiculo(){
        System.out.print(this.motor+" " +this.modelo+ " " +this.roda+" " +this.preco);
    }

}
