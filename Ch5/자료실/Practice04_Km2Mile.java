package Ch5.자료실;

import java.util.Scanner;

abstract class Practice04_Converter{
    abstract protected double convert(double src);
    abstract protected String getSrcString();
    abstract protected String getDestString();

    protected double ratio;

    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
        System.out.print(getSrcString() + "을 입력하세요>> ");
        double val = sc.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: " + res + getDestString() + "입니다");
        sc.close();
    }
}


public class Practice04_Km2Mile extends Practice04_Converter {
    public Practice04_Km2Mile(double mile) {
        ratio = mile;
    }

    @Override
    protected double convert(double src) {
        return src / ratio;
    }

    @Override
    protected String getSrcString() {
        return "Km";
    }

    @Override
    protected String getDestString() {
        return "mile";
    }

    public static void main(String[] args) {
        Practice04_Km2Mile toMile = new Practice04_Km2Mile(1.6);
        toMile.run();
    }
}
