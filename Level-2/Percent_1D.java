import java.util.Scanner;

public class Percent_1D{
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n=sn.nextInt();
        double[] physics=new double[n];
        double[] chemistry=new double[n];
        double[] maths=new double[n];
        double[] percent=new double[n];
        String[] grades=new String[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter physics marks of student "+(i+1)+" : ");
            physics[i]=sn.nextDouble();
            System.out.println("Enter chemistry marks of student "+(i+1)+" : ");
            chemistry[i]=sn.nextDouble();
            System.out.println("Enter maths marks of student "+(i+1)+" : ");
            maths[i]=sn.nextDouble();
        }
        for(int i=0;i<n;i++){
            percent[i]=(physics[i]+chemistry[i]+maths[i])/3;
            if(percent[i]>80)
            grades[i]="A";
            else if(percent[i]>70)
            grades[i]="B";
            else if(percent[i]>60)
            grades[i]="C";
            else if(percent[i]>50)
            grades[i]="D";
            else if(percent[i]>40)
            grades[i]="E";
            else 
            grades[i]="R";

        }
        for(int i=0;i<n;i++){
            System.out.printf("\nPercentage of student %d is %.2f and grade is %s.",(i+1),percent[i],grades[i]);
        }


        sn.close();
    }
}