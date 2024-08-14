package six;

/**
 * @author LY
 * @version 1.0
 * @date 2024/8/9 10:46
 */

public class xiao {
    public static void main(String[] args) {
        try {
            System.out.println("1");
            throw new RuntimeException("s");
        }catch (Exception e){
            System.out.println("2");
        }finally {
            System.out.println("3");
        }
    }
}

