package exe3;

public class CarroEletrico extends Veiculo implements Eletrico{

    public CarroEletrico(String modelo) {
        super(modelo);
    }

    @Override
    public void mover() {
        System.out.println("O carro elétrico está se movendo");
    }

    @Override
    public void carregarBateria() {
        System.out.println("Carregando a bateria do carro elétrico " + modelo);
    }
}
