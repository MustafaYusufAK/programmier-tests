const todoInput = document.getElementById("todoInput");
const addBtn = document.getElementById("addBtn");
const todoListe = document.getElementById("todoListe");

let todos = JSON.parse(localStorage.getItem("todos")) || [];

function renderTodos() {
    todoListe.innerHTML = "";

    todos.forEach((todo, index) => {
        const li = document.createElement("li");

        const checkbox = document.createElement("input");
        checkbox.type = "checkbox";
        checkbox.checked = todo.done;
        checkbox.addEventListener("change", () => {
            todos[index].done = checkbox.checked;
            saveTodos();
        });

        const span = document.createElement("span");
        span.textContent = todo.text;
        if (todo.done) {
            span.style.textDecoration = "line-through";
        }

        const entfernenBtn = document.createElement("button");
        entfernenBtn.textContent = "Entfernen";
        entfernenBtn.addEventListener("click", () => {
            todos.splice(index, 1);
            saveTodos();
            renderTodos();
        });

        li.appendChild(checkbox);
        li.appendChild(span);
        li.appendChild(entfernenBtn);
        todoListe.appendChild(li);
    });
}

function saveTodos() {
    localStorage.setItem("todos", JSON.stringify(todos));
}

addBtn.addEventListener("click", () => {
    const text = todoInput.value.trim();
    if (text !== "") {
        todos.push({ text, done: false });
        saveTodos();
        renderTodos();
        todoInput.value = "";
        todoInput.focus();
    }
});

renderTodos();