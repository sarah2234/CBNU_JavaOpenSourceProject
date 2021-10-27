package Ch7.강의자료;

class Ex09_GStack<T> {
    int tos;
    Object [] stck;

    public Ex09_GStack() {
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

public class Ex09_MyStack {
    public static void main(String[] args) {
        Ex09_GStack<String> stringStack = new Ex09_GStack<String>();
        stringStack.push("seoul");
        stringStack.push("busan");
        stringStack.push("LA");
        for(int n = 0; n < 3; n++)
            System.out.println(stringStack.pop());

        Ex09_GStack<Integer> intStack = new Ex09_GStack<Integer>();
        intStack.push(1);
        intStack.push(3);
        intStack.push(5);
        for(int n=0; n<3; n++)
            System.out.println(intStack.pop());
    }
}
