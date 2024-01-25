import java.util.Scanner;
public class Handshakes{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int ans=(a*(a-1))/2;
        System.out.printf("%d",ans);
        
    }
}