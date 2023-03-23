import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digte quantas linhas da pirâmide: ");
        int x = sc.nextInt();
        System.out.println("");
        String piramide = "";
        for (int i = 1; i < x+1; i++) {
            for (int j = 0; j < i; j++) {
                piramide += String.valueOf(i);
            }
            piramide += "\n";
        }
        System.out.println(piramide);
    }
}
