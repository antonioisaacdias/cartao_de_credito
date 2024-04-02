import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("########## Bem-vindo ao Cartão de Crédito ##########");
        Scanner scanner = new Scanner((System.in));
        System.out.println("Qual o limite do cartão de crédito? ");
        double limite = scanner.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);
        int i = 0;
        while (i != 3) {
            System.out.println("########## Menu de compras ##########");
            System.out.println("1. Realizar compra.");
            System.out.println("2. Ver transações.");
            System.out.println("3. Sair do sistema.");
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Insira o número de uma opção acima: ");
            int opcao = scanner1.nextInt();
            if (opcao == 1) {
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Qual a descrição da compra? ");
                String descricao = scanner2.nextLine();
                Scanner scanner3 = new Scanner(System.in);
                System.out.println("Qual o valor da compra? ");
                double valor = scanner3.nextDouble();
                Compra compra = new Compra(descricao, valor);
                cartao.lancaCompra(compra);
            } else if (opcao == 2) {
                cartao.exibirExtratoDeCompras();
            } else if (opcao == 3) {
                System.out.println("Até a próxima...");
                i = 3;
            }
        }
    }
}
