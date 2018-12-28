import java.io.*;

public class Stars {
    String email;
    char[] chars;

    public Stars(String email) {
        this.email = email;
    }

    void printEmail() {
        System.out.println(email);
    }

    void replacement() {
        int Et = this.email.lastIndexOf('@');
        int dot = this.email.lastIndexOf('.');
        char[] chars = this.email.toCharArray();
        for (int i = Et+1; i < dot; i++) {
            chars[i] = '*';
        }
        email = new String(chars);
    }
}
