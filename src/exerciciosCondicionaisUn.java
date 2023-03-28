import java.util.Scanner;

public class exerciciosCondicionaisUn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println( "Digite o valor de peso de peixe, caso ultrapasse 50 kilos multa de 4 reais por quilo.");
        float P = scanner.nextFloat();
        int limiteQuilos = 50;
        float M = (P-limiteQuilos)*4;

        if (P>limiteQuilos) {
            System.out.println(" O valor da multa é " + M );

        } else {
            System.out.println("O Valor da multa é de R$ 0,00.");
        }

    }
}