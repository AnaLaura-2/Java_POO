package exe2_prof;

public class Pix implements Pagamento{

    @Override
    public void autorizar(double valor) {
        System.out.println("Autorizado pagamento via Pix no valor de R$" + valor);
    }
}
