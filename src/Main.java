import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cadastro c1 = new Cadastro();
        System.out.println("Digite o nome do produto: ");
        c1.setNome(sc.next());
        System.out.println("Digite o código do produto: ");
        c1.setCodigo(sc.nextInt());
        System.out.println("Digite a quantidade do produto presente no estoque: ");
        c1.setQuantidade(sc.nextInt());
        System.out.println("O cliente deseja comprar: " + c1.getNome() + ". O código do poduto é: " + c1.getCodigo() + "\n" +
                "E a quantidade desejada é: " + c1.getQuantidade());

        System.out.println("O cliente deseja fazer uma venda? \n" +
                "Se desejar realizar a operação digite 1, se não desejar digite 0.");
        int escolha = sc.nextInt();
        switch (escolha){
            case 0:
                System.out.println("Encerrando o programa. Obrigada!");
                break;
            case 1:
                System.out.println("Qual a quantidade desejada para a venda? ");
                c1.setVenda(sc.nextInt());
                System.out.println("A quantidade desejada do produto é: " + c1.getVenda());
                c1.calculovenda();
                System.out.println("A quantidade que sobrou do estoque foi: " + c1.getVenda());
        }
    }
}