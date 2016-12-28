package watkisilnia;

import static watkisilnia.NewJFrame.*;

public class WatkiSilnia {
    
    long liczbaWej;
    static Thread watekIteracyjny, watekRekurencyjny;

    public WatkiSilnia(long liczbaWejsciowa) {
        this.liczbaWej = liczbaWejsciowa;
        
        jTextField2.setText("liczę");
        jTextField3.setText("liczę");
        
        watekIteracyjny = new Thread(new Intracyjna(liczbaWej, jTextField2, jTextField4));
        watekRekurencyjny = new Thread(new Rekurencyjna(liczbaWej, jTextField3, jTextField5));
        
        watekIteracyjny.start();
        watekRekurencyjny.start();
    }
    
    
}