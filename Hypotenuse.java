import java.util.Scanner;
import java.lang.Math; 
public class Hypotenuse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double c=Math.sqrt(a*a+b*b);
        System.out.printf("%.2f",c);
    }
}