package Ch8.자료실;

import java.util.*;
import java.io.*;

public class Practice14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***** 파일 탐색기입니다. *****");
        String path = ".\\", parent = ".\\";
        while(true) {
            File dir = new File(path);
            if(!dir.exists()) {
                System.out.println("잘못된 명령입니다.");
                path = parent;
            }
            else {
                System.out.println("[" + path + "] " + "(c:\\ 대신 프로젝트 폴더를 기준으로 탐색하였습니다.)");
                File[] files = dir.listFiles();
                for (File file : files) {
                    String res = "";
                    if (file.isFile()) {
                        res = "file";
                    } else if (file.isDirectory()) {
                        res = "dir";
                    }
                    System.out.println(res + "\t" + file.length() + "바이트\t" + file.getPath());
                }
            }
            System.out.print(">> ");
            String command = scanner.nextLine();
            if(command.equals("그만"))
                break;
            command = command.strip();
            if (command.equals("..")) {
                path = parent;
            }
            else if (command.length() > 6 && command.substring(0, 6).contains("rename")) {
                String fileName = command.substring(command.indexOf(" "), command.lastIndexOf(" "));
                fileName = fileName.strip();
                File changeName = new File(path + fileName);
                if(!changeName.exists()) {
                    System.out.println("존재하지 않는 파일입니다.");
                }
                else {
                    String newName = command.substring(command.lastIndexOf(" "));
                    newName = path + newName.strip();
                    changeName.renameTo(new File(newName));
                }
            }
            else if (command.length() > 6 && command.substring(0, 6).contains("mkdir")) {
                String newDirName = command.substring(command.indexOf(" "));
                newDirName = newDirName.strip();
                File newDir = new File(path + newDirName);
                if(!newDir.exists()) {
                    newDir.mkdir();
                    System.out.println(newDirName + " 디렉터리를 생성하였습니다.");
                }
                else
                    System.out.println("이미 존재하는 디렉터리 입니다.");
            }
            else {
                parent = path;
                path += command + "\\";
            }
        }
    }
}
