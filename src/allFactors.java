public class allFactors {

    public static void main(String[] args) {
        printFactors(10);
    }

    public static void printFactors (int number) {

        if (number < 1) {
            System.out.println("Invalid Value");
        } else {

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }

        }

    }

}
