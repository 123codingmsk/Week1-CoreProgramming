import java.util.Scanner;

class Football{
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int[] arr=new int[11];
        for(int i=0;i<11;i++){
            System.out.printf("Enter heights of player %d: ",(i+1));            
            arr[i]=sn.nextInt();
        }
        int sum=SumH(arr);
        int mean=meanH(arr);
        int shortest=shortest(arr);
        int tallest=tallest(arr);

        System.out.println("Sum of all heights is: "+sum);
        System.out.println("Mean of all heights is: "+mean);
        System.out.println("Shortest of all heights is: "+shortest);
        System.out.println("Tallest of all heights is: "+tallest);

        sn.close();
               
    }
    public static int SumH(int[] a){
        int s=0;
        for(int i=0;i<a.length;i++){
            s+=a[i];
        }
        return s;
    }
    public static int meanH(int[] m){
        int mean=SumH(m)/m.length;
        return mean;      

    }
    public static int shortest(int[] s){
        int sho=Integer.MAX_VALUE;
        for(int i=0;i<s.length;i++){
            if(sho>s[i]){
                sho=s[i];
            }
        }
        return sho;
    }
    public static int tallest(int[] t){
        int tall=Integer.MIN_VALUE;
        for(int i=0;i<t.length;i++){
            if(tall<t[i]){
                tall=t[i];
            }
        }
        return tall;
    }
}
