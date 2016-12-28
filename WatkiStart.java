package watkisilnia;

import java.math.BigInteger;
import javax.swing.JTextField;

public abstract class WatkiStart implements Runnable {
 
    JTextField poleWynik, poleCzas;
    BigInteger liczba;

    public WatkiStart(long liczbaWejsciowa, JTextField poleWynik, JTextField poleCzas) {
        this.poleWynik = poleWynik;
        this.poleCzas = poleCzas;
        this.liczba = BigInteger.valueOf(liczbaWejsciowa);
    }
    
    
    abstract BigInteger Oblicz(BigInteger liczba);
    
    
    @Override
    public void run() {
        Long start = System.currentTimeMillis();
        poleWynik.setText(Oblicz(liczba).toString());
        poleCzas.setText(Long.toString(System.currentTimeMillis() - start)+" ms");  
    }

}
