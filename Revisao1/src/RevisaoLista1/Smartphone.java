package RevisaoLista1;

public class Smartphone {
    public String marca;
    public String modelo;
    public boolean ligado;
    public int bateria;
    public int volume;

    public Smartphone() {
    }

    public Smartphone(String marca, String modelo, boolean ligado, int bateria, int volume) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = ligado;
        this.bateria = bateria;
        this.volume = volume;
    }

    public void exibe(){
        System.out.println("Marca: " + this.marca + "\nModelo: " + this.modelo + "\nLigado: " + this.ligado + "\nBateria: " + this.bateria + "\nVolume: " + this.volume);
    }

    public void ligar(){
        if (!this.ligado && this.bateria > 0){
            this.ligado = true;
            System.out.println("Smartphone ligado");
        }else{
            System.out.println("Smartphone ja ligado ou bateria = 0");
        }
    }

    public void desligar(){
        if (this.ligado){
            this.ligado = false;
            this.volume = 0;
            System.out.println("Smartphone desligado");
        }else{
            System.out.println("Smartphone ja desligado");
        }
    }

    public void carregar(int valor){
        this.bateria += valor;
        if (this.bateria > 100){
            System.out.println("Smartphone com bateria completa");
            this.bateria = 100;
        }
        System.out.println("Bateria com carga = " + this.bateria);
    }

    public void ajustarVolume(int valor){
        if (this.ligado){
            this.volume += valor;
            if(this.volume > 100){
                System.out.println("volume maximo atingido = 100");
                this.volume = 100;
            }else if(this.volume < 0){
                System.out.println("volume minimo");
                this.volume = 1;
            }else{
                System.out.println("Volume ajustado para " + this.volume);
            }
        }else{
            System.out.println("smartphone desligado, não é possivel ajusta volume");
        }
    }

    public void usar(int minutos){
         if (this.bateria > 0){
             bateria -= minutos;
             if (this.bateria > 0){
                 System.out.println("Bateria em " + this.bateria);
             }else{
                 System.out.println("Bateria em 0, precisa de carga, desligando...");
                 this.ligado = false;
             }
         }else{
             System.out.println("Bateria vazia, não é possivel usar");
         }


    }
}
