import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/* Dado um array de inteiros e um valor alvo, determine o número de pares entre os elementos
do array em que a sua diferença seja igual ao valor alvo. */
public class Desafio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalDePares = 0;

        System.out.print("Digite o tamanho da lista: ");
        Integer n = sc.nextInt();

        System.out.print("Digite o valor alvo: ");
        Integer k = sc.nextInt();

        List<Integer> lista = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "° valor da lista: ");
            int valor = sc.nextInt();
            lista.add(valor);
        }

        Integer atual = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            Integer proximo = lista.get(i);
            if (k.equals(proximo - atual)) {
                totalDePares++;
            }
            atual = proximo;
        }

        System.out.print("Total: " + totalDePares);

        sc.close();

    }

}