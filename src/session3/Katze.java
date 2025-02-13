package session3;

/**
 *  Die Klasse "Katze" repräsentiert ganz allgemein eine Katze.
 *
 */
public class Katze {

    /*
        Attribute = Eigenschaften, die jedes Objekt von dieser Klasse haben soll.

        Die Attribute werden "private" gemacht, damit man von außen nicht direkt darauf zugreifen kann.

        Hier diese sog. "Sichtbarkeiten" in der Reihenfolge von eingeschränkt bis offen:
        - private = man kann nur innerhalb der Klasse, in der sich das Attribut/die Methode befindet, darauf zugreifen
        - keine Angabe = man kann auch von Klassen, die sich in demselben Package befinden wie die Klasse, in
                            der sich das Attribut/die Methode befindet, zugreifen
        - public = man kann von allen anderen Klassen aus auf dieses Attribut/diese Methode zugreifen
     */
    private String name = "";
    private int beine = 4;
    private String fellFarbe = "schwarz";
    private String laut = "";
    private double gewicht;

    /*
        Hier kommen nun die Getter- und Setter-Methoden.

        Der Aufbau ist immer
            - public TYP_DES_ATTRIBUTS getNAME_DES_ATTRIBUTS(){...} für getter und
            - public void setNAME_DES_ATTRIBUTS(TYP_DES_ATTRIBUTS variable){...} für setter.

        Getter-Methoden liefern einfach nur den Wert des Attributs im Moment des Aufrufs der Methode zurück.
        Setter-Methode setzen den Wert des jeweiligen Attributs auf den Wert des übergebenen Parameters.

        Um zu unterscheiden, ob es sich um die Attributvariable oder eine als Parameter übergebene
        Variable handelt, greift man auf die Attributvariable mit der Referenz "this" zu.

        Getter und Setter haben immer die Sichtbarkeit public, damit man von außen die Werte abrufen und setzen kann.
     */
    public String getName(){
        return name;
    }

    public void setName(String name){
        /*
            Innerhalb eines setters kann man den übergebenen Wert nochmal auf bestimmte Eigenschaften prüfen,
            bevor man ihn in die Attribut-Variable speichert.

            Das ist übrigens der eigentliche Sinn der Verwendung von privaten Attributen und öffentlichen Methoden.
         */
        if(!(name == null)){
            if( !name.isEmpty()) {
                this.name = name;
            }
        }
        else{
            System.out.println("Der Name darf nicht leer sein.");
        }
    }

    public int getBeine() {
        return beine;
    }

    public void setBeine(int beine) {
        this.beine = beine;
    }

    public String getFellFarbe() {
        return fellFarbe;
    }

    public void setFellFarbe(String fellFarbe) {
        this.fellFarbe = fellFarbe;
    }

    public String getLaut() {
        return laut;
    }

    public void setLaut(String laut) {
        this.laut = laut;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    /*
        Nach den gettern und settern kommen die restlichen Methoden dieser Klasse.

        Welche Sichtbarkeit diese Methoden jeweils bekommen, hängt vom jeweiligen Programmaufbau ab.

        Über die Sichtbarkeit kann man gut steuern, welche Methoden von außen aufgerufen werden können und welche
        nicht.
     */

    public String gibLaut(){
        return this.laut;
    }
}
