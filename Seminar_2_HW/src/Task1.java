/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public float AskAndGetFloatNumber() {
        boolean flag = true;
        float result = 0.0f; //Тут вопрос:
        /*
        Считаю возможным задать дефолтное значение, так как от пользователя мы не отстаем, пока он не введет свое,
        так что либо поменяется на новое число, либо пользователь введет 0 и нулем, собственно, переменная и останется.
        Но если так:
        - хочу объявить переменную, но не инициировать ее (так как не знаю еще какой она будет)
        - в блоке try-catch произойдет ее инициализация
        - возврат переменной
        Например
        float result;
        try {
        тут что то поделали, в частности инициировали переменную result... пусть даже так
            result = 0.0f;
            } catch () {}
        return result; //тут ошибка
        В такой последовательности IDE выдаст ошибку, так как блок try-catch не обязательно сработает и,
        соответственно, в определенных случаях я буду пытаться вернуть неинициированную переменную...
        Как это лучше обойти?
         */
        while (flag) {
            System.out.println("Please, type a float number (example: 4.5).");
            try {
                String number = reader.readLine();
                result = Float.parseFloat(number);
                flag = false;
            } catch (IOException e) {
                System.out.println("Incorrect input.");
            } catch (NumberFormatException e) {
                System.out.println("Problem with types cast.");
            }
        }
        return result;
    }

}
