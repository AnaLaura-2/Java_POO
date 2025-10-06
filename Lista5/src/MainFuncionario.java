import exe1.Funcionario;
import exe1.FuncionarioCLT;
import exe1.FuncionarioPJ;
import java.util.ArrayList;
import java.util.List;

public class MainFuncionario {
    public static void main(String[] args) {

        FuncionarioCLT clt = new FuncionarioCLT("Ana", 3000);
        FuncionarioPJ pj = new FuncionarioPJ("Domingos", 3500);

        List<Funcionario> lista = new ArrayList<>();
        lista.add(clt);
        lista.add(pj);

        System.out.println(lista);
    }
}