package Ch5.강의자료;

class Ex06_Weapon {
    protected int fire() {
        return 1; // 무기는 기본적으로 한 명만 살상
    }
}

class Ex06_Cannon extends Ex06_Weapon {
    @Override
    protected int fire() { // 오버라이딩
        return 10; // 대포는 한 번에 10명을 살상
    }
}

public class Ex06_Overriding {
    public static void main(String[] args) {
        Ex06_Weapon weapon;
        weapon = new Ex06_Weapon();
        System.out.println("기본 무기의 살상 능력은 " + weapon.fire());
        weapon = new Ex06_Cannon();
        System.out.println("대포의 살상 능력은 " + weapon.fire());
    }
}
