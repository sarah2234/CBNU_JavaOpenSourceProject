package Ch5.자료실;

class Practice02_TV {
    private int size;
    public Practice02_TV(int size) {this.size = size;}
    protected int getSize() {return size;}
}

class Practice02_ColorTV extends Practice02_TV {
    private int color;

    public Practice02_ColorTV(int size, int color) {
        super(size);
        this.color = color;
    }

    void printProperty() {
        System.out.println(super.getSize() + "인치 " + color + "컬러");
    }

    protected int getColor() {return color;}
}

public class Practice02_IPTV extends Practice02_ColorTV {
    private String ip;

    public Practice02_IPTV(String ip, int size, int color) {
        super(size, color);
        this.ip = ip;
    }

    @Override
    void printProperty() {
        System.out.println("나의 IPTV는 " + ip + " 주소의 " + super.getSize() + "인치 " + super.getColor() + "컬러");
    }

    public static void main(String[] args) {
        Practice02_IPTV iptv = new Practice02_IPTV("192.1.1.2", 32, 2048);
        iptv.printProperty();
    }
}
