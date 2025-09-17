public class VowelOrConsonant {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a character: ");
        String input = scanner.nextLine();
        scanner.close();

        if (input == null || input.isEmpty()) {
            System.out.println("No input provided");
            return;
        }
        char ch = input.charAt(0);
        char c = Character.toLowerCase(ch);

        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel");
                break;
            default:
                if (Character.isLetter(c)) {
                    System.out.println(ch + " is a consonant");
                } else {
                    System.out.println(ch + " is not an alphabet character");
                }
        }
    }
}
