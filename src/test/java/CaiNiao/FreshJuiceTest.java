package CaiNiao;

/**
 * @Author: lizhongyi
 * @Date: 2021/10/10 2:39 下午
 * 枚举
 * @Version 1.0
 */

class FreshJuice{
    enum FreshJuiceSize{ small,medium,large};
    FreshJuiceSize size;
}

public class FreshJuiceTest {
    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.large;


    }
}
