import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user);
    }

    public void issueBook(String title, int userId) {
        Book bookToIssue = findBook(title);
        User user = findUser(userId);

        if (bookToIssue != null && user != null) {
            bookToIssue.issue();
        } else {
            System.out.println("Book or User not found.");
        }
    }

    public void returnBook(String title) {
        Book bookToReturn = findBook(title);
        if (bookToReturn != null) {
            bookToReturn.returnBook();
        } else {
            System.out.println("Book not found.");
        }
    }

    public void showBooks() {
        System.out.println("\nBooks in Library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    private User findUser(int userId) {
        for (User user : users) {
            if (user.getUserId() == userId) {
                return user;
            }
        }
        return null;
    }
}