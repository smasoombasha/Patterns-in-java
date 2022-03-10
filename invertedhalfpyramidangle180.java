import java.util.*;
public class invertedhalfpyramidangle180 {
    public static void main(String[] args){
        int n=4;
         int j=1;
         //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop
            for(j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
}}
