import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         var scanner = new Scanner(System.in);
         System.out.println("Digite o seu nome:");
         var nome = scanner.next();
         System.out.println("Digite o ano em que voce nasceu:");
         var ano = scanner.nextInt();

         var idade = 2026 - ano;

         System.out.println("Olá " + nome +" vocẽ tem "+ idade +" anos");
        }
    }
