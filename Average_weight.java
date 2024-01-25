import java.util.Scanner;
public class Avg{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int av=sc.nextInt();
        int b1=sc.nextInt();
        int b2=sc.nextInt();
        int b3=3*(av)-b1-b2;
        System.out.printf("%d",b3);
    }
}