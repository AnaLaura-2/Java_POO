import exe_revisao.Estagiario;
import exe_revisao.Funcionario;
import exe_revisao.Gerente;
import exe_revisao.Vendedor;

import java.util.ArrayList;
import java.util.List;

public class MainRevisao {
    public static void exibir(Funcionario funcionario) { // cria esse depois do public static void main
        System.out.println(funcionario.toString());
    }

    public static void main(String[] args) {
        Gerente ge1 = new Gerente("Douglas", "abcd", 1500, 10);
        Vendedor ve1 = new Vendedor("Pedro Henrique", "defg", 800, 25);
        Estagiario es1 = new Estagiario("João Pedro", "erfd", 500, 6);

        exibir(ge1);
        exibir(ve1);
        exibir(es1);

        //armazenando funcionarios em uma lista
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(ge1);
        funcionarios.add(ve1);
        funcionarios.add(es1);

        // percorrendo a lista e calculando o total bonificação
        double total = 0;
        for (Funcionario funcionario : funcionarios) { // os dois primeiros vem da exibir do mainRevisao
            // funcionarios é o nome que esta na lista
            total += funcionario.calcularBonus();
        }

        System.out.println("Total: " + total);
    }
}
