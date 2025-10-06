package exe3;

public abstract class Veiculo {
    protected String modelo;

    public Veiculo() {
    }

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public abstract void mover();

    public void exibirModelo(){
        System.out.println("Modelo: " + modelo);
    }
}
