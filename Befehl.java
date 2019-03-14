/**
 * Diese Klasse ist Teil der Anwendung "Die Welt von Zuul".
 * "Die Welt von Zuul" ist ein sehr einfaches textbasiertes 
 * Adventure-Game.
 * 
 * Objekte dieser Klasse halten Informationen �ber Befehle,
 * die der Benutzer eingegeben hat. Ein Befehl besteht momentan
 * aus zwei Zeichenketten: einem Befehlswort und einem zweiten
 * Wort. Beim Befehl "nimm karte" beispielsweise sind die beiden
 * Zeichenketten "nimm" und "karte".
 * 
 * Befehle werden von Benutzern dieser Klasse auf G�ltigkeit
 * �berpr�ft. Wenn ein Spieler einen ung�ltigen Befehl eingegeben
 * hat (ein unbekanntes Befehlswort), dann ist das Befehlswort <null>.
 *
 * Wenn der Befehl nur aus einem Wort bestand, dann ist das
 * zweite Wort <null>.
 * 
 * @author  Michael K�lling und David J. Barnes
 * @version 2016.02.29
 */

class Befehl
{
    private String befehlswort;
    private String zweitesWort;

    /**
     * Erzeuge ein Befehlsobjekt. Beide W�rter m�ssen angegeben werden,
     * aber jedes oder beide d�rfen 'null' sein.
     * @param erstesWort   das erste Wort des Befehls. Sollte
     *                     'null' sein, wenn dieser Befehl als nicht
     *                     vom Spiel erkannt gekennzeichnet werden soll.
     * @param zweitesWort  das zweite Wort des Befehls
     */
    public Befehl(String erstesWort, String zweitesWort)
    {
        befehlswort = erstesWort;
        this.zweitesWort = zweitesWort;
    }

    /**
     * Liefere das Befehlswort (das erste Wort) dieses Befehls.
     * Wenn der Befehl nicht verstanden wurde, ist das Ergebnis
     * 'null'.
     * @return  das Befehlswort
     */
    public String gibBefehlswort()
    {
        return befehlswort;
    }

    /**
     * @return  das zweite Wort dieses Befehls. Liefere 'null', wenn
     *          es kein zweites Wort gab.
     */
    public String gibZweitesWort()
    {
        return zweitesWort;
    }

    /**
     * @return  true, wenn dieser Befehl nicht verstanden wurde
     */
    public boolean istUnbekannt()
    {
        return (befehlswort == null);
    }

    /**
     * @return  true, wenn dieser Befehl ein zweites Wort hat
     */
    public boolean hatZweitesWort()
    {
        return (zweitesWort != null);
    }
}

