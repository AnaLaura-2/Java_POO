package exe_revisao;

public class Gerente extends Funcionario{
    private int equipe;

    public Gerente(){
        super();
    }

    public Gerente(String nome, String matricula, double salarioBase, int equipe) { // usa-se o de baixo que já puxa os atributos
        // da classe pai
        super(nome, matricula, salarioBase);
        this.equipe = equipe;
    }

    public int getEquipe() {
        return equipe;
    }

    public void setEquipe(int equipe) {
        this.equipe = equipe;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                super.toString() + "equipe=" + equipe +
                '}';
    }

    @Override
    public double calcularBonus() {
        return this.salarioBase * 0.10 + (this.equipe * 100);
    }
}
