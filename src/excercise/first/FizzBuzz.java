package excercise.first;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Start");
        for (int i = 1; i < 100; i++){
            if( i % 10 == 0){
                System.out.println();
            }
            if (i % 3 == 0  && i % 5 == 0 ){
                System.out.print(" FizzBuzz,");
            } else if ( i % 3 == 0 ){
                System.out.print(" Fizz,");
            } else if ( i % 5 == 0){
                System.out.print(" Buzz,");
            }else {
                System.out.print(" " + i + ",");
            }
        }
        System.out.println();
        System.out.println("End");
    }
}
