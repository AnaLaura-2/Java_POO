package exe1_prof;


public class Cofrinho_prof {
    private double saldo;
    private boolean fechado;

    public Cofrinho_prof() {
        this.saldo = 0;
        this.fechado = false;
    }

    public Cofrinho_prof(double saldo, boolean fechado) {
        this.setSaldo(saldo);
        this.fechado = fechado;
    }
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    public double getSaldo() {
        return this.saldo;
    }
    public boolean getFechado() {
        return this.fechado;
    }
    public void abrir(){
        if(this.fechado){
            this.fechado = false; //abre
        } else {
            System.out.println("Cofrinho já está aberto");
        }
    }
    public void fechar(){
        if(!this.fechado){
            this.fechado = true;
        } else {
            System.out.println("Cofrinho já está fechado");
        }
    }
    public void depositar(double valor){
        if(!this.fechado && valor > 0){
            this.setSaldo(this.saldo + valor);
        } else {
            System.out.println("Deposito inválido");
        }
    }
    public void retirarTudo(){
        if(!this.fechado && this.saldo > 0){
            double aux = this.saldo;
            this.setSaldo(0);
            System.out.println("Valor retirado " + aux);
        } else {
            System.out.println("Não foi possível zerar o cofrinho");
        }
    }
    public void exibe(){
        System.out.println("Saldo: " + this.getSaldo() + "\nFechado: " + (this.fechado ? "Sim": "Não"));
    }
}
