package exe2;

public class Cafeteira{
    private int nivelAgua;
    private int quantidadeCafe;
    private boolean status;

    // Construtor padrão
    public Cafeteira(){
        this.nivelAgua = 0;
        this.quantidadeCafe = 0;
        this.status = false;
    }

    // Construtor com parâmetros
    public Cafeteira(int agua, int cafe, boolean ligada){
        this.setNivelAgua(agua);
        this.setQuantidadeCafe(cafe);
        this.status = ligada;
    }

    // Getters
    public int getNivelAgua(){
        return nivelAgua;
    }

    public int getQuantidadeCafe(){
        return quantidadeCafe;
    }

    public boolean isLigada(){
        return status;
    }

    // Setters com validações
    public void setNivelAgua(int agua){
        if (agua >= 0 && agua <= 2000){
            this.nivelAgua = agua;
        } else{
            System.out.println("Valor de água fora do limite permitido.");
        }
    }

    public void setQuantidadeCafe(int cafe){
        if (cafe >= 0 && cafe <= 100){
            this.quantidadeCafe = cafe;
        } else {
            System.out.println("Valor de pó de café fora do limite permitido.");
        }
    }

    public void ligar(){
        status = true;
        System.out.println("Cafeteira ligada.");
    }

    public void desligar(){
        status = false;
        System.out.println("Cafeteira desligada.");
    }

    public void abastecerAgua(int ml){
        setNivelAgua(this.nivelAgua + ml);
    }

    public void abastecerCafe(int gramas){
        setQuantidadeCafe(this.quantidadeCafe + gramas);
    }

    public void fazerCafe(){
        if (!status){
            System.out.println("Não é possível preparar: a cafeteira está desligada.");
        } else if (nivelAgua < 100 || quantidadeCafe < 10){
            System.out.println("Falta de recursos: adicione mais água ou pó de café.");
        } else{
            setNivelAgua(this.nivelAgua - 100);
            setQuantidadeCafe(this.quantidadeCafe - 10);
            System.out.println("Café pronto!");
        }
    }

    public void mostrarStatus(){
        System.out.println("Água disponível: " + nivelAgua + " ml");
        System.out.println("Pó de café disponível: " + quantidadeCafe + " g");
        System.out.println("Estado: " + (status ? "Ligada" : "Desligada"));
        System.out.println("---------------------------");
    }

    public void calcularCafesPossiveis(){
        int porAgua = nivelAgua / 100;
        int porCafe = quantidadeCafe / 10;
        int possiveis = Math.min(porAgua, porCafe);
        System.out.println("Ainda é possível preparar " + possiveis + " cafés.");
    }
}