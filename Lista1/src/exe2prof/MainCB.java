package exe2prof;

import java.util.Scanner;

public class MainCB {
    public static void main(String[] args) {
        // cria objeto com construtor vazio
        ContaBancariaProf conta1 = new ContaBancariaProf();
        // cria objeto com construtor completo
        ContaBancariaProf conta2 = new ContaBancariaProf("Lázaro", "12345-6", 0, true);

        conta2.desativar();
        conta2.ativar();
        conta2.depositar(1000);
        conta2.sacar(600);
        conta2.exibe();

        ContaBancariaProf conta3 = new ContaBancariaProf("João", "123-4", 0, true);

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da transerência: ");
        double x  = sc.nextDouble();
        conta2.transferir(conta3, x);
    }
}
