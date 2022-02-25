import javax.swing.plaf.multi.MultiButtonUI;

public class multidimentionalArray {
    public static void main(String[] args) {
        int[][] multiArray = {
            {1,2,3,4},
            {5,6,7,8},
            {9,0}
        };

        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<4 ; j++){
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
