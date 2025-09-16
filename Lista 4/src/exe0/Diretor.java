package exe0;

public class Diretor extends Funcionario{
    private double acoesEmpresa;

    public Diretor(){
        super();
    }

    public Diretor(String nome, String endereco, String cpf, double salario, double acoesEmpresa) {
        super(nome, endereco, cpf, salario);
        this.acoesEmpresa = acoesEmpresa;
    }

    public double getAcoesEmpresa() {
        return acoesEmpresa;
    }

    public void setAcoesEmpresa(double acoesEmpresa) {
        this.acoesEmpresa = acoesEmpresa;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                super.toString() + "acoesEmpresa=" + acoesEmpresa +
                '}';
    }

    @Override
    public double calculaSalario(){
        return super.calculaSalario() + Math.round((this.acoesEmpresa * 3.14f) / 12);
    }
}
