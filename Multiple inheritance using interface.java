import java.util.*;

interface classA{
    public void fun1();
}
interface classB{
    public void fun2();
}
class classC implements classA,classB{
    public void fun1(){
        System.out.println("Hello");
    }
    public void fun2(){
        System.out.println("Hi");
    }
}
class HelloWorld {
    public static void main(String[] args) {
       classC obj = new classC();
       obj.fun1();
       obj.fun2();
    }
}
