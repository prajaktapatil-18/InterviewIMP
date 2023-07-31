package ImpQuestions;

public class MiniNumber {
    public static void main(String[] args){
        int a[] = {3,4,2,5,6, 1,4,6,9,7};


        int min = a.length;
        for (int i =0;i<a.length;i++){
            if (min>a[i]){
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
