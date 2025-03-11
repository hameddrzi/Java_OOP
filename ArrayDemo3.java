public class ArrayDemo3{
    public static void main(String[] args){
        int[] numbers = new int[5];
        for(int i=0; i<numbers.length ; i++){
            numbers[i] = i+1;
        }
        for(int nu : numbers){
            System.out.println(nu);
        }
    }
}