document.addEventListener("DOMContentLoaded", () => {
    const ajaxContainer = document.getElementById("ajaxContainer");
    const todoContainer = document.getElementById("todoContainer");

    // a) AJAX-Button auf index.html
    document.getElementById("loadAjax").addEventListener("click", () => {
        loadHtmlInto("ajax.html", ajaxContainer, true);
    });

    // b) Lade todo.html nach Seitenstart
    loadHtmlInto("todo.html", todoContainer, false, setupTodoForm);
});

// HTML-Datei per fetch() laden
function loadHtmlInto(file, container, rebindReloadBtn = false, callback = null) {
    fetch(file)
        .then(res => res.text())
        .then(html => {
            container.innerHTML = html;

            // Buttons aus ajax.html reaktivieren
            if (rebindReloadBtn) {
                const reloadBtn = container.querySelector(".reloadAjax");
                const innerDiv = container.querySelector(".innerAjaxContainer");
                if (reloadBtn && innerDiv) {
                    reloadBtn.addEventListener("click", () => {
                        loadHtmlInto("ajax.html", innerDiv, true);
                    });
                }
            }

            if (typeof callback === "function") callback();
        })
        .catch(err => {
            container.innerHTML = "<p>Fehler beim Laden von " + file + "</p>";
            console.error(err);
        });
}

// ToDo-Logik nachladen
function setupTodoForm() {
    const input = document.getElementById("todoInput");
    const btn = document.getElementById("addTodo");
    const liste = document.getElementById("todoListe");

    if (!input || !btn || !liste) return;

    btn.addEventListener("click", () => {
        const text = input.value.trim();
        if (text === "") return;

        const li = document.createElement("li");
        li.textContent = text;
        liste.appendChild(li);
        input.value = "";
        input.focus();
    });
}
