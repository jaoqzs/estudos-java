import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumero = sc.nextInt();
        System.out.println("A soma dos números é: " + (primeiroNumero + segundoNumero));

        sc.close();
    }
}