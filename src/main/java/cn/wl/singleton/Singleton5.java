package cn.wl.singleton;
/**
 * @ClassName: Singleton5
 * @Description: 登记式/静态内部类
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * @Author: wl
 * @CreateDate: 2018-10-24
 */
public class Singleton5 {

    /**
     * 内部类的加载：内部类（不论是静态内部类还是非静态内部类）都是在第一次使用时才会被加载。
     * 外部类不调用 getInstance（）时候 内部类是不会加载的，所以达到了懒汉的效果； 然后调用的时候 内部类被加载，
     * 加载的时候就会初始化实例；这个加载的过程是不会有多线程的问题的！
     * 类加载的时候有一种机制叫做 缓存机制；第一次加载成功之后会被缓存起来；而且一般一个类不会加载多次
     */
    private static class SingletonHolder{
        private static final Singleton5 instance = new Singleton5();
    }
    public static Singleton5 getInstance(){
        return  SingletonHolder.instance;
    }
    public void showMessage(){
        System.out.println("singleton5:登记式/静态内部类;是否 Lazy 初始化：是\n" + " * 是否多线程安全：是");
    }
    public static void main(String[] args){
        Singleton5 singleton5=Singleton5.getInstance();
        singleton5.showMessage();
    }

}
