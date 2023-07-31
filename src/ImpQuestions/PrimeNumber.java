package ImpQuestions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                count++;
            }
        }

        if (count >= 1){
            System.out.println("Number not is prime");
        }else {
            System.out.println("Number is prime");
        }
    }
}