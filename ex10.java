import java.util.Scanner;
public class ex10 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numero = ler.nextInt();

        String resultado = (numero > 0) ? "positivo" :
         (numero < 0) ? "negativo" : "zero";

        System.out.println("Seu numero é "+resultado);
        ler.close();
    }
}
