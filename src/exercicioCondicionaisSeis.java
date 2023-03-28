import java.util.Scanner;

public class exercicioCondicionaisSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade:");
        int idade = scanner.nextInt();
        if (idade< 5) {
            System.out.println("SO aceitamos nadadore apartir de 5 anos");
        } else if (idade >=5 && idade <=7) {
                System.out.println("Infantil A");
        } else if (idade >= 8 && idade < 11) {
            System.out.println("infantil B");
            
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Juvenil A");

        } else if (idade >=14 && idade<=17){
            System.out.println("Juvenil B");
        }
        else {
            System.out.println(" Adulto");
        }


    }
}
