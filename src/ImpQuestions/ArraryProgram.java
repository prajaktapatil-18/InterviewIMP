package ImpQuestions;

public class ArraryProgram {
    public static void main(String[] args) {
        int max = 0;
        int arr[] = {45, 33, 2, 4, 4, 2};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];

                System.out.println("max value in array is " + max);

            }

        }
    }}