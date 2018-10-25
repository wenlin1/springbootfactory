package cn.wl.singleton;
/**
 * @ClassName: Singleton2
 * @Description: 懒汉式，线程安全
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * @Author: wl
 * @CreateDate: 2018-10-24
 */
public class Singleton2 {

    private static Singleton2 instance;
    private Singleton2(){}

    /**
     * 是否使用 synchronized 修饰 getInstance()方法。就保证了对临界资源的同步互斥访问，也就保证了单例。
     * @return
     */
    public static synchronized Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("singleton2:懒汉式，线程安全;是否 Lazy 初始化：是;是否多线程安全：是");
    }
    public static void main(String[] args){
        Singleton2 singleton2=Singleton2.getInstance();
        singleton2.showMessage();

    }


}
