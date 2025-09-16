import exe2.Cafeteira;

public class MainCafeteira {
    public static void main(String[] args){
        Cafeteira obj1 = new Cafeteira();
        obj1.abastecerAgua(1000);
        obj1.abastecerCafe(60);
        obj1.mostrarStatus();
        obj1.fazerCafe();
        obj1.ligar();
        obj1.fazerCafe();
        obj1.mostrarStatus();
        obj1.calcularCafesPossiveis();

        System.out.println("-".repeat(80));
        Cafeteira obj2 = new Cafeteira();
        obj2.abastecerCafe(300);
        obj2.abastecerAgua(-10);

        System.out.println("-".repeat(80));
        Cafeteira obj3 = new Cafeteira();
        obj3.abastecerAgua(80);
        obj3.abastecerCafe(100);
        obj3.ligar();
        obj3.mostrarStatus();
        obj3.fazerCafe();
        obj3.abastecerAgua(300);
        obj3.mostrarStatus();
        obj3.calcularCafesPossiveis();
    }
}