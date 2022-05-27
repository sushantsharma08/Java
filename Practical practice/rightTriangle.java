public class rightTriangle {
    public static void main(String[] args) {
        int rows=5,i,j;

        for(i=0;i<rows;i++){
            for ( j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
