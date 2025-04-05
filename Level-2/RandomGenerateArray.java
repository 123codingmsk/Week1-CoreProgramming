import java.util.Random;

public class RandomGenerateArray {
    public static int[] generate4DigitRandomArray(int size){
        int[] numbers=new int[size];
        Random random=new Random();
        for(int i=0;i<size;i++){
            numbers[i]= 1000+random.nextInt(9000);
        }
        return numbers;
    }
    public static double[] findAverageMinMax(int[] numbers){
        int min=numbers[0],max=numbers[0],sum=0;
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
            min=Math.min(min, numbers[i]);
            max=Math.max(max, numbers[i]);
        }
        double average=sum/numbers.length;
        return new double[]{average,min,max};
    }
    public static void main(String[] args) {
        int size=5;
        int[] randomNumbers=generate4DigitRandomArray(size);
        double[] result= findAverageMinMax(randomNumbers);
        System.out.println("Random numbers that are generated are:");
        for(int i=0;i<size;i++){
            System.out.println(randomNumbers[i]);
        }
        System.out.println("Average of these random numbers are:"+result[0]);
        System.out.println("min of these random numbers are: "+result[1]);
        System.out.println("max of these random numbers are: "+result[2]);

    }
}