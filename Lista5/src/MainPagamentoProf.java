import exe2_prof.CartaoCredito;
import exe2_prof.Pagamento;
import exe2_prof.Pix;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPagamentoProf {
    public static void main(String[] args) {

        ArrayList<Pagamento> pagamentos = new ArrayList<>();

        Pagamento cartaoCredito = new CartaoCredito();
        Pagamento pix = new Pix();
        Pagamento pix2 = new Pix();
        Pagamento cartaoCredito2 = new CartaoCredito();

        pagamentos.add(cartaoCredito);
        pagamentos.add(pix);
        pagamentos.add(pix2);
        pagamentos.add(cartaoCredito2);

        Scanner sc = new Scanner(System.in);
        for (Pagamento p : pagamentos) {
            System.out.println("Informe o valor da autorização: ");
            p.autorizar(sc.nextDouble());
        }
    }
}
