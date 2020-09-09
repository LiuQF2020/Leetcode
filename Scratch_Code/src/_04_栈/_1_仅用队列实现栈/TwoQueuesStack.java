package _04_栈._1_仅用队列实现栈;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1、开辟两个队列：
 *   1个队列为data队列，加入数据时只push进入data队列；
 *   另一个队列为help队列，取数据时只从help队列pop；
 *
 * 2、对于data队列，每次从队尾开始，使用poll方法将元素add到help队列；
 *    直到只剩下队列头一个元素位置；然后从data队列尾将仅剩的一个元素pop出来；
 *    即实现了先进后出，即栈结构。
 *
 * 3、每次做完pop操作，就交换data与help的引用；
 *
 * 4、swap交换两个队列的引用。
 */
public class TwoQueuesStack {
    private Queue<Integer> data;
    private Queue<Integer> help;

    public TwoQueuesStack() {
        data = new LinkedList<Integer>();
        help = new LinkedList<Integer>();
    }

    public void push(int pushInt) {
        data.add(pushInt);
    }

    public int pop() {
        if (data.isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }

        while (data.size() > 1) {
            help.add(data.poll());
        }
        int res = data.poll();
        swap();
        return res;
    }

    private void swap() {
        Queue<Integer> tmp = help;
        help = data;
        data = tmp;
    }

    public static void main(String[] args) {
        TwoQueuesStack imp = new TwoQueuesStack();
        imp.push(1);
        imp.push(2);
        imp.push(3);
        int res1 = imp.pop();
        int res2 = imp.pop();
        imp.push(3);
        int res3 = imp.pop();

        System.out.println(res1 + " " + res2 + " " + res3);
    }
}
