/**
 * Folgende Spielobjekte sind definiert:
 *
 * Spiel.Zustand.Ball Ball;
 *     Repraesentiert den Spielball mit seinen Koordinaten
 *
 * Eigenschaften des Ball-Spielobjekts:
 * Ball.xKoordinate() : int
 * Ball.yKoordinate() : int
 *
 * Zustandsmanipulation mit dem Ball-Spielobjekt:
 * zustand.listeBall() : List<Spiel.Zustand.Ball>
 *
 * Spiel.Zustand.Schlaeger Schlaeger;
 *     Repr?sentiert einen Spieler mit eindeutiger ID sowie der xKoordinate seines Schl?gers
 *
 * Eigenschaften des Schlaeger-Spielobjekts:
 * Schlaeger.identifikation() : int
 * Schlaeger.yKoordinate() : int
 * Schlaeger.punktzahl() : int
 * Schlaeger.left() : boolean
 *
 * Zustandsmanipulation mit dem Schlaeger-Spielobjekt:
 * zustand.listeSchlaeger() : List<Spiel.Zustand.Schlaeger>
 *
 *
 * Sie koennen folgende Aktionen ausfuehren:
 *
 * zug.ausgabe(text : String) - Damit kannst du eine Debugausgabe machen. Verwende nicht System.out.println().
 *
 * zug.nachOben();
 *     Bewegt den Schlaeger eine Einheit nach oben
 *
 * zug.nachUnten();
 *     Bewegt den Schlaeger eine Einheit nach unten
 *
 *
 */
public class AI 
{
    public void zug(int id, Spiel.Zustand zustand, Spiel.Zug zug) 
    {
         System.out.println("test");
    }
}
