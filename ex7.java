import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Lado 1: ");
        int a = leitor.nextInt();

        System.out.print("Lado 2: ");
        int b = leitor.nextInt();

        System.out.print("Lado 3: ");
        int c = leitor.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.println("Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Isósceles");
            } else {
                System.out.println("Escaleno");
            }
        } else {
            System.out.println("Não é um triângulo");
        }

        leitor.close();
    }
}
