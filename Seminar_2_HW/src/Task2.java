// Если необходимо, исправьте данный код
// Оригинал: https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit

public class Task2 {
/*
Честно говоря тут не совсем понятно насколько именно надо исправлять код.
Понятно что тут проблема с тем что не объявлен массив и присутствует деление на 0.
Поэтому если задать пустой массив - мы словим ArrayIndexOutOfBoundsException
А если создать массив, у которого максимальный индекс больше либо равен 8
 (закомментированная строка) - словим ArithmeticException
 */
    public void codeToCorrect(){
        try {
            //double[] intArray = {1,2,3,4,5,6,7,8,9,10}; //First correction
            double[] intArray = {};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) { //Second correction
            System.out.println("Catching exception: " + e);
        }
    }
}
