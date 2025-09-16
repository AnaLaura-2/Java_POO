package exe1;

public class Carro extends Veiculo{
    private int portas;

    public Carro(){
        super();
    }

    public Carro(String placa, String modelo, double valorBase, int portas) {
        super(placa, modelo, valorBase);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                super.toString() + "portas=" + portas +
                '}';
    }

    @Override //generate >> overide methods >> calcularImposto e mudar o return
    public double calcularImposto() {
        return this.valorBase * 0.03f; // f é para forçar o valor a ser float
    }
}