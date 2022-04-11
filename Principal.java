public class Principal {
    public static void main(String[] args) {
        Bicicleta bike = new Bicicleta();

        Carro car = new Carro();
        Carro car2 = new Carro("1.0", "Up", 4, 63000);
        car2.dadosVeiculo();
        System.out.println(" ");
        Trator trat = new Trator("Traseira", 2017, "gasolina", 18, "Jonh Deere");
        trat.dadosVeiculo();
        
        
    }
}
