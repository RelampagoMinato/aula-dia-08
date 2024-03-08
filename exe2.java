import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2;

        System.out.print("Digite o primeiro valor: ");
        valor1 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        valor2 = sc.nextInt();

        if (valor1 == valor2) {
            System.out.println("Os valores são iguais.");
        } else if (valor1 < valor2) {
            System.out.println("O menor valor é: " + valor1);
            System.out.println("O maior valor é: " + valor2);
        } else {
            System.out.println("O menor valor é: " + valor2);
            System.out.println("O maior valor é: " + valor1);
        }
    }
}
