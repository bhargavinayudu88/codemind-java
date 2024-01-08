import java.util.Scanner;
public class SecondNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int avg=sc.nextInt();
        int f=sc.nextInt();
        int s=2*avg-f;
        System.out.println(s);
    }
}