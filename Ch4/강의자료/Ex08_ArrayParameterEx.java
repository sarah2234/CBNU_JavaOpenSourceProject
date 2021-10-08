package Ch4.강의자료;

public class Ex08_ArrayParameterEx {
    static void replaceSpace(char c[]) {
        for(int i = 0; i < c.length; i++) {
            if(c[i] == ' ') {
                c[i] = ',';
            }
        }
    }

    static void printCharArray(char c[]) {
        System.out.println(c);
    }

    public static void main(String[] args) {
        char c[]={'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
        printCharArray(c);
        replaceSpace(c);
        printCharArray(c);
    }
}
