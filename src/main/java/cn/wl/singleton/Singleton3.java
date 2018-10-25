package cn.wl.singleton;

/**
 * @ClassName: Singleton3
 * @Description: 饿汉式
 * 是否 Lazy 初始化：否
 * 是否多线程安全：是
 * @Author: wl
 * @CreateDate: 2018-10-24
 */

/**
 * 类加载的方式是按需加载，且只加载一次。因此，Singleton3类被加载时，就会实例化一个对象并交给自己的引用，
 * 供系统使用。换句话说，在线程访问单例对象之前就已经创建好了。再加上，由于一个类在整个生命周期中只会被加载一次，
 * 因此该单例类只会创建一个实例，也就是说，线程每次都只能也必定只可以拿到这个唯一的对象。
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();
    public static Singleton3 getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("singleton3:饿汉式;是否 Lazy 初始化：否;是否多线程安全：是");
    }
    public static void main(String[] args){
        Singleton3 singleton3=Singleton3.getInstance();
        singleton3.showMessage();

    }
}
