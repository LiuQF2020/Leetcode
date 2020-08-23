package Test;

interface IMessage1 {
    public void send(String str);

    // 静态方法实现匿名内部类
    public static IMessage1 getInstance() {
        return new IMessage1() {
            @Override
            public void send(String str) {
                System.out.println(str);
            }
        };
    }
}

public class Test1 {
    public static void main(String[] args) {
        IMessage1.getInstance().send("www.baidu.com");
    }
}
