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
     * ����һ��������ʹ�õݹ����1-n֮��ĺ�
     */
    public static int sum(int n) {
        //��ȡ��1��ʱ�����
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}
