import java.util.*;
public class solidrectangle {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int i=1;
    int j=1;
    // outer loop
    for(i=1;i<=n;i++){
        // inner loop
        for(j=1;j<=10;j++){
            System.out.print("*"+" ");
        }
        System.out.println();
    }
}
}
