/**
 * Diese Klasse modelliert R�ume in der Welt von Zuul.
 * 
 * Diese Klasse ist Teil der Anwendung "Die Welt von Zuul".
 * "Die Welt von Zuul" ist ein sehr einfaches textbasiertes 
 * Adventure-Game.
 * 
 * Ein "Raum" repr�sentiert einen Ort in der virtuellen Landschaft des
 * Spiels. Ein Raum ist mit anderen R�umen �ber Ausg�nge verbunden.
 * M�gliche Ausg�nge liegen im Norden, Osten, S�den und Westen.
 * F�r jede Richtung h�lt ein Raum eine Referenz auf den 
 * benachbarten Raum.
 * 
 * @author  Michael K�lling und David J. Barnes
 * @version 2016.02.29
 */
public class Raum 
{
    private String beschreibung;
    private Raum nordausgang;
    private Raum suedausgang;
    private Raum ostausgang;
    private Raum westausgang;
    private Raum obergeschoss;
    /**
     * Erzeuge einen Raum mit einer Beschreibung. Ein Raum
     * hat anfangs keine Ausg�nge. Eine Beschreibung hat die Form 
     * "in einer K�che" oder "auf einem Sportplatz".
     * @param beschreibung  die Beschreibung des Raums
     */
    public Raum(String beschreibung) 
    {
        this.beschreibung = beschreibung;
    }

    /**
     * Definiere die Ausg�nge dieses Raums. Jede Richtung
     * f�hrt entweder in einen anderen Raum oder ist 'null'
     * (kein Ausgang).
     * @param norden  der Nordausgang
     * @param osten   der Ostausgang
     * @param sueden  der S�dausgang
     * @param westen  der Westausgang
     */
    public void setzeAusgaenge(Raum norden, Raum osten,
                               Raum sueden, Raum westen,Raum oben) 
    {
        if(norden != null) {
            nordausgang = norden;
        }
        if(osten != null) {
            ostausgang = osten;
        }
        if(sueden != null) {
            suedausgang = sueden;
        }
        if(westen != null) {
            westausgang = westen;
        }
        if(oben != null) { 
            obergeschoss = oben;
        }
    }

    /**
     * @return  die Beschreibung dieses Raums
     */
    public String gibBeschreibung()
    {
        return beschreibung;
    }
    
    public String gibRaumInfo(){
        String ret ="Sie sind " + beschreibung + "\n Ausg�nge: ";
        if(nordausgang != null) {
            ret += "north ";
        }
        if(ostausgang != null) {
            ret +="east ";
        }
        if(suedausgang != null) {
            ret += "south ";
        }
        if(westausgang != null) {
            ret += "west ";
        }
        if(obergeschoss != null) {
            ret += "up";
        }
        return ret + "\n";
    }
    
    public Raum gibAusgang(String richtung){
        if(richtung.equals("north")) {
            return nordausgang;
        }
        if(richtung.equals("east")) {
            return ostausgang;
        }
        if(richtung.equals("south")) {
            return suedausgang;
        }
        if(richtung.equals("west")) {
            return westausgang;
        }
        return null;
    }


        

}
