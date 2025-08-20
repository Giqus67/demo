class Main{
    public static void main(String[] args){
        System.out.println("Hello world, random number!");
        random();
    }
    
    public static void random(){
        calcSum( (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
        calcSum( (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
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