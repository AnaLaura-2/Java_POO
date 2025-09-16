package exe2;

import java.util.Scanner;

public class MainConta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // conta1 com construtor vazio
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Ana";
        conta1.numero = "254874526";
        conta1.saldo = 5000;
        conta1.ativa = true;

        System.out.println("Conta Bancaria");
        conta1.exibe();

        // conta 2 com construtor completo
        ContaBancaria conta2 = new ContaBancaria("João", "59874251", 4500, true);

        System.out.println("Conta Bancaria 2");
        conta2.exibe();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor para depositar na conta 1: ");
        conta1.depositar((Double.parseDouble(sc.nextLine())));
        System.out.println("Digite o valor para sacar da conta 1: ");
        conta1.sacar((Double.parseDouble(sc.nextLine())));
        System.out.println("Digite o valor para transferir da conta 1 para a conta 2: ");
        conta1.transferir(conta2, Double.parseDouble(sc.nextLine()));

        //exibir estado final das contas
        System.out.println("\n Contas ao final: ");
        conta1.exibe();
        System.out.println("\n");
        conta2.exibe();
    }
}
