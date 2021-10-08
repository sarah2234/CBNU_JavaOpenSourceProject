package Ch5.강의자료;

interface Ex08_PhoneInterface {
    int TIMEOUT = 10000;
    void sendCall();
    void receiveCall();
    default void printLogo() { // 선택 사항
        System.out.println("** Phone **");
    }
}

class Ex08_SamsungPhone implements Ex08_PhoneInterface {
    @Override
    public void sendCall() {
        System.out.println("띠리리리링");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화가 왔습니다.");
    }

    // 추가 메소드
    public void flash() {
        System.out.println("전화기에 불이 켜졌습니다.");
    }
}
public class Ex08_InterfaceEx {
    public static void main(String[] args) {
        Ex08_SamsungPhone phone = new Ex08_SamsungPhone();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        phone.flash();
    }
}
