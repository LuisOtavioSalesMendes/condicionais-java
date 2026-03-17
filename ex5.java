import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        double n1 = leitor.nextDouble();

        System.out.print("Operação (+, -, *, /): ");
        char op = leitor.next().charAt(0);

        System.out.print("Segundo número: ");
        double n2 = leitor.nextDouble();

        switch (op) {
            case '+':
                System.out.println("Resultado: " + (n1 + n2));
                break;
            case '-':
                System.out.println("Resultado: " + (n1 - n2));
                break;
            case '*':
                System.out.println("Resultado: " + (n1 * n2));
                break;
            case '/':
                System.out.println("Resultado: " + (n1 / n2));
                break;
            default:
                System.out.println("Invalido");
        }

        leitor.close();
    }
}
