import java.util.Scanner;

/* A sua impressora foi infectada por um vírus e está imprimindo de forma incorreta. Depois
de olhar para várias páginas impressas por um tempo, você percebe que ele está
imprimindo cada linha de dentro para fora. Em outras palavras, a metade esquerda de cada
linha está sendo impressa a partir do meio da página até a margem esquerda. Do mesmo
modo, a metade direita de cada linha está sendo impressa à partir da margem direita e
prosseguindo em direção ao centro da página.

Por exemplo a linha:
THIS LINE IS GIBBERISH
está sendo impressa como:
I ENIL SIHTHSIREBBIG S

Da mesma forma, a linha " MANGOS " está sendo impressa incorretamente como
"NAM SOG". Sua tarefa é desembaralhar (decifrar) a string a partir da forma como ela foi
impressa para a sua forma original. Você pode assumir que cada linha conterá um número
par de caracteres. */
public class Desafio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero de linhas: ");
        int linhas = sc.nextInt();

        for (int i = 0; i < linhas; i++) {
            System.out.println("Digite a " + (i+1) + "° frase:");
            String frase = readLine(sc);

            StringBuilder parte1 = new StringBuilder(frase.substring(0, frase.length() / 2));
            StringBuilder parte2 = new StringBuilder(frase.substring(frase.length() / 2, frase.length()));
            parte1.reverse();
            parte2.reverse();
            System.out.println(parte1.toString() + parte2.toString());
        }
    }

    public static String readLine(Scanner leitor) {
        String line = leitor.nextLine();
        while (line.isEmpty())
            line = leitor.nextLine();
        return line;
    }

}