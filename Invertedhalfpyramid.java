import java.util.*;
public class Invertedhalfpyramid {
    public static void main(String[] args){
        int n=4;
        int i=1;
        int j=1;
        // outer loop
        for(i=n;i>=1;i--){
            //inner loop
            for(j=1;j<=i;j++){
                System.out.print("*"+" ");
            }System.out.println();
        }

    }
}
