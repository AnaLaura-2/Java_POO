import RevisaoLista1.Smartphone;
import java.util.Scanner;

public class MainSmartphone_lista1 {
    public static void main(String[] args) {
        Smartphone sm1 = new Smartphone();
        sm1.marca = "iphone";
        sm1.modelo = "15";
        sm1.ligado = false;
        sm1.bateria = 10;
        sm1.volume = 0;

        //sm1 pode ser assim tambem
        //Smartphone sm1 = new Smartphone("iphone", "15", false, 10, 0)

        //valores sendo lidos digitando
        Smartphone sm2 = new Smartphone();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a marca do smartphone: ");
        sm2.marca = entrada.nextLine();
        System.out.println("Digite o modelo do smartphone: ");
        sm2.modelo = entrada.nextLine();
        System.out.println("Smartphone ligado(true/false): ");
        sm2.ligado = entrada.nextBoolean();
        System.out.println("Digite a bateria do smartphone: ");
        sm2.bateria = entrada.nextInt();
        System.out.println("Digite o valor do volume: ");
        sm2.volume = entrada.nextInt();

        sm1.exibe();
        sm2.exibe();

        sm1.carregar(80);

        //testando carregar mais qui 100
        sm1.carregar(30);

        sm1.ajustarVolume(50);
        sm1.ligar();
        sm1.ajustarVolume(50);

        //testando volume > 100
        sm1.ajustarVolume(150);

        //diminuindo volume
        sm1.ajustarVolume(-15);

        //testando volume < 0
        sm1.ajustarVolume(-120);

        sm1.usar(5);

        sm1.usar(95);
    }
}