import java.util.Scanner;
import java.util.Random;

public class ex20 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();

        System.out.println("0 Pedra, 1 Tesoura, 2 Papel");
        int jogadorP = leitor.nextInt();
        int JogadorM = gerador.nextInt(3);

        System.out.println("A maquina jogou " + JogadorM);

        if (jogadorP == JogadorM) {
            System.out.println("empatou");
        } else if ((jogadorP == 0 && JogadorM == 1) || 
        (jogadorP == 1 && JogadorM == 2) || 
        (jogadorP == 2 && JogadorM == 0)) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("Você perdeu!");
        }

        leitor.close();
    }
}
