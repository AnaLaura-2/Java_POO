package exe2_prof;

public class Cafeteira {
    private int agua, poCafe;
    private boolean ligada;
    public Cafeteira(){
        this.ligada = false;
        this.agua = 0;
        this.poCafe = 0;
    }

    public Cafeteira(int agua, int poCafe, boolean ligada){
        this.setAgua(agua); this.setPoCafe(poCafe);
        this.setLigada(ligada);
    }

    public void setAgua(int agua){
        if(agua >= 0 && agua <= 2000){
            this.agua = agua;
        } else {
            System.out.println("Valor da água inválido.");
        }
    }

    public void setPoCafe(int poCafe){
        if(poCafe >= 0 && poCafe <= 100){
            this.poCafe = poCafe;
        } else {
            System.out.println("Valor do pó de café inválido");
        }
    }

    public void setLigada(boolean ligada){
        this.ligada = ligada;
    }

    public int getAgua() {
        return agua;
    }

    public int getPoCafe() {
        return poCafe;
    }

    public boolean isLigada() {
        return ligada;
    }
    public void ligar(){
        if(!this.ligada){
            this.ligada = true;
        } else System.out.println("Já ligada"); // usa sem chave se tiver uma função(faz uma coisa só) só, se tiver mais que uma usa-se
    }

    public void desligar(){
        if(this.ligada){
            this.ligada = false;
        } else System.out.println("Já desligada");
    }

    public void adicionaAgua(int ml){
        if(this.ligada && ml > 0){
            this.setAgua(this.agua + ml);
        } else System.out.println("Cafeteira desligada");
    }

    public void adicionaCafe(int gramas){
        if(this.ligada && gramas > 0){
            this.setPoCafe(this.poCafe + gramas);
        } else System.out.println("Cafeteira desligada");
    }

    public void prepararCafe(){
        if(this.ligada && this.agua > 100 && this.poCafe >= 10){
            this.setAgua(this.agua - 100);
            this.setPoCafe(this.poCafe - 10);
        } else System.out.println("Problema para o preparo");
    }
    public void exibe(){
        System.out.println("Água: " + this.agua + "Pó de café: " + this.poCafe + "Ligada: " + (this.ligada ? "Sim": "Não"));
    }

    public void quantosCafesPossiveis(){
        int dosesAgua = this.agua / 100;
        int dosesCafe = this.poCafe / 10;
        int menor;
        if (dosesCafe < dosesAgua){
            menor = dosesCafe;
        }
        else menor = dosesAgua;
        // ou
        // menor = Math.min(dosesCafe, dosesAgua);
        System.out.println("Qtde de cafés possiveis " + menor);
    }
}