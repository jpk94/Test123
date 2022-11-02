public class Cosinus {
    public static void main(String[] args) {

// zuerst die Errormeldung um das rechnen gar nicht erst zu startten wenn die eingabe falsch war, sowie die Initialisierung von x

if(args.length != 1) {
    System.out.println("ERROR: Bitte genau ein Argument für X eingeben. Danke.");
    return;
}

Double x = Double.parseDouble(args[0]);

// wie in pq formel letzte woche, erstmal formel "aufdröseln" um einfache handlebare teile zu haben
// für mich später https://www.mathebibel.de/summenzeichen
// !... =Faktor, 4! = 4*3*2*1  oder z.b. !10 = 10*9*8*7*6*5*4*3*2*1 usw usw
// 2 Wege, entweder das mit Summenzeichen irgendwie umsetzen
// oder 11 einzelne Divisionsblöcke, auf + bzw minus achten,
// bei 11 Blöcken !22 bzw hoch22 maximal.
// Für diese aufgabe -> vllt einfacher mit 11 blöcken, in realität blöcke = unhandlich. was wenn 10? 20? 10000?7

// cos(x) entspricht n mal block * x²n


// TO DO wie faktorisierung realisieren?
// TO DO wie von bis mit summenzeichen realisieren? neue variable nicht erlaubt! also hier fix mit 11 arbeiten?





}