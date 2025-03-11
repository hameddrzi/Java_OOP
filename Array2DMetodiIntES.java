public class Array2DMetodiIntES {


    static int numeroRighe(int[][] a){
        return a.length;
    }

    static int numeroColonn(int[][] a){
        return a[0].length;
    }

    static void stampare(int[][] a){
        for(int i =0; i< a.length; i++){
            for(int j=0; j< a[i].length ; j++){
                System.out.println("Element of Row " + i +", collona " +j+ "=" + a[i][j]);
            }
        }
    }

    static int somma(int[][] a){
        int somma =0;
        for(int i =0; i< a.length; i++){
            for(int j=0; a[i].length; j++){
                somma = somma + a[i][j];
            }
        }
        return somma;
    }

    static boolean confront(int[][] a, int[][] b){
        boolean conf = (a.length == b.length) && (a[0].length == b[0].length);
        int i =0;
        int j=0;
        while(i<a.length && conf){
            while(j< b.length && conf){
                conf = (a[i][j] == b[i][j]);
                j++;
            }
            j=0;
            i++;
        }
        return conf;

    }

    public static void main(String[] args) {
        int[][] a = {{10, 20, 30},{40, 50, 60}};    	 
        System.out.println("numero di colonne = " + numeroColonne(a));
        System.out.println("numero di righe = " + numeroRighe(a));
        System.out.println("elementi: ");
        stampare(a);
        System.out.println("somma complessiva = " + somma(a));
        int[][] b = {{10, 20, 30},{40, 50, 60}};    	 
        System.out.println(confrontoDue(a,b) ? "uguali" : "diversi");
        int[][] c = {{10, 20, 30},{40, 40, 60}};    	 
        System.out.println(confrontoDue(a,c) ? "uguali" : "diversi");		
}

}
