import exe3.CarroEletrico;
import exe3.Eletrico;
import exe3.PatineteEletrico;
import exe3.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class MainVeiculo {
    public static void main(String[] args) {

        // Lista de veículos (polimorfismo)
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new CarroEletrico("Carro 1"));
        veiculos.add(new PatineteEletrico("Patinete 1"));

        System.out.println("Movendo os veículos");
        for (Veiculo v : veiculos) {
            v.exibirModelo();
            v.mover();
        }

        System.out.println("\nCarregando as baterias");
        for (Veiculo v : veiculos) {
            if (v instanceof Eletrico) {
                ((Eletrico) v).carregarBateria();
            }
        }
    }
}

