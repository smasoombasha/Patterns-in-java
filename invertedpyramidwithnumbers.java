public class invertedpyramidwithnumbers {
    public static void main(String[] args){
        int n=5;
        // outer loop
        // row line
        for(int i=1;i<=n;i++){
            // inner loop
            // column line
            for(int j=1;j<=n-i+2;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}