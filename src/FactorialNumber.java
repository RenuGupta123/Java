public class FactorialNumber {

    public static void main(String[] args) {

        int n =5;
        int mult = 1;

        for ( int i =n; i>=1;i--)
        {
            mult = mult * i;

        }
        System.out.print("Number "+mult);


    }
}
