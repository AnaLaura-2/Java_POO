import exe0.Departamento;
import exe0.Professor;

public class MainAcademico {
    public static void main(String[] args) {
        Departamento depObj1 = new Departamento("Análises e Desenvolvimento de Sistemas", "ADS");

        Professor profObj1 = new Professor("Jaqueline", "Doutora", depObj1);

        Professor profObj2 = new Professor();
        profObj2.setNome("Carlão");
        profObj2.setTitulacao("Mestre");
        profObj2.setDepartamento(depObj1);

        System.out.println(depObj1.toString());
        System.out.println(profObj1.toString());
        System.out.println(profObj2.toString());
    }
}