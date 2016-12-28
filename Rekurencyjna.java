package watkisilnia;

import java.math.BigInteger;
import javax.swing.JTextField;


public class Rekurencyjna extends WatkiStart{

    public Rekurencyjna(long liczbaWejsciowa, JTextField poleWynik, JTextField poleCzas) {
        super(liczbaWejsciowa, poleWynik, poleCzas);
    }

   

    @Override
    BigInteger Oblicz(BigInteger liczba) {

        if(Thread.interrupted())return BigInteger.ONE;
        
        if (liczba.compareTo(BigInteger.ZERO) == 0){
            return BigInteger.ONE;
        }
        else{
            return liczba.multiply(Oblicz(liczba.subtract(BigInteger.ONE)));
        }
 
    }


}