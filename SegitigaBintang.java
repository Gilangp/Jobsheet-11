import java.util.Scanner;

public class SegitigaBintang {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
    
        System.out.print("Masukkan nilai N (min 5): ");
        int N = input13.nextInt();
        if (N < 5) {
            System.out.println("Nilai N min harus 5.");
        } else {
            for (int i = N; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}

