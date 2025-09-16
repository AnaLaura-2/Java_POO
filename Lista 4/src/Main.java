import exe0.Assistente;
import exe0.Diretor;
import exe0.Funcionario;
import exe0.Gerente;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void exibir(Funcionario funcionario){
        // o objeto funcionario vai executar o metodo toString() de qual classe ?
        // depende da classe que for passada como parametro
        // se for passado um assistente, executar toString() do assistente
        // se for passado um gerente, executar toString() do gerente
        // se for passado um diretor, executar toString() do diretor
        System.out.println(funcionario.toString());
    }

    public static void main(String[] args) {

        //Funcionario fu1 = new Funcionario();
        //fu1 vai ter um comportamento polimorfico

        Assistente as1 = new Assistente("Pedro", "Franca", "123.456.789-0", 2000, 3);
        exibir(as1);  // fu1 executa o toString() do assistente

        Gerente ge1 = new Gerente("Aline", "Franca", "5678", 4000, 1000);
        exibir(ge1);; // fu1 executa o toString() do gerente

        Diretor di1 = new Diretor("Carlos", "Franca", "8965", 5000, 1200);
        exibir(di1);;  // fu1 executa o toString() do diretor

        // cria um vetor de funcionario
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(as1);
        funcionarios.add(ge1);
        funcionarios.add(di1);
        // calcula folha de pagamento
        // percorre o vetor e soma os salarios
        double total = 0;
        for(Funcionario objFunc : funcionarios){
            total += objFunc.calculaSalario(); // objFunc é polimorfico
        }
        System.out.println("Total de salários " + total);
    }
}

