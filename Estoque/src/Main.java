import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estoque estoque = new Estoque();

        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();
        estoque.setNome(nome);

        System.out.println("Digite a quantidade atual do produto: ");
        int qtdAtual = sc.nextInt();
        estoque.setQtdAtual(qtdAtual);

        System.out.println("Digite a quantidade minima do produto: ");
        int qtdMinima = sc.nextInt();
        estoque.setQtdMinima(qtdMinima);
        estoque.precisaRepor();

        if(qtdAtual > qtdMinima){
            System.out.println("Digite a quantidade para dar baixa no estoque: ");
            int qtde = sc.nextInt();
            estoque.darBaixa(qtde);
            System.out.println(estoque.mostra());
            }




    }
}