import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/* Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor
monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor
pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas
possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas
necessárias. */
public class Desafio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        double valor = sc.nextDouble();

        List<Integer> notas = Arrays.asList(100, 50, 20, 10, 5, 2);
        List<Double> moedas = Arrays.asList(1.0, 0.50, 0.25, 0.10, 0.05, 0.01);

        int qNotas;

        System.out.println("Notas:");
        for (Integer nota : notas) {
            qNotas = (int) (valor / nota);
            System.out.println(qNotas + " nota(s) de R$ " + nota.doubleValue());
            valor -= qNotas * nota;
        }

        System.out.println("MOEDAS:");
        for (Double moeda : moedas) {
            qNotas = (int) (valor / moeda);
            System.out.println(qNotas + " nota(s) de R$ " + moeda);
            valor -= qNotas * moeda;
        }

        sc.close();

    }

}