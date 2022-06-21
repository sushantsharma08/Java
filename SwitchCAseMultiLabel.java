public class SwitchCAseMultiLabel {
    public static void main(String[] args) {
        int choice = 8;
        switch (choice) {
            case 1,3,5,7,9:
                System.out.println("odd number");
                break;
            case 2,4,6,8,10:
            System.out.println("even number");
            break;
            default:
            System.out.println("enter number btw 1-10");
                break;
        }
    }
}
