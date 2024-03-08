import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.print("Digite a idade da pessoa: ");
        idade = sc.nextInt();

        if (idade <= 13) {
            System.out.println("Criança");
        } else if (idade <= 18) {
            System.out.println("Adolescente");
        } else if (idade <= 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }
}
