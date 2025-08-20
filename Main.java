class Main{
    public static void main(String[] args){
        System.out.println("hello world!");
        calcSum(1, 2, 3, 4, 5);
        calcSum(5, 12, 7, 17, 5);
    }
    
    public static void calcSum(int ...arg){
        int[] array = arg;
        int sum = 0;
        for(int i : array){
            sum += i;
        }
        System.out.println(sum);
    }
}