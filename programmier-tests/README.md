# Programmier-Tests

Sammlung von Java- und JavaScript-Übungsaufgaben mit Fokus auf Grundlagen, OOP, Webentwicklung und saubere Projektstruktur.

---

## Aufgabe 01 – Hallo Welt

### Beschreibung:
Ein einfaches Java-Programm, das den Text `Hallo Welt!` in der Konsole ausgibt. Dient als Einstieg in die Java-Syntax und den Aufbau eines Programms mit `main()`-Methode.

### Ausführung:
```bash
javac aufgaben/Aufgabe01_HalloWelt/HalloWelt.java
java aufgaben.Aufgabe01_HalloWelt.HalloWelt



## Aufgabe 02 – Einfache Benutzereingabe

### Beschreibung:
Das Programm fragt den Benutzer nach seinem Namen und begrüßt ihn anschließend personalisiert.

### Ausführung:
```bash
javac aufgaben/Aufgabe02_EingabeBegruessung/EingabeBegruessung.java
java aufgaben.Aufgabe02_EingabeBegruessung.EingabeBegruessung



## Aufgabe 03 – Grundrechenarten mit Methoden

### Beschreibung:
Das Programm liest zwei Zahlen und eine Rechenart ein und führt die entsprechende Grundrechenart (Addition, Subtraktion, Multiplikation, Division) mithilfe eigener Methoden durch. Zusätzlich wird demonstriert, was passiert, wenn man die Eingaben als Strings behandelt und einfach verkettet.

---

### Datei: `Grundrechenarten.java`

#### Ausführung:
```bash
javac aufgaben/Aufgabe03_Grundrechenarten/Grundrechenarten.java
java aufgaben.Aufgabe03_Grundrechenarten.Grundrechenarten



## Aufgabe 04 – Fakultät berechnen

### Beschreibung:
Das Programm liest eine ganze Zahl vom Benutzer ein und berechnet die Fakultät dieser Zahl. Fakultät (n!) ist das Produkt aller positiven Ganzzahlen von 1 bis n. Es gibt zwei Varianten: iterativ und rekursiv.

---

### Datei: `Fakultaet.java` (iterativ)

#### Ausführung:
```bash
javac aufgaben/Aufgabe04_Fakultaet/Fakultaet.java
java aufgaben.Aufgabe04_Fakultaet.Fakultaet



## Aufgabe 05 – Rechteck mit Sternchen zeichnen

### Beschreibung:
Das Programm gibt zuerst ein festes 5x5-Quadrat aus Sternchen (*) aus. Anschließend kann der Benutzer ein beliebig hohes und breites Rechteck definieren, das dann ebenfalls in der Konsole ausgegeben wird.

---

### Datei: `RechteckZeichnen.java`

#### Ausführung:
```bash
javac aufgaben/Aufgabe05_RechteckZeichnen/RechteckZeichnen.java
java aufgaben.Aufgabe05_RechteckZeichnen.RechteckZeichnen



## Aufgabe 06 – Gleichschenkliges Dreieck & Tannenbaum

### Beschreibung:
Das Programm zeichnet zuerst ein gleichschenkliges Dreieck mit benutzerdefinierter Höhe. Danach wird ein Tannenbaum gezeichnet – ebenfalls basierend auf einer angegebenen Höhe – inklusive einfachem Stamm.

---

### Datei: `DreieckUndTannenbaum.java`

#### Ausführung:
```bash
javac aufgaben/Aufgabe06_DreieckUndTannenbaum/DreieckUndTannenbaum.java
java aufgaben.Aufgabe06_DreieckUndTannenbaum.DreieckUndTannenbaum



## ✅ Aufgabe 07 – Pascalsches Dreieck

### Beschreibung:
Das Programm gibt ein Pascalsches Dreieck mit einer benutzerdefinierten Anzahl an Zeilen aus. Jede Zahl im Dreieck ist die Summe der beiden Zahlen darüber. Die Berechnung erfolgt mithilfe einer Kombinationen-Formel aus der Kombinatorik.

---

### Datei: `PascalschesDreieck.java`

#### Ausführung:
```bash
javac aufgaben/Aufgabe07_PascalschesDreieck/PascalschesDreieck.java
java aufgaben.Aufgabe07_PascalschesDreieck.PascalschesDreieck



## Aufgabe 08 – Array sortieren (ohne Arrays.sort())

### Beschreibung:
Das Programm sortiert ein gegebenes Array von Ganzzahlen:
1. Original
2. Aufsteigend
3. Absteigend

Dabei wird ein eigener BubbleSort-Algorithmus verwendet – keine Standardmethoden aus der Java-Standardbibliothek.

---

### Datei: `ArraySortieren.java`

#### Ausführung:
```bash
javac aufgaben/Aufgabe08_ArraySortieren/ArraySortieren.java
java aufgaben.Aufgabe08_ArraySortieren.ArraySortieren



## Aufgabe 09 – Quadratzahlen von 1 bis 20

### Beschreibung:
Das Programm berechnet und gibt die Quadratzahlen von 1 bis 20 aus. Eine Quadratzahl ist das Produkt einer Zahl mit sich selbst, also z. B. 7 × 7 = 49.

---

### Datei: `Quadratzahlen.java`

#### Ausführung:
```bash
javac aufgaben/Aufgabe09_Quadratzahlen/Quadratzahlen.java
java aufgaben.Aufgabe09_Quadratzahlen.Quadratzahlen



## Aufgabe 10 – Zahlensysteme

### Beschreibung:
Das Programm fragt den Benutzer, welches Zahlensystem er eingeben möchte (Zeichen, Oktal oder Hexadezimal), und wandelt die Eingabe in Dezimal- und Binärzahlen um. Das Programm läuft in einer Schleife, bis der Benutzer „E“ für Ende eingibt.

---

### Datei: `Zahlensysteme.java`

#### Ausführung:
```bash
javac aufgaben/Aufgabe10_Zahlensysteme/Zahlensysteme.java
java aufgaben.Aufgabe10_Zahlensysteme.Zahlensysteme

Menü: Z)eichen, O)ktal, heX), E)nde? Z
Gib ein einzelnes Zeichen ein: A
Dezimal: 65
Binär:   1000001

Menü: Z)eichen, O)ktal, heX), E)nde? O
Gib eine Oktalzahl ein (z.B. 17): 17
Dezimal: 15
Binär:   1111

Menü: Z)eichen, O)ktal, heX), E)nde? X
Gib eine Hexadezimalzahl ein (z.B. 1A): 1A
Dezimal: 26
Binär:   11010

Menü: Z)eichen, O)ktal, heX), E)nde? E
Programm wird beendet.



## Aufgabe 11 – Steuerrechner

### Beschreibung:
Das Programm berechnet Umsatzsteuer und Nettopreis:
1. Fest: 100 € brutto mit 20 % USt
2. Benutzerdefiniert: beliebiger Bruttowert + beliebiger Steuersatz

---

### Datei: `Steuerrechner.java`

#### Ausführung:
```bash
javac aufgaben/Aufgabe11_Steuerrechner/Steuerrechner.java
java aufgaben.Aufgabe11_Steuerrechner.Steuerrechner



## Aufgabe 12 – Sparbuch

### Beschreibung:
Das Programm simuliert die Entwicklung eines Startbetrags über 10 Jahre mit Zinseszins. Zinssatz und Anfangsbetrag werden vom Benutzer eingegeben.

---

### Datei: `Sparbuch.java`

#### Ausführung:
```bash
javac aufgaben/Aufgabe12_Sparbuch/Sparbuch.java
java aufgaben.Aufgabe12_Sparbuch.Sparbuch



## Aufgabe 13 – Polymorphismus

### Beschreibung:
Ein klassisches Beispiel für Vererbung & Polymorphie mit verschiedenen Angestelltenarten: Sekretärin, Verkäufer, Manager. Das Programm zeigt die Verwendung abstrakter Klassen, Überschreiben von Methoden und dynamischem Binden bei der Gehaltsberechnung.

### Klassenstruktur:
- `Angestellter` (abstrakt)
- `Sekretaerin`
- `Verkaeufer`
- `Manager`
- `Gehaltstest` (Testklasse mit polymorphem Array)

### Beispielausgabe:



## JavaScript – Aufgabe 1: Summe berechnen

Eine einfache JS-Funktion, die zwei Zahlen entgegennimmt und deren Summe zurückgibt.

```js
function berechneSumme(a, b) {
    return a + b;
}



## JavaScript – Aufgabe 2: Würfelspiele

Diese Aufgabe besteht aus mehreren kleinen Würfelspielen, die verschiedene Zufallsbedingungen abbilden:

1. **Ein Würfel wird so lange geworfen, bis eine 6 erscheint.**
2. **100 Würfe werden durchgeführt und die Anzahl der Sechser gezählt.**
3. **Zwei Würfel werden geworfen, bis beide die gleiche Augenzahl zeigen.**
4. **Zwei Würfel werden geworfen, bis mindestens einer eine 6 zeigt.**
5. **Zwei Würfel werden geworfen, bis einer eine 6 und der andere eine 1 zeigt.**
6. **Alle Varianten sind über ein Dropdown auswählbar.**

### Technologien
- JavaScript (ES6)
- DOM-Manipulation



## JavaScript – Aufgabe 3: ToDo-Liste

Eine einfache ToDo-App mit folgenden Funktionen:

- Aufgaben hinzufügen über ein Eingabefeld + Button
- Anzeige der Aufgaben in einer HTML-Liste (`<ul>`)
- Aufgaben können als erledigt markiert werden (Checkbox)
- Aufgaben können entfernt werden (Button)
- (Bonus) Aufgaben werden im `localStorage` gespeichert und beim erneuten Öffnen wiederhergestellt

### Technologien
- JavaScript (ES6)
- DOM-Manipulation
- Browser localStorage
