package j_09_15;

import java.util.Scanner;

//作业 1
class Person {
    String name;
    int age;
}

// 学生有人的特征，学生类 继承 人类
class Student extends Person {
    public void Print_name() {
        System.out.print(this.name + "\n");
    }

    public void Print_age() {
        System.out.print(this.age + "\n");
    }
}

class JiCheng extends Student {
    public JiCheng(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Print_info() {
        System.out.print("我的名字是：");
        this.Print_name();
        System.out.print("我的年龄是：");
        this.Print_age();
    }
}

//作业2

abstract class Rectangle implements Shape2D {
    double width;
    double height;

    @Override
    public double grith() {
        return (width + height) * 2;
    }

    public double area() {
        return width * height;
    }
}

abstract class Cricle implements Shape2D {
    final double PI = 3.14;
    double R;

    @Override
    public double grith() {
        return this.PI * this.R * 2;
    }

    public double area() {
        return PI * this.R * this.R;
    }
}

class InterfaceExampleRectangle extends Rectangle {

    public InterfaceExampleRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    void get_info() {
        System.out.println("我是一个矩形，我的周长是：" + this.grith());
        System.out.println("我是一个矩形，我的面积是：" + this.area());
    }
}

class InterfaceExampleCricle extends Cricle {

    public InterfaceExampleCricle(double r) {

        this.R = r;
    }

    void get_info() {
        System.out.println("我的周长是：" + this.grith());
        System.out.println("我的面积是：" + this.area());
    }
}

public class k2 {
    public static void main(String[] args) {
//        作业1
        JiCheng student1 = new JiCheng("小明", 22);
        student1.Print_info();

//       作业2

        // 圆形
        double r = 0;
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            r = scan.nextInt();
        } else if (scan.hasNextDouble()) {
            r = scan.nextDouble();
        } else {
            System.out.println("请提供有效输入！");
            System.exit(0);
        }
        InterfaceExampleCricle cricle1 = new InterfaceExampleCricle(r);
        cricle1.get_info();

        // 矩形
        double width = 0, height = 0;

        System.out.println("请输入（width and height）:");  // 获取输入 width and height
        if (scan.hasNextInt()) {
            width = scan.nextInt();
            height = scan.nextInt();
        } else if (scan.hasNextDouble()) {
            width = scan.nextDouble();
            height = scan.nextDouble();
        } else {
            System.out.println("请提供有效输入！");
            System.exit(0);
        }

        InterfaceExampleRectangle Rectangle1 = new InterfaceExampleRectangle(width, height);
        Rectangle1.get_info();
    }

}
