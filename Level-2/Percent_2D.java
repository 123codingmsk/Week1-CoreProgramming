import java.util.Scanner;

public class Percent_2D{
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n=sn.nextInt();
        double[][] marks = new double[n][3];
        double[] percent=new double[n];
        String[] grades=new String[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter physics marks of student "+(i+1)+" : ");
            marks[i][0]=sn.nextDouble();
            System.out.println("Enter chemistry marks of student "+(i+1)+" : ");
            marks[i][1]=sn.nextDouble();
            System.out.println("Enter maths marks of student "+(i+1)+" : ");
            marks[i][2]=sn.nextDouble();
        }
        for(int i=0;i<n;i++){
            percent[i]=(marks[i][0]+marks[i][1]+marks[i][2])/3;
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
