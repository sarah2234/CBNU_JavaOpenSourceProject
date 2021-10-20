package Ch6.강의자료;

class Ex04_Rect {
    int width;
    int height;

    public Ex04_Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public boolean equals(Object obj) {
        Ex04_Rect p = (Ex04_Rect)obj;
        if (width*height == p.width*p.height)
            return true;
        else
            return false;
    }
}

public class Ex04_EqualsEx {
    public static void main(String[] args) {
        Ex04_Rect a = new Ex04_Rect(2,3);
        Ex04_Rect b = new Ex04_Rect(3,2);
        Ex04_Rect c = new Ex04_Rect(3,4);
        if(a.equals(b))
            System.out.println("a is equal to b");
        if(a.equals(c))
            System.out.println("a is equal to c");
        if(b.equals(c))
            System.out.println("b is equal to c");
    }
}
