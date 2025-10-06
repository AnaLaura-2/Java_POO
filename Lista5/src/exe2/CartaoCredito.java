package exe2;

public class CartaoCredito implements Pagamento{

    @Override
    public void autorizar(double valor) {
        System.out.println("Autorizado pagamento no cartão de crédito de R$ " + valor);
    }
}
