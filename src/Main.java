import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Main_Menu.MainMenu();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}