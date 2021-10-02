package Ch4.과제;

public class Practice04_Rectangle {
    int x, y, width, height;

    public Practice04_Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        int a;
    }

    public int square() {
        return width * height;
    }

    public void show() {
        System.out.println("(" + x + ", " + y + ")에서 크기가 " + width + "x" + height + "인 사각형");
    }

    public boolean contains(Practice04_Rectangle r) {
        if(this.x < r.x && this.y < r.y && (this.width + this.x) > (r.width + r.x) && (this.height + this.y) > (r.height+ r.y)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Practice04_Rectangle r = new Practice04_Rectangle(2, 2, 8, 7);
        Practice04_Rectangle s = new Practice04_Rectangle(5, 5, 6, 6);
        Practice04_Rectangle t = new Practice04_Rectangle(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 " + s.square());
        if(t.contains(r)) System.out.println("t는 r를 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
    }
}
