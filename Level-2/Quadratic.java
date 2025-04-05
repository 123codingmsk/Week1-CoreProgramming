import java.util.Scanner;

public class Quadratic {
    public static double[] quadraticRoots(double a,double b,double c,double delta){
        if(delta>0){
            double root1=((-b+Math.sqrt(delta))/(2*a));
            double root2=((-b-Math.sqrt(delta))/(2*a));
            return new double[]{root1,root2};
        }else if(delta==0){
            double root=-b/(2*a);
            return new double[]{root};
        }else{
            return new double[]{};
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        double a=scanner.nextDouble();
        System.out.print("Enter the value of b:");
        double b=scanner.nextDouble();
        System.out.print("Enter the value of c:");
        double c=scanner.nextDouble();
        double delta=Math.pow(b, b)-(4*a*c);
        double[] roots=quadraticRoots(a,b,c,delta);
        for(int i=0;i<roots.length;i++){
            System.out.printf("The root of the quadratic equation is %.2f:",roots[i]);
        }
        scanner.close();
    }
}