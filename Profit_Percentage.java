import java.util.Scanner;
public class Profit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int cp=sc.nextInt();
        int sp=sc.nextInt();
        float profit=sp-cp;
        float pro=(profit*100)/cp;
        System.out.printf("%.2f",pro);
        
        
    }
    
}