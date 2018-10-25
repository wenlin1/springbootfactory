package cn.wl.singleton;

/**
 * @ClassName: Singleton4
 * @Description: 双重判断加锁的单例模式
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * @Author: wl
 * @CreateDate: 2018-10-24
 */
public class Singleton4 {
    /**必须使用volatile关键字修饰单例引用*/
    private volatile static Singleton4 instance;
    private Singleton4(){}

    /**
     * 为了在保证单例的前提下提高运行效率，我们需要对 singleton4 进行第二次检查目的是避开过多的同步（因为这里的同步只需在第一次创建实例时才同步，
     * 一旦创建成功，以后获取实例时就不需要同步获取锁了）
     * @return
     */
    public static Singleton4 getInstance(){
        if(instance == null){
            synchronized (Singleton4.class){
                if(instance == null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("singleton4:双重判断加锁的单例模式;是否 Lazy 初始化：是;是否多线程安全：是");
    }
    public static void main(String[] args){
        Singleton4 singleton4=Singleton4.getInstance();
        singleton4.showMessage();

    }
}
