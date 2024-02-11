import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Bir sayı giriniz (Programdan çıkmak için 0 giriniz): ");
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("Program sonlandırılıyor...");
                break; // Döngüden çık
            }

            int sum = 0;

            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }

            if (sum == number) {
                System.out.println(number + " mükemmel sayıdır.");
            } else {
                System.out.println(number + " mükemmel sayı değildir.");
            }
        }

        scanner.close();
    }
}
