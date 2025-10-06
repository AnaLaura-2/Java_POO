package exe3_prof;

public class CarroEletrico extends Veiculo implements Eletrico{

    public CarroEletrico(String modelo) {
        super(modelo);
    }

    @Override
    public void carregarBateria() {
        System.out.println("Carregando Bateria");
    }

    @Override
    public void mover() {
        System.out.println("Movendo carro elétrico...");
    }
}
