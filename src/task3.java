import java.util.Scanner;
public class task3 {
    public void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("iveskite metus");
        int year = sc.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("keliamieji metai");
        } else {
            System.out.println("Ne keliamieji metai");
        }
        sc.close();
    }
}