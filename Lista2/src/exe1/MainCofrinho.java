package exe1;

public class MainCofrinho {
    public static void main(String[] args) {
        // Cofrinho 1 - construtor vazio
        Cofrinho obj1 = new Cofrinho();
        obj1.abrir();
        obj1.depositar(50);
        System.out.println("Saldo de obj1 " + obj1.getSaldo());
        obj1.retirarTudo();
        System.out.println("Saldo de obj1 " + obj1.getSaldo());

        // Cofrinho 2 - construtor vazio + fechar
        Cofrinho obj2 = new Cofrinho();
        obj2.fechar();
        obj2.depositar(100); // não vai funcionar porque está fechado
        System.out.println("Saldo de obj2 " + obj2.getSaldo());

        // Cofrinho 3 - construtor completo
        Cofrinho obj3 = new Cofrinho(200, false);
        obj3.depositar(50);
        obj3.retirarTudo();
        System.out.println("Saldo de obj3 " + obj3.getSaldo());
    }
}
