import java.util.Scanner;

public class exercicioCondicionaisQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Numero>");
        int numero = scanner.nextInt();
      if (numero %2==0 && numero > 0){
          System.out.println("O numero é par e Positivo");
      } else if (numero %2!=0 && numero > 0) {
          System.out.println("O numero é Impar e positivo");

      } else if (numero %2 ==0 && numero < 0) {
          System.out.println("O numero é par e Negativo");

      }
      else {
          System.out.println("O numero e Impar e Negativo");
      }
    }
}
