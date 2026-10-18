import java.util.Scanner;
public class task1 {
    public void main() {
        int M;
        Scanner sc = new Scanner(System.in);
        System.out.println("iveskite metus:");
        M = sc.nextInt();
        if (M >= 1896 && (M - 1896) % 4 == 0) {
            int number = (M - 1896) / 4 + 1;
            System.out.println("olimpiniu zaidiniu numeris " + number);
        }
        else {
            System.out.println("Ne olimpiniai metai");
        }
        sc.close();
    }
}



