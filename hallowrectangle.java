
public class hallowrectangle {
    public static void main(String[] args){
         int n =7;
        int m =10;
        int i=1;
        int j=1;
        // outer loop
        for(i=1;i<=n;i++){
            // inner loop
            for(j=1;j<=m;j++){
                // cell i,j
                if(i==1 || i==n || j==1 || j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();}

    }
}
