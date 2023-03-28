import java.util.Scanner;

public class exercicioCondicionalNove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira seu peso:");
        float peso = scanner.nextFloat();
        System.out.println("Insira sua Altura:");
        float altura = scanner.nextFloat();
        double imc = peso / Math.pow(altura, 2);

        if (imc <= 18.4) {
            System.out.println(" Abaixo do Peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("No peso normal");
        } else if (imc>= 25 && imc<=30) {
            System.out.println("Peso normal");
        } else {
            System.out.println("Acima do Peso");
        }
    }
}