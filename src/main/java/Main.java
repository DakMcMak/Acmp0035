import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int account = scanner.nextInt();
            int[] count01 = new int[100];
            int[] count02 = new int[100];
            for (int i=0;i< account;i++){
                count01[i] = scanner.nextInt();
                count02[i] = scanner.nextInt();
            }
            for (int i=0;i<account;i++){
                System.out.println(19*count01[i] + (count02[i] + 239)*(count02[i] + 366) / 2);
            }
        }
    }
