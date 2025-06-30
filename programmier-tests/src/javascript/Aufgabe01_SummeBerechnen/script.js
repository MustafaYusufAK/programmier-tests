function berechneSumme(a, b) {
    return a + b;
}

const zahl1 = 3;
const zahl2 = 5;
const summe = berechneSumme(zahl1, zahl2);

console.log("Summe von", zahl1, "+", zahl2, "=", summe);

const ergebnisText = `Die Summe von ${zahl1} und ${zahl2} ist ${summe}.`;

const p = document.createElement("p");
p.textContent = ergebnisText;

document.body.appendChild(p);
