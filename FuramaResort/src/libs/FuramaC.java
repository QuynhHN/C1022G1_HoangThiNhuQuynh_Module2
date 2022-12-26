package libs;

import java.util.Scanner;

public class FuramaC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmplC emplC = new EmplC();
        int i = Integer.parseInt(sc.nextLine());

        switch (i) {
            case 1:
                emplC.display();
                break;
            default:

        }
    }
}
