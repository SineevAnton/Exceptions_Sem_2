// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String InputSomething() {
        boolean flag = true;
        String result = "";
        while (flag) {
            System.out.println("Please, type something, except empty string.");
            try {
                result = reader.readLine();
                if (result.equals("")){
                    throw new RuntimeException();
                }
                flag = false;
            } catch (IOException e) {
                System.out.println("Incorrect input.");
            } catch (RuntimeException e) {
                System.out.println("String shouldn't be empty.");
            }
        }
        return result;
    }
}
