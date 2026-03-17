import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = leitor.nextInt();

        if (ano % 4 == 0) {
            if (ano % 100 != 0) {
                System.out.println(ano + " é bissexto");
            } else if (ano % 400 == 0) {
                System.out.println(ano + " é bissexto");
            } else {
                System.out.println(ano + " não é bissexto");
            }
        } else {
            System.out.println(ano + " não é bissexto");
        }

        leitor.close();
    }
}