package Test;

import javax.swing.*;

interface IMessage {
    public void send(String str);
}

public class Test {
    public static void main(String[] args) {
        // 匿名内部类
        IMessage msg = new IMessage() {
            @Override
            public void send(String str) {
                System.out.println("消息发送：" + str);
            }
        };
        msg.send("www.baidu.com");
    }
}
