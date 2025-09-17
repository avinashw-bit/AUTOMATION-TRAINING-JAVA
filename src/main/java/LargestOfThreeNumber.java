public class LargestOfThreeNumber {

    public static void main(String[] args) {
        int a = 15;
        int b = 42;
        int c = 27;

        int largest;
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        System.out.println("Largest: " + largest);
    }
}
