public class HalfPyramid {
    public static void main(String[] args){
        int n=4;
        int i=1;
        int j=1;
        // outer loop
        for(i=1;i<=n;i++){
            // inner loop
            for(j=1;j<=i;j++){
                System.out.print("*"+" ");
            }  System.out.println();
        }

    }
}
