// Дан следующий код, исправьте его там, где требуется
// Оригинал: https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit

public class Task3 {
    public static void task3Method() // throws Exception { //Тут правка так как пишу в своем классе
            //Единственное убираем throws Exception, так как обрабатываем все в методе
    {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
//        } catch (Throwable ex) { //Убрать, так как NullPointerException и IndexOutOfBoundsException и так наследуются
            // от Throwable
//            System.out.println("Что-то пошло не так...");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }
    public static void printSum(Integer a, Integer b) // throws FileNotFoundException //Убрать это, так как в методе с файлами не работаем
    {
        System.out.println(a + b);
    }

}
