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
