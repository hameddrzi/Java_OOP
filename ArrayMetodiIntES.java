public class ArrayMetodiIntES {
    

    static int lunghezza(int[] a){
        return a.length;
    }

    static void stampare(int[] a){
        for(int i=0; i< a.length; i++){
            System.out.println("element " + i + "=" + a[i]);
        }
    }

    static int somma(int[] a){
        int somma=0;

        for(int i=0; i<a.length; i++){
            somma = somma + a[i];
        }
        return somma;
    }

    static boolean confront(int[] a, int[] b){
        boolean  confront = (a.length == b.length);
        int i = 0;
        while(i<a.length && confront){
            confront = (a[i] == b[i]);
            i++;
        }
        return confront;
    }

    public static void main(String[] args){
        int[] a = {10, 20, 30};
        System.out.println("lunghezza array = " + lunghezza(a));
        System.out.println("elementi: ");
        stampare(a);
        System.out.println("somma complessiva = " + somma(a));
        int[] b = {10, 20, 30};
        System.out.println(confront(a, b) ? "array uguali" : "array diversi");
    }
}