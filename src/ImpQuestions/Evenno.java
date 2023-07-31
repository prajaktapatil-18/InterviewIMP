package ImpQuestions;


import java.util.Scanner;

public class Evenno {
    public static void main(String [ ] args){
        Scanner scan =new Scanner(System.in);
        int num = scan.nextInt();
        if (num %2==0){
            System.out.println( num + " is even number");
        }else {
            System.out.println(num + " is not even this is odd number");
        }


       String revers =" ";
        String name = scan.nextLine();

        for (int i=name.length()-1;i>=0;i--){
            revers = revers + name.charAt(i);
            System.out.println(revers);
        }
    }
}
