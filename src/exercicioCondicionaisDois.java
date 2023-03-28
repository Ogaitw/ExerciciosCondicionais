import java.util.Scanner;

public class exercicioCondicionaisDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Digite o Valor de Horas trabalhadas:");
        int horasTrabalhadas = scanner.nextInt();
        int maximoDeHoras = 50;
        int salarioBase = horasTrabalhadas*10;
        int horaExtra = (horasTrabalhadas - maximoDeHoras)*20;

        if (horasTrabalhadas > maximoDeHoras) {
            System.out.printf("A valor so seu salario é %d de e suas horas extras é de %d", salarioBase,horaExtra);
        } else {
            System.out.printf("O valor do seu salario é de %d, você recebo R$ 0,00 de hora extra", salarioBase);
        }

    }
}
