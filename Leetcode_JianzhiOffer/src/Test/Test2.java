package Test;

@FunctionalInterface
interface Imessage2 {
    public void send(String str);
}

public class Test2 {
    public static void main(String[] args) {
        Imessage2 msg = (str -> {
            System.out.println("发送消息：");
        });
        msg.send("www.baidu.com");
    }
}
