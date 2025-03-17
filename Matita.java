public class Matita{

    public static final int minStelo = 10;
    public static final int maxStelo = 200;
    public static final int maxPunta = 5;
    private int stelo;
    private int punta;


    public Matita(int stelo){
        this.stelo = stelo;
        this.punta = maxPunta;
    }

    public int getStelo(){ return this.stelo; }
    public int getPunta(){ return this.punta; }
    

    public boolean disegna(){
        if(punta >= 1){
            punta--;
            return true;
        }else{
            return false;
        }
    }

    public boolean tempera(){
        if(this.stelo > minStelo){
            this.stelo--;
            this.punta = Math.min(this.punta+1 , maxPunta);
            return true;
        }else{
            return false;
        }
    }


}