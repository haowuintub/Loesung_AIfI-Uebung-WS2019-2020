package uebung9_static_vs._dynamic_Binding;

public class Cat extends Animal {
    public String name = "Cat：猫";
    public String str = "Cat：可爱的小猫";//自己的方法
    public static String staticName = "Dog：我是喵星人";
    public void eat() {
        System.out.println("Cat：吃饭");
    }
    public static void staticEat() {
        System.out.println("Cat：猫在吃饭");
    }
    public void eatMethod() {
        System.out.println("Cat：猫喜欢吃鱼");
    }//自己的方法

}
