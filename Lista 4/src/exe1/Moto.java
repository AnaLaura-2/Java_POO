package exe1;

public class Moto extends Veiculo{
    private int cilindrada;

    public Moto(){
        super();
    }

    public Moto(String placa, String modelo, double valorBase, int cilindrada) {
        super(placa, modelo, valorBase);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto{" +
                super.toString() + "cilindrada=" + cilindrada + // colocar super.toString() + (para chamar o construtor dentro da classe pai)
                '}';
    }

    @Override
    public double calcularImposto() { // apaga o return super.calcularImposto e escreve essa condição
        if(this.cilindrada <= 250){
            return this.valorBase * 0.01f;
        } else {
            return super.calcularImposto();
        }
    }
}
