import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            Register reg = new Register();
            reg.register(sc);
            
            Login login = new Login(reg.getUsername(), reg.getPassword());
            login.login(sc);
        }
    }
}