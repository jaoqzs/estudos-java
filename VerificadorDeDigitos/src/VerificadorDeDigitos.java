import java.util.Scanner;

public class VerificadorDeDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int numero = sc.nextInt();
        int digitos = String.valueOf(Math.abs(numero)).length();

        if (digitos == 1) {
            System.out.println("O número tem 1 digito");
        } else if (digitos == 2) {
            System.out.println("O número tem 2 digitos");
        } else if (digitos == 3) {
            System.out.println("O número tem 3 digitos");
        } else if (digitos == 4) {
            System.out.println("O número tem 4 digitos");
        } else {
            System.out.println("O número tem 5 digitos ou mais");
        }
        sc.close();
    }
}