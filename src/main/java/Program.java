import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        doIt();
    }

    static void doIt() {
        try {
            InnerApp.foo();
        } catch (ArithmeticException e) {
            System.out.println("Неверная работа с числом");
//        } catch (IOException e) {
//            System.out.println("Неверный ввод/вывод");
        } catch (Exception e) {
            System.out.println("Что то неверно");

        }
    }
}

class InnerApp {
    static void foo() {
        try {
            int num = bar();
        } catch (MyException e) {
            if (e.a == 20123){
                System.out.println("сработало myException");
            }
        }

    }

    static int bar() throws MyException {
        var ex = new MyException("Проблема с числом");
        ex.a = 20123;
        throw ex;
    }
}

class MyException extends Exception {
    int a;

    public MyException(String msg) {
        super(msg);
    }
}


