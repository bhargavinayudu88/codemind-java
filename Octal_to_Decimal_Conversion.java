import java.util.Scanner;
public class octal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int b=Integer.parseInt(a,8);
        System.out.println(b);
        
    }
}