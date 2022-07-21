import java.util.Scanner;

public class SelecaoDeIndiceVetor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] nomes = new String[5];

        for(int i = 0; i < nomes.length; i++) {
            nomes[i] = scan.nextLine();
        }

        int pos = scan.nextInt();
        System.out.println(nomes[pos]);
    }


}
