public class Palindromicnumberpyramid {
    public static void main(String[] args){
        int n=5;
        int i,j;
        // outer loop
        for(i=1;i<=n;i++){
            // space print
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // half pyramid
            for(j=i;j>=1;j--){
                System.out.print( j );
            }
            // another half pyramid
            for(j=2;j<=i;j++){
                System.out.print(j );
            }
            System.out.println();
        }
    }
}
