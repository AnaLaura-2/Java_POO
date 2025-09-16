package exe2;

public class ContaBancaria {
    // variaveis
    public String titular;
    public String numero;
    public double saldo;
    public boolean ativa;

    //construtor vazio
    public ContaBancaria(){

    }

    //construtor completo
    public ContaBancaria(String titular, String numero, double saldo, boolean ativa) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        this.ativa = ativa;
    }

    //metodos
    public void exibe(){
        String numMasc = "****" + this.numero.substring(this.numero.length() - 4);
        System.out.println("Titular: " + this.titular + "\nNúmero: " + numMasc + "\nSaldo: " + this.saldo + "\nAtiva: " + this.ativa);
    }

    public void ativar(){
        this.ativa = true;
    }

    public void desativar(){
        if(this.saldo >= 0){
            this.ativa = false;
        } else {
            System.out.println("Saldo insuficiente para desativação.");
        }
    }

    public void depositar(double valor){
        if(this.ativa && valor >= 0){
            this.saldo += valor;
        } else {
            System.out.println("Depósito inválido (conta inativa ou saldo insuficiente.");
        }
    }

    public  void sacar(double valor){
        if(this.ativa && valor > 0 && valor <= this.saldo){
            this.saldo -= valor;
        } else {
            System.out.println("Saque inválido (conta inativa ou saldo insuficiente.");
        }
    }

    public void transferir(ContaBancaria destino, double valor){
        if(this.ativa && destino.ativa && valor >=0 && valor <= this.saldo){
            this.sacar(valor);
            destino.depositar(valor);
        }
    }


}
