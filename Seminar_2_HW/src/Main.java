import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean working = true;

        Task1 task1 = new Task1();

        while (working){

            System.out.println("Hello!\nChose the task you want to work with\n" +
                    "(enter the number 1, 2, 3 or 4)\n" +
                    "Or type 'q' to stop the program.");

            try {
                String choice = reader.readLine().toLowerCase();
                switch (choice){
                    case ("1"):
                        System.out.println(task1.AskAndGetFloatNumber());
                        break;
                    case ("2"):
                        System.out.println("2");
                        break;
                    case ("3"):
                        System.out.println("3");
                        break;
                    case ("4"):
                        System.out.println("4");
                        break;
                    case ("q"):
                        System.out.println("q");
                        working = false;
                        break;
                    default:
                        System.out.println("Incorrect input. Please, try again.");
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }


        }

    }
}