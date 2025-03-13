public class ConstString{
    int x;
    String name;

    public ConstString(String a, int y){
        x = y;
        name = a;
    }

    public static void main(String[] args){
        ConstString myOb = new ConstString("Hamed", 22);

        System.out.println("your Name: " + myOb.name + "\nyour age: " + myOb.x);
    }
}