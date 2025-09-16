import exe0.Ventilador;

public class Main{
    public static void main(String[] args){
        Ventilador obj1 = new Ventilador();
        obj1.setVelocidade(1);
        System.out.println("Velocidade de obj1 " + obj1.getVelocidade());

        Ventilador obj2 = new Ventilador();
        obj2.setVelocidade(9);
        System.out.println("Velocidade de obj2 " + obj2.getVelocidade());

        Ventilador obj3 = new Ventilador(6, true);
        System.out.println("Velocidade inicial de obj3: " + obj3.getVelocidade());
        obj3.acelerar();
        System.out.println("Velocidade de obj3 após acelerar: " + obj3.getVelocidade());
        obj3.frear();
        System.out.println("Velocidade de obj3 após frear: " + obj3.getVelocidade());
    }
}