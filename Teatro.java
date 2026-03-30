import java.util.Scanner;

public class Teatro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char[][] sala1 = new char[12][12];
        char[][] sala2 = new char[12][12];
        String nomeSala1 = "Mudkip e o desafio do Wooper";
        String nomeSala2 = "marshtomp e a resolução de Quagsire";

        double precoSala1 = 100;
        double precoSala2 = 120;
        String[] nomedasalachefe = new String[10];
double[] valorext = new double[10];
char[][][] nvsalas = new char[10][12][12];

int Salaext = 0;

        
        for (int i = 0; i < 12; i++){
         for (int j= 0; j < 12; j++){
         sala1 [i][j] = 'L';
         sala2 [i][j] = 'L';
    
         }
        }

           int menu;

   do{
    System.out.println("1 - Reservar cadeira");
    System.out.println("2 - Comprar cadeira");
    System.out.println("3 - Cancelar");
    System.out.println("4 - mostra as cadeiras");
    System.out.println("5 - relatorio");
    System.out.println("6 - cadastrar sala");
    System.out.println("0 - fecha o programa");  

     menu = ler.nextInt(); 

      if (menu >= 1 && menu <= 5) {
       System.out.println("Escolha o filme");

System.out.println("1 - " + nomeSala1 + "  Preço: " + precoSala1);
System.out.println("2 - " + nomeSala2 + "  Preço: " + precoSala2);

for (int i = 0; i < Salaext; i++) {
    System.out.println((i + 3) + " - " + nomedasalachefe[i] + "  Preço: " + valorext[i]);
}

    int Slaescolheai = ler.nextInt();

                char[][] salaEscolhida;
            double precoSalaEscolhida = 0;

if (Slaescolheai == 1) {
    salaEscolhida = sala1;
    precoSalaEscolhida = precoSala1;

} else if (Slaescolheai == 2) {
    salaEscolhida = sala2;
    precoSalaEscolhida = precoSala2;

} else if (Slaescolheai >= 3 && Slaescolheai < 3 + Salaext) {

    int indice = Slaescolheai - 3;

    salaEscolhida = nvsalas[indice];
    precoSalaEscolhida = valorext[indice];

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
                            System.out.println("Você pagou " + (precoSalaEscolhida / 2) + " para reservar essa cadeira");
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
                            System.out.println("Você pagou " + precoSalaEscolhida + " para pegar esta cadeira");
                        } else {
                            System.out.println("Já está ocupado!");
                        }
                    }
                } //PARTE 2 DO MENUZÃO FERA D++

          //PARTE 3 DO MENUZÃO FERA D+++
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
                            System.out.println("não estava reservado");
                        } else {
                            System.out.println("ja esta comprado");
                        }
                    }
                }
//PARTE 3 DO MENUZÃO FERA D+++



      //PARTE 4 DO MENUZÃO FERA D++++
 if (menu == 4) {
                    System.out.println("\nMapa da sala:");
                      
                         System.out.print("   1   2   3   4   5   6   7   8   9   10  11  12");
    System.out.println();

                    for (int i = 0; i < 12; i++) {
                        System.out.print((char) ('A' + i) + " ");

                        for (int j = 0; j < 12; j++) {
                            if (salaEscolhida[i][j] == 'L') System.out.print("[L] ");
                            else if (salaEscolhida[i][j] == 'R') System.out.print("[R] ");
                            else System.out.print("[X] ");
                        }

                        System.out.println();
                    }
                } //PARTE 4 DO MENUZÃO FERA D++++

                  //PARTE 5 DO MENUZÃO FERA D+++++
if (menu == 5) {
    int livres = 0, reservadas = 0, Compradas = 0;

    for (int i = 0; i < 12; i++) {
        for (int j = 0; j < 12; j++) {
            if (salaEscolhida[i][j] == 'L') livres++;
            else if (salaEscolhida[i][j] == 'R') reservadas++;
            else if (salaEscolhida[i][j] == 'X') Compradas++;
        }
    }

    System.out.println("Livres: " + livres);
    System.out.println("Reservadas: " + reservadas);
    System.out.println("Compradas: " + Compradas);
    System.out.println("Arrecadado: " + (Compradas * precoSalaEscolhida));
    System.out.println("Em reservas: " + (reservadas * (precoSalaEscolhida / 2)));
    System.out.println("Se tudo for vendido: " + ((Compradas + reservadas + livres) * precoSalaEscolhida));

} //PARTE 5 DO MENUZÃO FERA D+++++

            }
                           //PARTE 6 DO MENUZÃO FERA D++++++
                if (menu == 6) {
    System.out.print("Nome da nova sala: ");
    nomedasalachefe[Salaext] = ler.next();

    System.out.print("Preço da sala: ");
    valorext[Salaext] = ler.nextDouble();

    for (int i = 0; i < 12; i++) {
        for (int j = 0; j < 12; j++) {
            nvsalas[Salaext][i][j] = 'L';
        }
    }

    Salaext++;
    System.out.println("Sala criada com sucesso!");
} //PARTE 6 DO MENUZÃO FERA D++++++
        } while (menu != 0);

        ler.close();
    }
}
