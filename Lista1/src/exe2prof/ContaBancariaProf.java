package exe2prof;

public class ContaBancariaProf {
    public String titular, numero;
    public double saldo;
    public boolean ativa;

    public ContaBancariaProf() {
    }

    public ContaBancariaProf(String titular, String numero, double saldo, boolean ativa) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        this.ativa = ativa;
    }

    public void exibe() {
        System.out.println("Titular: " + titular + "\nNumero: ****" + numero.substring(4) + "\nSaldo: " + saldo + "\nAtiva: " + ativa);
    }

    public void ativar(){
        if(!this.ativa){
            this.ativa = true;
        }
    }

    public void desativar(){
        if(this.ativa && this.saldo >= 0){
            this.ativa = false;
        }
    }

    public void depositar(double valor){
        if(valor > 0 && this.ativa){
            this.saldo += valor;
            System.out.println("Depositado com sucesso!");
        } System.out.println("Deposito falhou.");
    }

    public boolean sacar(double valor){
        if(valor > 0 && this.ativa && this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque realizado.");
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    public void transferir(ContaBancariaProf destino, double valor){
        if(this.sacar(valor)){ // tira da conta que chamou o metodo
            destino.depositar(valor); // insere na conta destino
        }
    }
}
