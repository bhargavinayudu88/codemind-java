import java.util.Scanner;
public class GoodInvester{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if((2*y)<=x){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}