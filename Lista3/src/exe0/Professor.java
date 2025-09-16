package exe0;

public class Professor {
    private String nome, titulacao;
    private Departamento departamento;

    public Professor(){
    }

    public Professor(String nome, String titulacao, Departamento departamento){
        this.nome = nome;
        this.titulacao = titulacao;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", titulacao='" + titulacao + '\'' +
                ", departamento=" + departamento +
                '}';
    }
}
