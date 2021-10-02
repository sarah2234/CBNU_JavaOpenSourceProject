package Ch4.과제;
import java.util.Scanner;

class Practice12_ConcertRegistration {
    private String[][] seat;

    public Practice12_ConcertRegistration(int x, int y) {
        seat = new String[x][y];
        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                seat[i][j] = "---";
            }
        }
    }

    public void registration(int grade, String name, int seatNum) {
        seat[grade - 1][seatNum - 1] = name;
    }

    public void printSeat(int grade) {
        switch(grade) {
            case 1:
                System.out.print("S>> ");
                break;
            case 2:
                System.out.print("A>> ");
                break;
            case 3:
                System.out.print("B>> ");
                break;
            default:
                System.out.print("<<<잘못된 좌석 정보입니다.>>>");
                return;
        }

        for(String seatStatus : seat[grade - 1]) {
            System.out.print(seatStatus + " ");
        }
        System.out.println();
    }

    public void cancelRegistration(int grade, String name) {
        for(int i = 0; i < seat[grade - 1].length; i++) {
            if(seat[grade - 1][i].equals(name)) {
                seat[grade - 1][i] = "---";
                System.out.println("<<<삭제를 완료하였습니다.>>>");
                return;
            }
        }
        System.out.println("<<<잘못된 정보입니다.>>>");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Practice12_ConcertRegistration concert = new Practice12_ConcertRegistration(3, 10);
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        int menu, grade, seatNum;
        String name;
        do {
            System.out.print("예약: 1, 조회: 2, 취소: 3, 끝내기: 4>> ");
            menu = scanner.nextInt();
            switch (menu) {
                case 1: // 예약
                    System.out.print("좌석 구분 S(1), A(2), B(3)>> ");
                    grade = scanner.nextInt();
                    if(grade < 0 || grade > 3) {
                        System.out.println("<<<잘못된 좌석 정보입니다.>>>");
                        break;
                    }

                    concert.printSeat(grade);

                    System.out.print("이름>> ");
                    name = scanner.next();
                    System.out.print("번호>> ");
                    seatNum = scanner.nextInt();
                    if(0 > seatNum || seatNum > 10)
                    {
                        System.out.println("<<<잘못된 좌석 정보입니다.>>>");
                        break;
                    }
                    concert.registration(grade, name, seatNum);
                    break;
                case 2: // 조회
                    concert.printSeat(1);
                    concert.printSeat(2);
                    concert.printSeat(3);
                    System.out.println("<<<조회를 완료하였습니다.>>>");
                    break;
                case 3: // 취소
                    System.out.print("좌석 구분 S(1), A(2), B(3)>> ");
                    grade = scanner.nextInt();
                    if(grade < 0 || grade > 3) {
                        System.out.println("<<<잘못된 좌석 정보입니다.>>>");
                        break;
                    }

                    concert.printSeat(grade);
                    System.out.print("이름>> ");
                    name = scanner.next();
                    concert.cancelRegistration(grade, name);
                    break;
                case 4: // 끝내기
                    break;
                default:
                    System.out.println("<<<잘못된 정보입니다.>>>");
            }
        } while(menu != 4);

        scanner.close();
    }
}