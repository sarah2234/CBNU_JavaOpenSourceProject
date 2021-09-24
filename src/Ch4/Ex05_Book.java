package Ch4;

public class Ex05_Book {
    String title;
    String author;
    public Ex05_Book() {
        this("", "");
        System.out.println("생성자 호출됨");
    }
    public Ex05_Book(String title) {
        this(title, "작자미상");
    }
    public Ex05_Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    void show() {
        System.out.println(title + " " + author);
    }

    public static void main(String [] args) {
        Ex05_Book littlePrince = new Ex05_Book("어린왕자", "생텍쥐페리");
        Ex05_Book loveStory = new Ex05_Book("춘향전");
        Ex05_Book emptyBook = new Ex05_Book();
        loveStory.show();
        // bible.show();
    }
}
