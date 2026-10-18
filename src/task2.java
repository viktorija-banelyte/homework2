import java.util.Scanner;
public class task2 {
    public void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("iveskite valanda,minute,sekunde: ");
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        s++;
        if (s == 60) {
            s = 0;
            m++;
        } if (m == 60) {
            m = 0;
            h++;
        } if (h == 24) {
            h = 0;
        }
        System.out.println("valandos,minutes,sekundes: " + h + ":" + m + ":" + s);
    }
}