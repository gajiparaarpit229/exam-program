public class Book {
    private String authorName;

    public Book(String authorName) {
        this.authorName = authorName;
    }

    public void displayPublication() {
        System.out.println("Author: " + authorName);
    }
}

class BookPublication extends Book {
    private String title;

    public BookPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    @Override
    public void displayPublication() {
        System.out.println("Book Title: " + title + ", Author: " + super.authorName);
    }
}

class PaperPublication extends Book {
    private String title;

    public PaperPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    @Override
    public void displayPublication() {
        System.out.println("Paper Title: " + title + ", Author: " + super.authorName);
    }
}

public class Main {
    public static void main(String[] args) {
        Book[] publications = new Book[args.length / 2]; // Assuming each publication has 2 arguments (type, title)
        for (int i = 0; i < args.length / 2; i++) {
            String type = args[i * 2];
            String title = args[i * 2 + 1];
            if (type.equalsIgnoreCase("book")) {
                publications[i] = new BookPublication("Author", title); // Assuming the author name is fixed for all books
            } else if (type.equalsIgnoreCase("paper")) {
                publications[i] = new PaperPublication("Author", title); // Assuming the author name is fixed for all papers
            } else {
                System.out.println("Invalid publication type: " + type);
                continue;
            }
            publications[i].displayPublication();
        }
    }
}
