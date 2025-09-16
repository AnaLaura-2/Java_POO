package exe1;

public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(){
        super();
    }

    public Caminhao(String placa, String modelo, double valorBase, int eixos) {
        super(placa, modelo, valorBase);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                super.toString() + "eixos=" + eixos + // colocar o super.toString
                '}';
    }

    @Override
    public double calcularImposto() {
        return (this.valorBase * 0.04f) + (500 * this.eixos);
    }
}
