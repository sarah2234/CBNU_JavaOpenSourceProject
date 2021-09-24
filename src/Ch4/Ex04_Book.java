package Ch4;

public class Ex04_Book {
    String title;
    String author;
    public Ex04_Book(String t) {
        title = t; author = "작자미상";
    }
    public Ex04_Book(String t, String a) {
        title = t; author = a;
    }
    public static void main(String [] args) {
        Ex04_Book littlePrince = new Ex04_Book("어린왕자", "생텍쥐페리");
        Ex04_Book loveStory = new Ex04_Book("춘향전");

        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " " + loveStory.author);
    }
}
