import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int num;
        num=sn.nextInt();
        String str=""+num;
        int len=str.length();
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=num%10;
            num/=10;
           
        }
		for(int i=0;i<len;i++){
            System.out.println(arr[i]);

        }
       
        sn.close();
    }
}
