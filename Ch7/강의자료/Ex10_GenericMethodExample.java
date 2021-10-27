package Ch7.강의자료;

class Ex10_GStack<T> {
    int tos;
    Object [] stck;

    public Ex10_GStack() {
        tos = 0;
        stck = new Object [10];
    }

    public void push(T item) {
        if(tos == 10)
            return;
        stck[tos] = item;
        tos++;
    }

    public T pop() {
        if(tos == 0)
            return null;
        tos--;
        return (T)stck[tos];
    }
}

public class Ex10_GenericMethodExample {
    public static <T> Ex10_GStack<T> reverse(Ex10_GStack<T> a) {
        Ex10_GStack<T> s = new Ex10_GStack<T>();
        while (true) {
            T tmp;
            tmp = a.pop();
            if (tmp==null)
                break;
            else
                s.push(tmp);
        }
        return s;
    }

    public static void main(String[] args) {
        Ex10_GStack<Double> gs = new Ex10_GStack<Double>();
        for (int i = 0; i < 5; i++) {
            gs.push(new Double(i));
        }

        gs = reverse(gs);
        for (int i = 0; i < 5; i++) {
            System.out.println(gs.pop());
        }
    }
}
