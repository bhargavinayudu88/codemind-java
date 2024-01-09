import java.util.Scanner;
public class Climbing{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int moves=0;
            if(x%y==0){
                moves=x/y;
            }
            else{
                moves=(x/y)+(x%y);
            }
        
        System.out.println(moves);
        }
    }
}