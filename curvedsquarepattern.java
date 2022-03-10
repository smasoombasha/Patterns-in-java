public class curvedsquarepattern {
    public static void main(String[] args){
        int n=5;
        int i,j;
        // upper pyramid
        for(i=1;i<=n;i++) {
            // print spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for(j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }




            // lower pyramid
            for(i=n;i>=1;i--){
                // spaces
                for(j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                // print stars
                for(j=1;j<=(2*i)-1;j++) {
                    System.out.print("*");
                }
                System.out.println();
            }


    }
}
