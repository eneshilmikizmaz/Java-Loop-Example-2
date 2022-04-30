import java.util.Scanner;

public class ExponentCalculater {
    public void calc() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz = ");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            int j = i;
            int cacheFour = 1;
            int cacheFive = 1;
            while (j > 0) {
                cacheFour *= 4;
                cacheFive *= 5;
                j--;

            }
            System.out.println("4^" + i + " = " + cacheFour + " || " + "5^" + i + " = " + cacheFive);
        }
    }
}
