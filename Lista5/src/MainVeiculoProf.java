import exe3_prof.CarroEletrico;
import exe3_prof.Eletrico;
import exe3_prof.PatineteEletrico;
import exe3_prof.Veiculo;

import java.util.ArrayList;

public class MainVeiculoProf {
    public static void main(String[] args) {

        ArrayList<Veiculo> veiculos = new ArrayList<>();
        CarroEletrico ce = new CarroEletrico("Tesla");
        PatineteEletrico pe = new PatineteEletrico("PatElet");

        veiculos.add(ce);
        veiculos.add(pe);

        for(Veiculo v : veiculos){
            System.out.println(v.exibirModelo());
            v.mover();
            // cast é para conversão de tipos primitivos
            // coerção é para conversão de objetos (convertendo o veiculo para um elétrico)
            Eletrico aux = (Eletrico) v;
            aux.carregarBateria();
        }
    }
}
