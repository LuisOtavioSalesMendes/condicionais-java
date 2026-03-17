import java.util.Scanner;
public class ex15 {
    public static void main(String[] args){
        int senha = 1234;
        String usuario = "luis";

        Scanner ler = new Scanner(System.in);

        System.out.println("Iforme o usuario: ");
        String u = ler.nextLine();

        System.out.println("Informe a senha: ");
        int s = ler.nextInt();

        String resultado = (u .equals(usuario) & s == senha) ? "Usuario e senha correto" : "Usuario e senha incorreto";

        System.out.println(resultado);
        ler.close();
    }
}
