import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        String[] name= new String[3];
        int[] age=new int[3];
        int[] height=new int[3];
        String youngest,tallest;
        for(int i=0;i<3;i++){
            System.out.println("Enter name: ");
            name[i]=sn.nextLine();
            System.out.println("Enter age: ");
            age[i]=sn.nextInt();sn.nextLine();
            System.out.println("Enter height: ");
            height[i]=sn.nextInt();sn.nextLine();
        }

        if(age[0]<age[1]&&age[0]<age[2]){
            youngest=name[0];
        }
        else if(age[1]<age[2]){
            youngest=name[1];
        }
        else{
            youngest=name[2];
        }

        if(height[0]>height[1]&&height[0]>height[2]){
            tallest=name[0];
        }
        else if(height[1]>height[2]){
            tallest=name[1];
        }
        else{
            tallest=name[2];
        }

        System.out.println("Youngest is "+ youngest);
        System.out.println("Tallest is "+ tallest);
        sn.close();
    }
   
}
