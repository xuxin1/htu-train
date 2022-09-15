package j_09_15;
import static java.lang.System.*;

// 定义一个抽象类
abstract class People{
    private String name;  // 实例变量

    // 共有的 setter 和 getter 方法
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    // 抽象方法
    public abstract void work();
}
class Teacher extends People{
    // 必须实现该方法
    public void work(){
        out.println("我的名字叫" + this.getName() + "，大家好...");
    }
}
class Driver extends People{
    // 必须实现该方法
    public void work(){
        out.println("我的名字叫" + this.getName() + "，大家好...");
    }
}

abstract class hero{
    String name;
    int age;
    public abstract void jineng1();
}

class mele_hero extends hero{
    @Override
    public void jineng1() {
        System.out.printf("jineng1");
    }
}


public class class1 {
    public static void main(String[] args) {
        mele_hero m = new mele_hero();

    }
}

