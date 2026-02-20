import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho da base do retangulo:");
        var base = scanner.nextInt();
        System.out.println("Digite o tamanho da altura do retangulo:");
        var altura = scanner.nextInt();
        var area = base * altura;

        System.out.println("A area do retangulo é "+ area);

    }
}
