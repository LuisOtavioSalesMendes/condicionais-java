import java.util.Scanner;

public class Teatro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char[][] sala1 = new char[12][12];
        char[][] sala2 = new char[12][12];

        for (int i = 0; i < 12; i++){
         for (int j= 0; j < 12; j++){
         sala1 [i][j] = 'L';
         sala2 [i][j] = 'L';
    
         }
        }

           int menu;

   do{
    System.out.println("\n1 - Reservar cadeira");
    System.out.println("2 - Comprar cadeira");
    System.out.println("3 - Cancelar");
    System.out.println("4 - mostrar cadeiras");
     System.out.println("0 - Encerra o programa");  

     menu = ler.nextInt(); 

      if (menu >= 1 && menu <= 4) {
                System.out.println("Escolha a sala:\n 1- Mudkip e o desafio do Wooper\n2- marshtomp e a resolução de Quagsire\n");
                int escolhaSala = ler.nextInt();

                char[][] salaEscolhida;

                if (escolhaSala == 1) {
    salaEscolhida = sala1;
} else if (escolhaSala == 2) {
    salaEscolhida = sala2;
} else {
    System.out.println("Sala inválida!");
    continue;
}
     //PARTE 1 DO MENUZÃO FERA D+
     if (menu == 1) {
                    System.out.println("Linha (A-L): ");
                    char linhaAL = ler.next().charAt(0);

                    System.out.println("Coluna (1-12): ");
                    int coluna112 = ler.nextInt();

                    linhaAL = Character.toUpperCase(linhaAL);
                    int linha = linhaAL - 'A';
                    int coluna = coluna112 - 1;

                    if (linha < 0 || linha >= 12 || coluna < 0 || coluna >= 12) {
                        System.out.println("Valores inválidos!");
                    } else {
                        if (salaEscolhida[linha][coluna] == 'L') {
                            salaEscolhida[linha][coluna] = 'R';
                            System.out.println("Reservado!");
                        } else {
                            System.out.println("Não pode reservar!");
                        }
                    }
                }
       //PARTE 1 DO MENUZÃO FERA D+



      //PARTE 2 DO MENUZÃO FERA D++
       if (menu == 2) {
                    System.out.println("Linha (A-L): ");
                    char linhaAL = ler.next().charAt(0);

                    System.out.println("Coluna (1-12): ");
                    int coluna112 = ler.nextInt();

                    linhaAL = Character.toUpperCase(linhaAL);
                    int linha = linhaAL - 'A';
                    int coluna = coluna112 - 1;

                    if (linha < 0 || linha >= 12 || coluna < 0 || coluna >= 12) {
                        System.out.println("Valores inválidos!");
                    } else {
                        if (salaEscolhida[linha][coluna] == 'L' || salaEscolhida[linha][coluna] == 'R') {
                            salaEscolhida[linha][coluna] = 'X';
                            System.out.println("Comprado!");
                        } else {
                            System.out.println("Já está ocupado!");
                        }
                    }
                } //PARTE 2 DO MENUZÃO FERA D++

          //PARTE 3 DO MENUZÃO FERA D++
      if (menu == 3) {
                    System.out.println("Linha (A-L): ");
                    char linhaAL = ler.next().charAt(0);

                    System.out.println("Coluna (1-12): ");
                    int coluna112 = ler.nextInt();

                    linhaAL = Character.toUpperCase(linhaAL);
                    int linha = linhaAL - 'A';
                    int coluna = coluna112 - 1;

                    if (linha < 0 || linha >= 12 || coluna < 0 || coluna >= 12) {
                        System.out.println("Valores inválidos!");
                    } else {
                        if (salaEscolhida[linha][coluna] == 'R') {
                            salaEscolhida[linha][coluna] = 'L';
                            System.out.println("Reserva cancelada!");
                        } else if (salaEscolhida[linha][coluna] == 'L') {
                            System.out.println("Nem estava reservado!");
                        } else {
                            System.out.println("Já está comprado!");
                        }
                    }
                }
//PARTE 3 DO MENUZÃO FERA D++



      //PARTE 4 DO MENUZÃO FERA D++
 if (menu == 4) {
                    System.out.println("\nMapa da sala:");

                    for (int i = 0; i < 12; i++) {
                        System.out.print((char) ('A' + i) + " ");

                        for (int j = 0; j < 12; j++) {
                            if (salaEscolhida[i][j] == 'L') System.out.print("[L] ");
                            else if (salaEscolhida[i][j] == 'R') System.out.print("[R] ");
                            else System.out.print("[X] ");
                        }

                        System.out.println();
                    }
                }
            }
            

        } while (menu != 0);

        ler.close();
    }
}