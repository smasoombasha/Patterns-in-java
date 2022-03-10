public class Solidrhombus {
    public static void main(String[] args){
        int n=5;
        int i,j;
        // outer loop
        for(i=1;i<=n;i++){
            // inner loop
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
