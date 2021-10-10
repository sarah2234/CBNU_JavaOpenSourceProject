package Ch5.자료실;

import java.util.Arrays;

abstract class Practice10_PairMap {
    protected String keyArray[]; // key 저장
    protected String valueArray[]; // value 저장
    abstract String get(String key); // key 값을 가진 value 리턴, 없으면 null 리턴
    abstract void put(String key, String value); // key와 value를 쌍으로 저장. 기존에 key 존재 시 value로 값 수정
    abstract String delete(String key); // key 값을 가진 아이템(value) 삭제, 삭제된 value 리턴
    abstract int length(); // 현재 저장된 아이템의 개수 리턴
}

class Practice10_Dictionary extends Practice10_PairMap {
    public Practice10_Dictionary(int length) {
        keyArray = new String[length];
        valueArray = new String[length];
    }

    @Override
    public String get(String key) {
        for(int i = 0; i < keyArray.length; i++) {
            if(key.equals(keyArray[i])) return valueArray[i];
        }
        return null;
    }

    @Override
    public void put(String key, String value) {
        for(int i = 0; i < keyArray.length; i++) {
            if(key.equals(keyArray[i])) {
                valueArray[i] = value;
                return;
            }
        }
        String newArray[] = Arrays.copyOf(keyArray, keyArray.length + 1);
        keyArray = newArray;
        keyArray[keyArray.length - 1] = key;

        newArray = Arrays.copyOf(valueArray, valueArray.length + 1);
        valueArray = newArray;
        valueArray[valueArray.length - 1] = value;
    }

    @Override
    public String delete(String key) {
        for(int i = 0; i < keyArray.length; i++) {
            if(key.equals(keyArray[i])) {
                keyArray[i] = null;
                String value = valueArray[i];
                valueArray[i] = null;
                return value;
            }
        }
        return null;
    }

    @Override
    public int length() {
        return keyArray.length;
    }
}

public class Practice10_DictionaryApp {
    public static void main(String[] args) {
        Practice10_Dictionary dic = new Practice10_Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이썬");
        dic.put("이재문", "C++"); // 수정
        System.out.println("이재문의 값은 " + dic.get("이재문"));
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 " + dic.get("황기태"));
    }
}
