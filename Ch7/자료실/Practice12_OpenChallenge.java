package Ch7.자료실;

import java.util.*;

class Practice12_Word {
    private String eng, ans;

    public Practice12_Word(String eng, String ans) {
        this.eng = eng;
        this.ans = ans;
    }

    public String getEng() {
        return eng;
    }

    public String getAns() {
        return ans;
    }

    public boolean checkAns(String ans) {
        if(this.ans.equals(ans)) {
            return true;
        }
        return false;
    }
}

public class Practice12_OpenChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Practice12_Word> quizzes = new Vector<>();
        quizzes.add(new Practice12_Word("eye", "눈"));
        quizzes.add(new Practice12_Word("human", "인간"));
        quizzes.add(new Practice12_Word("fault", "오류"));
        quizzes.add(new Practice12_Word("emotion", "감정"));
        quizzes.add(new Practice12_Word("painting", "그림"));
        quizzes.add(new Practice12_Word("animal", "동물"));
        int menu = 0;
        System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\"입니다. ****");
        do {
            System.out.print("단어 테스트 : 1, 단어 삽입 : 2, 종료 : 3>> ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("현재 " + quizzes.size() + "개의 단어가 들어있습니다. -1을 입력하면 테스트를 종료합니다.");
                    for(Practice12_Word word : quizzes) {
                        System.out.println(word.getEng() + "?");
                        String choices[] = new String[4];
                        for(int i = 0, re = i; i < 4; i++) {
                            int choice = (int) (Math.random() * quizzes.size());
                            choices[i] = quizzes.get(choice).getAns();
                            if(choices[i].equals(word.getAns())) {
                                i = re;
                            }
                            for(int j = 0; j < i; j++) {
                                if(choices[j].equals(choices[i])) {
                                     i = re;
                                }
                                else if(j == i - 1) {
                                    re = i;
                                }
                            }
                        }
                        choices[(int)(Math.random() * 4)] = word.getAns();
                        System.out.print("(1)" + choices[0] + " (2)" + choices[1]
                                + " (3)" + choices[2] + " (4)" + choices[3] + ">> ");
                        try {
                            menu = scanner.nextInt();
                            if(menu == -1) break;
                            if(word.checkAns(choices[menu - 1])) {
                                System.out.println("Excellent!");
                            }
                            else {
                                System.out.println("No!");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("숫자를 입력하세요!");
                        }
                    }
                    break;
                case 2:
                    System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
                    while(true) {
                        System.out.print("영어 한글 입력>> ");
                        String eng = scanner.next();
                        if(eng.equals("그만")) break;
                        String ans = scanner.next();
                        quizzes.add(new Practice12_Word(eng, ans));
                    }
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    break;
            }
        } while(menu != 3);
    }
}
