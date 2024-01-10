import java.util.Scanner;
public class Bridge{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int ans=(z-y)/x;
        System.out.println(ans);
    }
}