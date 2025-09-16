package exe0;

// A classe é filha de Funcionario
public class Assistente extends Funcionario{
    private double horaExtra;

    public Assistente(){
        super();
    }

    public Assistente(String nome, String endereco, String cpf, double salario, double horaExtra) {
        // Chama construtor com parâmetros da superclasse
        super(nome, endereco, cpf, salario);
        this.horaExtra = horaExtra;
    }

    public double getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(double horaExtra) {
        this.horaExtra = horaExtra;
    }

    @Override
    public String toString() {
        return "Assistente{" +
                super.toString() + "horaExtra=" + horaExtra +
                '}';
    }

    @Override
    public double calculaSalario() {
        return (this.salario + this.horaExtra * 50);
    }
}
