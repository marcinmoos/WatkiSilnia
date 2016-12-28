package watkisilnia;

import java.math.BigInteger;
import javax.swing.JTextField;


public class Intracyjna extends WatkiStart{

    public Intracyjna(long liczbaWejsciowa, JTextField poleWynik, JTextField poleCzas) {
        super(liczbaWejsciowa, poleWynik, poleCzas);
    }


    
    @Override
    BigInteger Oblicz(BigInteger liczba) {
        BigInteger wynik = new BigInteger("1");
        for(BigInteger i = new BigInteger("1"); i.compareTo(liczba) <= 0; i = i.add(BigInteger.ONE)){
            wynik = wynik.multiply(i);
            if(Thread.interrupted())break;
        } 
        return wynik;
    } 

}
