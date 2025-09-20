package exe_revisao;

public class Vendedor extends Funcionario {
    private double vendasMensais;

    public Vendedor(){
        super();
    }

    public Vendedor(String nome, String matricula, double salarioBase, double vendasMensais) {
        super(nome, matricula, salarioBase);
        this.vendasMensais = vendasMensais;
    }

    public double getVendasMensais() {
        return vendasMensais;
    }

    public void setVendasMensais(double vendasMensais) {
        this.vendasMensais = vendasMensais;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                super.toString() + "vendasMensais=" + vendasMensais +
                '}';
    }

    @Override
    public double calcularBonus() {
        return this.salarioBase + (this.vendasMensais * 0.02); // return this.salarioBase por que já estava declarado em
        // 0.5 no Funcionario
    }
}
