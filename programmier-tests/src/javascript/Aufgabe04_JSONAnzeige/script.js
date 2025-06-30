window.addEventListener("DOMContentLoaded", () => {
    fetch("greeting.json")
        .then(response => response.json())
        .then(data => {
            const output = `
                Hallo <span class="salutation">${data.salutation}</span> 
                <span class="firstname">${data.firstname}</span> 
                <span class="surname">${data.surname}</span>
            `;
            document.getElementById("greeting").innerHTML = output;
        })
        .catch(error => {
            document.getElementById("greeting").textContent = "Fehler beim Laden der Begrüßung.";
            console.error("Fehler:", error);
        });
});
