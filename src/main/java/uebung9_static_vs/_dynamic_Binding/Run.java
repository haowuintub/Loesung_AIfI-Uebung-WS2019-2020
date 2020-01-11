package uebung9_static_vs._dynamic_Binding;

class Run {

    public static void main(String[] args) {
        Animal animal = new Cat();
        Cat cat = (Cat) animal; // 向下转型
        System.out.println(animal.name); // 输出Animal类的name变量
        System.out.println(animal.staticName); // 输出Animal类的staticName变量
        animal.eat(); // 输出Cat类的eat()方法
        animal.staticEat(); // 输出Animal类的staticEat()方法
        System.out.println(cat.str); // 调用Cat类的str变量
        cat.eatMethod(); // 调用Cat类的eatMethod()方法


        String a = ((Cat)animal).name;
        String b = ((Cat)animal).staticName;

        System.out.println(a); // 调用Cat类的str变量
        System.out.println(b); // 调用Cat类的str变量

    }

}

