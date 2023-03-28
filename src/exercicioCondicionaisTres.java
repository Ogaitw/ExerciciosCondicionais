import java.util.Scanner;

public class exercicioCondicionaisTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Insira o primeiro número");
        int numeroUm = scanner.nextInt();
        System.out.println(" Insira o segundo número");
        int numeroDois = scanner.nextInt();
        System.out.println(" Insira o Terceiro número");
        int numeroTres = scanner.nextInt();
        System.out.println(" Insira o quarto número");
        int numerouatro = scanner.nextInt();

        double potenciaUm = Math.pow(numeroUm,2);
        double potenciaDois = Math.pow(numeroDois,2);
        double potenciaTres = Math.pow(numeroTres,2);
        double potenciaQuatro= Math.pow(numerouatro,2);

       if (potenciaTres > 1000) {
           System.out.println("O valor do Numero 3² é maior que 1000 o mesmo é de:" + potenciaTres);
       }else if (potenciaTres < 1000){
           System.out.printf("O valor do numero 1² é de:%.2f, o valor do numero 2² é de:%.2f, O valor do numero 3² é de:%.2f, O valor do numero 4² é de:%.2f ", potenciaUm,potenciaDois,potenciaTres,potenciaQuatro);
       }
    }
}
