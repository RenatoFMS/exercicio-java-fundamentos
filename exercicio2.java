import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o lado do quadrado :");
        var lado = scanner.nextInt();
        var area = lado * lado;

        System.out.println("A area do quadrado é "+ area);

    }
}
