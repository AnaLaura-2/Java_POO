import exe1.Caminhao;
import exe1.Carro;
import exe1.Moto;
import exe1.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class MainVeiculos {
    // pode chamar o metodo sem precisar de instancia do objeto
    public static void exibir(Veiculo veiculo){
        System.out.println(veiculo.toString()); // polimórfico
    }
    public static void main(String[] args) { //digita main e enter para aparecer isso
        Carro carro1 = new Carro("ESA1234", "Palio", 45000, 4);
        Moto moto1 = new Moto("FJB", "CG Titan", 50000, 160);
        Caminhao caminhao1 = new Caminhao("PWM3498", "Mercedez", 120000,6);
        exibir(carro1);
        exibir(moto1);
        exibir(caminhao1);
        // adicionar os veiculos no vetor(lista)
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(carro1);
        veiculos.add(moto1);
        veiculos.add(caminhao1);
        // calcula total de imposto pago
        double total = 0;
        for (Veiculo veiculo : veiculos) { //veiculo percorre cada veiculo do vetor
            total += veiculo.calcularImposto();
        }
        System.out.println("Total de imposto: " + Math.round(total));
    }
}