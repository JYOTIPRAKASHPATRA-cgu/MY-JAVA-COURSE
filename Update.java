import java.util.*;
public class bit{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();

        int n=5;
        int pos=1;
        int bitMask=1<<pos;

        if(oper==1){
            int newNumber=bitMask | n;
            System.out.println(newNumber);
        }else{
            int notBitMask=~(bitMask);
            int newBitMask=notBitMask & n;
            System.out.println(newBitMask);
        }
    }
}
