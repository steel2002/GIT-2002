const apiUrl = "http://localhost:3000";

// Fetch and display all tasks

async function fetchTasks() {
  const res = await fetch(`${apiUrl}/getalltask`);
  const tasks = await res.json();
  displayTasks(tasks);
}

// Display tasks in the list

function displayTasks(tasks) {
  const list = document.getElementById("taskList");
  list.innerHTML = "";
  tasks.forEach(task => {
    const li = document.createElement("li");
    li.textContent = task.task;
    if (task.status) {
      li.classList.add("completed");
    }

    // Complete button

    const completeBtn = document.createElement("button");
    completeBtn.textContent = "complete✅";
    completeBtn.onclick = () => markAsRead(task.id);

    // Delete button

    const deleteBtn = document.createElement("button");
    deleteBtn.textContent = "delete❌";
    deleteBtn.onclick = () => deleteTask(task.id);

    li.appendChild(completeBtn);
    li.appendChild(deleteBtn);
    list.appendChild(li);
  });
}

// Add new task

async function addTask() {
  const input = document.getElementById("taskInput");
  const task = input.value.trim();
  if (task === "") {
    alert("Please enter a task.");
    return;
  }

  await fetch(`${apiUrl}/addtask`, {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify({ task })
  });

  input.value = "";
  fetchTasks();
}

// Mark task as completed

async function markAsRead(id) {
  await fetch(`${apiUrl}/markasread`, {
    method: "PUT",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify({ id })
  });
  fetchTasks();
}

// Delete task
async function deleteTask(id) {
  await fetch(`${apiUrl}/Delete`, {
    method: "DELETE",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify({ id })
  });
  fetchTasks();
}

fetchTasks();
