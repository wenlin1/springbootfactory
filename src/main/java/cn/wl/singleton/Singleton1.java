package cn.wl.singleton;
/**
 * @ClassName: Singleton1
 * @Description: 懒汉式，线程不安全
 * 是否 Lazy 初始化：是
 * 是否多线程安全：否
 * @Author: wl
 * @CreateDate: 2018-10-24
 */
public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1(){}
    /**
     *  当多个线程同时进入 if (instance == null) {…} 语句块的情形发生。
     *  当这种这种情形发生后，该单例类就会创建出多个实例，违背单例模式的初衷。
     */

    public static Singleton1 getInstance(){
        if(instance == null){
            instance = new Singleton1();
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("singleton1线程不安全:懒汉式，线程不安全;Lazy 初始化,是否 Lazy 初始化：是;是否多线程安全：否");
    }

    public static void main(String [] args){
        Singleton1 singleton1=Singleton1.getInstance();
        singleton1.showMessage();
    }


}
