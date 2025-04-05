import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter number of people");
        int n=sn.nextInt();
        double[] weight=new double[n];
        double[] height=new double[n];
        double[] bmi=new double[n];
        String[] status=new String[n];
       
        for(int i=0;i<n;i++){
            System.out.println("Enter height of person "+(i+1));
            height[i]=sn.nextInt();
            System.out.println("Enter weight of person "+(i+1));
            weight[i]=sn.nextInt();
        }
        for(int i=0;i<n;i++){
            bmi[i]=weight[i]/(height[i]*height[i]/10000);
            if(bmi[i]<=18.4){
                status[i]="Underweight";
            }
            else if(bmi[i]<=24.9){
                status[i]="Normal";
            }
            else if(bmi[i]<=39.9){
                status[i]="Overweight";
            }
            else{
                status[i]="Obese";
            }

        }
        for(int i=0;i<n;i++){
            System.out.println("Person "+(i+1)+" is "+status[i]);
        }

        sn.close();
    }
   
}
