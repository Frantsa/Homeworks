package Homework4;

import java.util.Scanner;

public class tack7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your operating system:Linux/macOS/Windows");
        String os = input.next();
        String app;
        switch (os.toUpperCase()){
            case ("LINUX"):
                System.out.println("Enter  the programme to download : IntelliJ IDEA/Git/Java");
                app = input.next();
                switch (app.toUpperCase()){
                    case("INTELLIJ"):
                        System.out.println("Link for download IntelliJ IDEA for Linux");
                        break;
                    case("GIT"):
                        System.out.println("Link for download Git for Linux");
                        break;
                    case("JAVA"):
                        System.out.println("Link for download Java for Linux");
                        break;
                    default:
                        System.out.println("Programme not found!");
                }
                break;
            case ("MACOS"):
                System.out.println("Enter  the programme to download : IntelliJ IDEA/Git/Java");
                app = input.next();
                switch (app.toUpperCase()){
                    case("INTELLIJ"):
                        System.out.println("Link for download IntelliJ IDEA for macOS");
                        break;
                    case("GIT"):
                        System.out.println("Link for download Git for macOS");
                        break;
                    case("JAVA"):
                        System.out.println("Link for download Java for macOS");
                        break;
                    default:
                        System.out.println("Programme not found!");
                }
                break;
            case ("WINDOWS"):
                System.out.println("Enter  the programme to download : IntelliJ IDEA/Git/Java");
                app = input.next();
                switch (app.toUpperCase()){
                    case("INTELLIJ"):
                        System.out.println("Link for download IntelliJ IDEA for Windows");
                        break;
                    case("GIT"):
                        System.out.println("Link for download Git for Windows");
                        break;
                    case("JAVA"):
                        System.out.println("Link for download Java for Windows");
                        break;
                    default:
                        System.out.println("Programme not found!");
                }
                break;
            default:
                System.out.println("OS not found!");
        }


    }
}
