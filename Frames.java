import java.util.Scanner;
public class Frames{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x=sc.nextInt();
        int cost=2*(n+m)*x;
        System.out.println(cost);
        
    }
}