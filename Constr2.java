public class Constr2{
    int x;

    public Constr2(int y){
        x = y;
    }

    public static void main(String[] args){
        Constr2 myOb = new Constr2(4);

        System.out.println(myOb.x);
    }
}