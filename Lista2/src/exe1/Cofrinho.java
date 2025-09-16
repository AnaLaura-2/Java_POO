package exe1;

public class Cofrinho {
    private double saldo;
    private boolean fechado;

    // Construtor vazio
    public Cofrinho(){
        this.saldo = 0;
        this.fechado = false;
    }

    // Construtor completo
    public Cofrinho(double saldo, boolean fechado){
        this.setSaldo(saldo);
        this.setFechado(fechado);
    }

    // Get e Set do saldo
    public double getSaldo(){
        return this.saldo;
    }

    private void setSaldo(double valor){
        if (valor >= 0) {
            this.saldo = valor;
        } else {
            this.saldo = 0;
        }
    }

    // Get e Set do estado fechado
    public boolean isFechado(){
        return this.fechado;
    }

    public void setFechado(boolean fechado){
        this.fechado = fechado;
    }

    // Métodos de instância
    public void depositar(double valor){
        if (!this.fechado && valor > 0){
            this.setSaldo(this.saldo + valor);
            System.out.println("Depósito de R$" + valor + " realizado.");
        } else {
            System.out.println("Depósito inválido.");
        }
    }

    public void retirarTudo(){
        if (!this.fechado){
            System.out.println("Retirado: R$" + this.saldo);
            this.setSaldo(0);
        } else {
            System.out.println("Cofrinho fechado, não é possível retirar.");
        }
    }

    public void abrir(){
        this.fechado = false;
    }

    public void fechar(){
        this.fechado = true;
    }
}

