package exe3;

public class PatineteEletrico extends Veiculo implements Eletrico {

    public PatineteEletrico(String modelo) {
        super(modelo);
    }

    @Override
    public void mover() {
        System.out.println("O patinete elétrico está se movendo");
    }

    @Override
    public void carregarBateria() {
        System.out.println("Carregando a bateria do patinete elétrico " + modelo);
    }
}

