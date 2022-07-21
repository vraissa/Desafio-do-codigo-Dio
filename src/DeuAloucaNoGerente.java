import java.util.Scanner;

public class DeuAloucaNoGerente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int desconto = scan.nextInt();
        int precoAntigo = scan.nextInt();

        int precoNovo = precoAntigo - ((precoAntigo * desconto) / 100);
        System.out.println(precoNovo);

    }
}
