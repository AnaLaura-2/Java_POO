package exe1;

public class Lampada {
    //variaveis
    public boolean ligada;
    public int brilho;
    public String cor;
    public String marca;

    //construtor vazio
    public Lampada(){

    }

    //construtor completo
    public Lampada(String marca, String cor, boolean ligada, int brilho){
        this.marca = marca;
        this.cor = cor;
        this.ligada = ligada;
        this.brilho = brilho;
    }
    // metodos de instancia
    public void exibe(){
        // this representa o objeto que chama o metodo
        System.out.println("Marca:" + this.marca + "\nCor: " + this.cor + "\nLigada: " +  this.ligada + "\nBrilho: " + this.brilho);
    }
    public void ligar(){
        if(!this.ligada){
            this.ligada = true;
        }
    }

    public void desligar(){
        if(this.ligada){
            this.ligada = false;
            this.brilho = 0;
        }
    }
    public void ajustarBrilho(int valor){
        if (this.ligada){
            if(valor < 0){
                this.brilho = 0;
            } else if (valor > 100){
                this.brilho = 100;
            } else {
                this.brilho = valor;
            }
        } else {
            System.out.println("Não é possível ajustar brilho com a lampâda desligada.");
        }
    }
    public void mudarCor(String novaCor){
        if (this.ligada){
            this.cor = novaCor;
        }
    }
}