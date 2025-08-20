class Main{
    public static void main(String[] args)
        System.out.println("This application will generate random integer number and sum them!");
        random();
    }
    
    public static void random(){
       int first = calcSum( (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
       int second = calcSum( (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
       System.out.println("first sum: " + first + "\n" + "second sum: " + second);
    }

    public static int calcSum(int ...arg){
        int[] array = arg;
        int sum = 0;
        for(int i : array){
            sum += i;
        }
        return sum;
    }
}