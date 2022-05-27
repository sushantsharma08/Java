public class leftTriangle {
    public static void main(String[] args) {
        int i, j, num = 5;
        for (i = 0; i < num; i++) {
            for (j = 2 * (num - i); j >= 0; j--) {
                // prints space between two stars
                System.out.print(" ");
            }
            // inner loop for columns
            for (j = 0; j <= i; j++) {
                // prints star
                System.out.print("*");
            }
            // throws the cursor in a new line after printing each line
            System.out.println();
        }
    }
}
