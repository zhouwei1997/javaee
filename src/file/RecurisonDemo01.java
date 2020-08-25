package file;

/**
 * @Author:hengyu
 * @Date:2020/8/25 17:05
 * @Version:1.0
 * @Discription:
 */
public class RecurisonDemo01 {

    public static void main(String[] args) {
        System.out.println(sum(19));
    }

    /**
     * 定义一个方法，使用递归计算1-n之间的和
     */
    public static int sum(int n) {
        //获取到1的时候结束
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}
