package 测试;
/**
* @author LY
* @date 2023/5/26 11:23
* @version 1.0
*/

public class a implements Strategy{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int upd(int a, int b) {
        return a/b;
    }
}

