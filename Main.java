import java.util.Scanner;

class Main{
    static int totalSum = 0;
    public static void main(String[] args){
        System.out.println("This application will generate random integer number and sum them!");
        boolean loop = true;
        while (loop) {
             random();
             loop = continueLoop();
        }
    }
    public static void random(){
       int first = calcSum( (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
       int second = calcSum( (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
       int third = calcSum( (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
       printSums(first, second, third);
    }

    public static int calcSum(int ...arg){
        int[] array = arg;
        int sum = 0;
        for(int i : array){
            sum += i;
        }
        totalSum += sum;
        return sum;
    }

    public static void printSums(int ...sums){
        int[] array = sums;
        for(int i = 0; i < array.length; i++){
            System.out.println(i + 1 + " sum: " + array[i]);
            System.out.println("Total sum: " + totalSum);
        }
    }
    public static boolean continueLoop(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to continue?");
        String line = scanner.nextLine();
        if(line.equalsIgnoreCase("yes")){
            return true;
        }
        return false;
    }
}