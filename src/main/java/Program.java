import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        doIt();
    }
    static void doIt(){
        try {
            InnerApp.foo();
        }
        catch (ArithmeticException e){
            System.out.println("Неверная работа с числом");
        }
        catch (IOException e){
            System.out.println("Неверный ввод/вывод");
        }
        catch (Exception e){
            System.out.println("Что то неверно");

        }
    }
}
class InnerApp{
    static void foo() throws Exception{
        int num = bar();
        throw new Exception("Проблема не с числом");
    }
    static int bar() throws Exception{
        throw new Exception("Проблема с числом");

    }
}
