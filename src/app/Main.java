package app;

public class Main {
    public static void main(String[] args) {

        int [] num = {1,2,3,4,5,6};
        int sum = 0;
        int count=0;

        for ( int n : num){

            sum += n;
            count++;
            System.out.println( count + ") Num is " + n + " sum is " + sum);

        }
        System.out.println("---------------------\n" +
                "Sum of numbers is " + sum);
    }
}
