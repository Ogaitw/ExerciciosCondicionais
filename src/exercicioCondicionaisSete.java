import java.util.Scanner;

public class exercicioCondicionaisSete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Digita a idade:");
        int idade = scanner.nextInt();
        if (idade< 18 || idade > 79 ) {
            System.out.println(" Digite uma idade entre 18 e 70 anos");
        } else {
            System.out.println(" DIgite o Grupo de Risco:\n 1- Baixo \n 2- Medio \n 3- Alto");
            int risco = scanner.nextInt();

            if (idade >= 18 && idade <= 24 && risco == 1) {
                System.out.println("Seu Codigo: 7");
            } else if (idade >= 18 && idade <= 24 && risco == 2) {
                System.out.println("Seu Codigo: 8");
            } else if (idade >= 18 && idade <= 24 && risco == 3) {
                System.out.println("Seu Codigo: 9");
            } else if (idade >= 25 && idade <= 40 && risco == 1) {
                System.out.println("Seu Codigo: 4");
            } else if (idade >= 25 && idade <= 40 && risco == 2) {
                System.out.println("Seu Codigo: 5");
            } else if (idade >= 25 && idade <= 40 && risco == 3) {
                System.out.println("Seu Codigo: 6");
            } else if (idade >= 41 && idade <= 70 && risco == 1) {
                System.out.println("Seu Codigo: 1");
            } else if (idade >= 41 && idade <= 70 && risco == 2) {
                System.out.println("Seu Codigo: 2");
            } else if (idade >= 41 && idade <= 70 && risco == 3) {
                System.out.println("Seu Codigo: 3");
            }
        }
    }
}
