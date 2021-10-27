package Ch7.자료실;

import java.util.*;

class Practice06_Location {
    String city;
    int latitude, longitude;

    public Practice06_Location(String city, int longitude, int latitude) {
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}

public class Practice06_HashMap {
    public static void main(String[] args) {
        HashMap<String, Practice06_Location> city = new HashMap<String, Practice06_Location>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("도시, 경도, 위도를 입력하세요.");
        for(int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String info = scanner.nextLine();
            String[] s = info.split(",");
            for(int j = 0; j < 3; j++) {
                s[j] = s[j].strip();
            }
            city.put(s[0], new Practice06_Location(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2])));
        }
        Set<String> keySet = city.keySet();
        System.out.println("-------------------------------------");

        for(String key : keySet) {
            System.out.println(city.get(key).city + "\t" + city.get(key).longitude + "\t" + city.get(key).latitude);
        }

        while(true) {
            System.out.print("도시 이름>> ");
            String input = scanner.next();
            if(input.equals("그만")) break;

            if(city.containsKey(input))
                System.out.println(city.get(input).city + "\t" + city.get(input).longitude + "\t" + city.get(input).latitude);
            else
                System.out.println(input + "는 없습니다.");
        }
    }
}
