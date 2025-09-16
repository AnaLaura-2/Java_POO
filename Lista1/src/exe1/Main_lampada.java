package exe1;

import java.util.Scanner;

public class Main_lampada {
    public static void main(String[] args) {
        // criar um objeto
        Lampada lamp1 = new Lampada();
        lamp1.marca = "Phillips";
        lamp1.cor = "Neutra";
        lamp1.ligada = false;
        lamp1.brilho = 0;

        System.out.println("Lâmpada");
        lamp1.exibe();

        lamp1.ligar();
        lamp1.ajustarBrilho(80);
        lamp1.mudarCor("Amarela");
        lamp1.exibe();

        lamp1.desligar();
        lamp1.exibe();

        // Criar com dados digitados
        Scanner entrada = new Scanner(System.in);
        Lampada lamp2 = new Lampada();

        System.out.println("Digite a marca da lâmpada: ");
        lamp2.marca = entrada.next();
        System.out.println("Digite a cor da lâmpada: ");
        lamp2.cor = entrada.next();
        System.out.println("A lâmpada está ligada? (digite true ou false): ");
        lamp2.ligada = entrada.nextBoolean();
        System.out.println("Digite o brilho de 0 a 100: ");
        lamp2.brilho = entrada.nextInt();
        if (lamp2.brilho < 0) lamp2.brilho = 0;
        if (lamp2.brilho > 100) lamp2.brilho = 100;

        System.out.println("Lâmpada 2");
        lamp2.exibe();

        //testar métodos
        lamp2.ligar();
        lamp2.ajustarBrilho(60);
        lamp2.mudarCor("Vermelho");
        lamp2.exibe();

        lamp2.desligar();
        lamp2.exibe();
    }
}