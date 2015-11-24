package cribe;

import java.util.stream.IntStream;



public class Crible {
    
    private static IntStream filter(IntStream s, int i, int n) {
        if (i <= n) {
            return filter(s.filter(p->p == i || p%i!=0), i+1, n);
        } else {
            return s;
        }
    }
    
    private static void afficherLesNombresPremiersAvant(int n) {
        int rn = (int) Math.sqrt(n);
                         
        filter(IntStream.range(2, n), 2, rn).forEach(p -> {System.out.print(p +" ");} );
    }
    
    
    
    
    
    
    
    
    
    
    
    

    public static void main(String[] args) throws NoSuchMethodException {
    
        afficherLesNombresPremiersAvant(10000000);
        
        System.out.println();
    }
}
