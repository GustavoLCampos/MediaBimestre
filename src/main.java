import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as notas referentes a cada bimestre: ");

        double b1 = sc.nextDouble();
        double b2 = sc.nextDouble();
        double b3 = sc.nextDouble();
        double b4 = sc.nextDouble();

        double media;

        media = (b1+b2+b3+b4)/4;

        System.out.println("A média é: " + media);

    }


}
