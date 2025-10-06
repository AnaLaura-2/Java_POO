package exe2_prof;

public class CartaoCredito implements Pagamento {

    @Override
    public void autorizar(double valor) {
        System.out.println("Autorizado pagamento no cartão de credito de R$" + valor);
    }
}
