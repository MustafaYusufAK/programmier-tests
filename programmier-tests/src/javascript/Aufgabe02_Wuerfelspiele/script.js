function wuerfeln() {
    return Math.floor(Math.random() * 6) + 1;
}

function startSpiel() {
    const spiel = document.getElementById("spiel").value;
    const output = document.getElementById("output");
    let result = "";

    switch (spiel) {
        case "1": {
            let anzahl = 0;
            let wuerfel;
            do {
                wuerfel = wuerfeln();
                anzahl++;
            } while (wuerfel !== 6);
            result = `Es wurden ${anzahl} Würfe benötigt, um eine 6 zu würfeln.`;
            break;
        }

        case "2": {
            let sechser = 0;
            for (let i = 0; i < 100; i++) {
                if (wuerfeln() === 6) sechser++;
            }
            result = `In 100 Würfen kamen ${sechser} Sechser vor.`;
            break;
        }

        case "3": {
            let versuche = 0;
            let w1, w2;
            do {
                w1 = wuerfeln();
                w2 = wuerfeln();
                versuche++;
            } while (w1 !== w2);
            result = `Nach ${versuche} Würfen hatten beide Würfel die gleiche Augenzahl: ${w1}.`;
            break;
        }

        case "4": {
            let versuche = 0;
            let w1, w2;
            do {
                w1 = wuerfeln();
                w2 = wuerfeln();
                versuche++;
            } while (w1 !== 6 && w2 !== 6);
            result = `Nach ${versuche} Würfen hatte einer der beiden Würfel eine 6 (${w1} und ${w2}).`;
            break;
        }

        case "5": {
            let versuche = 0;
            let w1, w2;
            do {
                w1 = wuerfeln();
                w2 = wuerfeln();
                versuche++;
            } while (!((w1 === 6 && w2 === 1) || (w1 === 1 && w2 === 6)));
            result = `Nach ${versuche} Würfen hatte ein Würfel eine 6 und der andere eine 1 (${w1} & ${w2}).`;
            break;
        }

        default:
            result = "Ungültige Auswahl.";
    }

    output.textContent = result;
}
