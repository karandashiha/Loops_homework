package app;

public class Main {
    public static void main(String[] args) {

        int [] num = {1,2,3,4,5,6};
        int sum = 0;

        for ( int i = 0;  i < num.length; i++){

            sum += num[i];
            System.out.println((i + 1) + ") Num is " + num[i] + " sum is " + sum);

        }
        System.out.println("---------------------\n" +
                "Sum of numbers is " + sum);
    }
}
