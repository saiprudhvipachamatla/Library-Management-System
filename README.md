# Library Management System (Java OOP)

##  Overview
This is a simple **Library Management System** implemented in Java using **Object-Oriented Programming (OOP)** principles.  
It allows adding books, adding users, issuing books, returning books, and displaying available books.

##  Technologies Used
- Java
- VS Code (or any Java IDE)
- Terminal / Command Prompt

## Project Structure

LibraryManagement/
 ├── Book.java        # Book class
 ├── User.java        # User class
 ├── Library.java     # Library class
 └── Main.java        # Main execution file
```

## Features
- Add new books
- Add new users
- Issue books to users
- Return books
- View all books (Available / Issued status)

##  Example Output

Book added: The Alchemist by Paulo Coelho (Available)
Book added: 1984 by George Orwell (Available)
Book added: Java Programming by James Gosling (Available)
User added: User ID: 101, Name: Alice
User added: User ID: 102, Name: Bob

Books in Library:
The Alchemist by Paulo Coelho (Available)
1984 by George Orwell (Available)
Java Programming by James Gosling (Available)

The Alchemist has been issued.

Books in Library:
The Alchemist by Paulo Coelho (Issued)
1984 by George Orwell (Available)
Java Programming by James Gosling (Available)

The Alchemist has been returned.

Books in Library:
The Alchemist by Paulo Coelho (Available)
1984 by George Orwell (Available)
Java Programming by James Gosling (Available)

Book or User not found.
##  How to Run
1. **Clone this repository**  
   ```bash
   git clone https://github.com/your-username/LibraryManagementSystem.git
   cd LibraryManagementSystem
   ```

2. **Compile the Java files**  
   ```bash
   javac *.java
   ```

3. **Run the program**  
   ```bash
   java Main
   ```

## License
This project is open-source and free to use.
