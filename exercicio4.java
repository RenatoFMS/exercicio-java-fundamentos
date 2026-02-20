import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Qual a idade da primeira pessoa?");
        var idade1 = scanner.nextInt();
        System.out.println("Qual a idade da segunda pessoa?");
        var idade2 = scanner.nextInt();
        var diferencaIdade = 0;

        if (idade2 <= idade1){
            diferencaIdade = idade1 - idade2;
        }
        else{
            diferencaIdade =idade2 - idade1;
        }

        System.out.println("A diferença de idade é "+ diferencaIdade);

    }
}
