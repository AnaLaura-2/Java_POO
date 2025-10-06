package exe2;

public class Pix implements Pagamento{

    @Override
    public void autorizar(double valor) {
        System.out.println("Autorizado pagamento via PIX de R$ " + valor);
    }
}
