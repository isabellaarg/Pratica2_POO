import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Ingresse o valor do investimento: ");
        double invInicial = sc.nextDouble();

        System.out.println("Ingresse a taxa do rendimento: ");
        double taxaDoInvestimento = sc.nextDouble();

        System.out.println("Ingresse o número de meses: ");
        int nroDeMeses = sc.nextInt();

        Calcula calcular = new Calcula(invInicial, taxaDoInvestimento, nroDeMeses);

        for (int i = 1; i < 12; i++){
            System.out.printf("Mes " + i +" R$ %.2f%n" , calcular.calcularEMostrar());
        }

    }
}