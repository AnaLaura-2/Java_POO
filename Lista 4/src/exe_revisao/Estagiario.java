package exe_revisao;

public class Estagiario extends Funcionario{
    private int horasEstagio;

    public Estagiario(){
        super();
    }

    public Estagiario(String nome, String matricula, double salarioBase, int horasEstagio) {
        super(nome, matricula, salarioBase);
        this.horasEstagio = horasEstagio;
    }

    public int getHorasEstagio() {
        return horasEstagio;
    }

    public void setHorasEstagio(int horasEstagio) {
        this.horasEstagio = horasEstagio;
    }

    @Override
    public String toString() {
        return "Estagiario{" +
                super.toString() + "horasEstagio=" + horasEstagio +
                '}';
    }

    @Override
    public double calcularBonus() {
        return 300;
    }
}
