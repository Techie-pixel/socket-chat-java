<div align="center">
  <img src="https://img.icons8.com/color/150/000000/client-management.png" alt="Client Server Logo">

  <h1>🖧 Java Client-Server Chat Application</h1>
  <p><strong>A Socket-Based Network Application for Real-Time Client-Server Communication</strong></p>

  <p>
    <a href="https://www.java.com/"><img src="https://img.shields.io/badge/Language-Java-f89820?style=for-the-badge&logo=java&logoColor=white" alt="Java" /></a>
    <a href="https://docs.oracle.com/javase/8/docs/api/java/net/Socket.html"><img src="https://img.shields.io/badge/Network-Java_Sockets-007396?style=for-the-badge&logo=java&logoColor=white" alt="Sockets" /></a>
    <a href="https://code.visualstudio.com/"><img src="https://img.shields.io/badge/IDE-VS_Code-0078D4?style=for-the-badge&logo=visual-studio-code&logoColor=white" alt="VS Code" /></a>
    <a href="#"><img src="https://img.shields.io/badge/Platform-Windows-0078D6?style=for-the-badge&logo=windows&logoColor=white" alt="Windows" /></a>
  </p>
</div>

---

## 📖 About The Project

This **Java Client-Server Application** demonstrates core concepts of **socket programming** and **network communication** using Java's `java.net` package. The server listens on a dedicated port, accepts an incoming client connection, receives two numbers, and performs multiple arithmetic/logical operations on demand — all over a live TCP socket connection.

The project is ideal for understanding how real-world networked applications communicate, how data is sent and received over sockets, and how a persistent session loop enables multiple operations without reconnecting.

---

## ✨ Features

### 🖥️ Server Side
- **📡 Socket Listener:** Starts a `ServerSocket` on port `20074` and waits for client connections.
- **🔢 Number Processing:** Receives two integers from the client and holds them in memory for the session.
- **🔁 Persistent Loop:** Keeps the connection alive and serves multiple operations in a single session.
- **📤 Result Dispatch:** Computes and sends results back to the client after every operation.
- **🔌 Clean Disconnect:** Gracefully closes the connection when the client sends choice `4`.

### 💻 Client Side
- **🔗 Auto Connect:** Connects to the server on `localhost:20074` automatically on startup.
- **📥 Number Input:** Takes two integers from the user and sends them to the server.
- **📋 Interactive Menu:** Displays an operation menu repeatedly until the user disconnects.
- **📨 Live Results:** Receives and displays the server's computed result in real time.

---

## 🛠️ Operations Supported

| Choice | Operation | Example Output |
| :---: | :--- | :--- |
| **1** | Odd / Even Check | `First: Even, Second: Even` |
| **2** | Positive / Negative Check | `First: Positive, Second: Positive` |
| **3** | Square of Both Numbers | `Square of first: 1156, Square of second: 3136` |
| **4** | Disconnect Client & Server | `Disconnected. Goodbye!` |

---

## 🏗️ Technical Stack

| Technology | Usage |
| :--- | :--- |
| **Java** | Core programming language |
| **java.net.Socket** | Client-side TCP socket connection |
| **java.net.ServerSocket** | Server-side connection listener |
| **java.io.BufferedReader** | Reading data from the socket stream |
| **java.io.PrintWriter** | Writing/sending data over the socket |
| **java.util.Scanner** | Reading user input from the console |

---

## 📁 Project Structure

```
client-server/
├── src/
│   └── king/
│       ├── Server.java       # Server-side socket logic
│       └── Client.java       # Client-side socket logic
├── king/                     # Compiled .class files (auto-generated)
└── README.md
```

---

## ⚙️ How To Run

### 📋 Prerequisites
- **Java JDK** installed (version 8 or above)
- **VS Code** with **Extension Pack for Java** installed
- Two terminal windows (split terminal recommended)

---

### 🚀 Step-by-Step Setup

#### Step 1 — Create folder structure
```bash
mkdir -p src\king
```

#### Step 2 — Copy files into the package folder
```bash
copy Client.java src\king\Client.java
copy Server.java src\king\Server.java
```

#### Step 3 — Compile both files
```bash
javac -d . src\king\Server.java src\king\Client.java
```

#### Step 4 — Start the Server (Terminal 1)
```bash
java king.Server
```

#### Step 5 — Open a second terminal
Press `Ctrl + Shift + 5` in VS Code to split the terminal.

#### Step 6 — Start the Client (Terminal 2)
```bash
java king.Client
```

---

## 🖥️ Output Screenshot

### Terminal 1 — Server
```
copy Server.java src\king\Server.java
javac -d . src\king\Server.java src\king\Client.java
java king.Server
Server is running and waiting for a client...
Client connected!
Numbers received: 34, 56
Sent: First: Positive, Second: Positive
Sent: First: Even, Second: Even
Client disconnected.
```

### Terminal 2 — Client
```
java king.Client
Connected to server!
Enter first number: 34
Enter second number: 56

--- MENU ---
1 -> Odd/Even check
2 -> Positive/Negative check
3 -> Square of two numbers
4 -> Disconnect
Your choice: 2
Server result: First: Positive, Second: Positive

--- MENU ---
1 -> Odd/Even check
2 -> Positive/Negative check
3 -> Square of two numbers
4 -> Disconnect
Your choice: 1
Server result: First: Even, Second: Even

--- MENU ---
1 -> Odd/Even check
2 -> Positive/Negative check
3 -> Square of two numbers
4 -> Disconnect
Your choice: 4
Server result: Disconnected. Goodbye!
Program ended.
```

---

## ⚠️ Important Notes

> **Always start the Server before the Client.**  
> If the Client is started first, it will throw a `Connection refused` error because there is no server listening yet.

> **Port used:** `20074` — make sure no other application is using this port.

---

## 📤 How to Push to GitHub

### Step 1 — Initialize Git
```bash
git init
```

### Step 2 — Add all files
```bash
git add .
```

### Step 3 — First commit
```bash
git commit -m "Initial commit: Java Client-Server Chat Application"
```

### Step 4 — Create repo on GitHub
Go to [github.com](https://github.com) → Click **New Repository** → Name it → Click **Create Repository**

### Step 5 — Link and push
```bash
git branch -M main
git remote add origin https://github.com/YOUR_USERNAME/java-client-server-app.git
git push -u origin main
```

---

## 👨‍💻 Author

Made with ☕ and Java Sockets.

---

<div align="center">
  <p>⭐ If you found this helpful, give it a star on GitHub!</p>
</div>
