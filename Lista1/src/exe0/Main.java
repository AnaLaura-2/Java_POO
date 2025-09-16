import exe0.Carro;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //cria um objeto de classe carro
        Carro obj1 = new Carro();
        obj1.marca = "Fiat";
        obj1.modelo = "Uno";
        obj1.ano = 2014;
        obj1.motor = true;
        obj1.velocidade = 50;

        obj1.exibe();
        obj1.desligar();
        obj1.exibe();
        obj1.ligar();
        obj1.acelerar(60);
        obj1.frear(20);
        obj1.exibe();

        //comando de saida

        //comando de entrada e criação de novo objeto
        Carro obj2 = new Carro();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a marca do carro: ");
        obj2.marca = entrada.next();
        System.out.println("Digite o modelo do carro: ");
        obj2.modelo = entrada.next();
        System.out.println("Digite o ano do carro: ");
        obj2.ano = entrada.nextInt();
        System.out.println("Digite o motor do carro: ");
        obj2.motor = entrada.nextBoolean();
        System.out.println("Digite o velocidade do carro: ");
        obj2.velocidade = entrada.nextFloat();

        obj2.exibe();

        // inicia o objeto utilizando o metodo construtor
        Carro obj3 = new Carro("VW", "Polo", 2022, true, 50);

        obj3.exibe();
    }
}
