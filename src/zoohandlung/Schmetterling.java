
package zoohandlung;


public class Schmetterling extends Tier implements Laufen,Fliege {
    int anzahlBeine;
    
    String lieblingsfarbe;
    double spannweite;
    
     public Schmetterling(String name, double gewicht, String lieblingfarbe, double spannweite) {
        super(name, gewicht);
        this.lieblingsfarbe = lieblingsfarbe;
        this.spannweite = spannweite;
    }
    
    @Override
    public void laufe() {
        System.out.println("Ich laufe");
        
    }

    @Override
    public int getAnzahlBeine() {
        return anzahlBeine;
    }

    @Override
    public void setAnzahlBeine(int anzahl) {
        this.anzahlBeine = anzahlBeine; {
    }
    }

    @Override
    public void fliege() {
        System.out.println("Ich fliege");
    }
    
    
    public void lande() {
        System.out.println("Ich lande");
    } 

    @Override
    public int getAnzahlFlügel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAnzahlFlügel(int anzahl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
