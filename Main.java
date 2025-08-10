public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding Books
        library.addBook(new Book("The Alchemist", "Paulo Coelho"));
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("Java Programming", "James Gosling"));

        // Adding Users
        library.addUser(new User("Alice", 101));
        library.addUser(new User("Bob", 102));

        // Display Books
        library.showBooks();

        // Issue and Return
        library.issueBook("The Alchemist", 101);
        library.showBooks();

        library.returnBook("The Alchemist");
        library.showBooks();

        // Trying to issue unavailable book
        library.issueBook("Unknown Book", 102);
    }
}