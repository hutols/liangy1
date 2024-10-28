package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Teller {
    private String username;
    private String password;
    private boolean locked;
    private int failedAttempts;
    private static final int MAX_FAILED_ATTEMPTS = 5;

    // 假设有一个简单的用户数据库
    private static final Map<String, String> USER_DATABASE = new HashMap<>();

    static {
        USER_DATABASE.put("teller1", "password1");
        USER_DATABASE.put("teller2", "password2");
    }

    public Teller(String username, String password) {
        this.username = username;
        this.password = password;
        this.locked = false;
        this.failedAttempts = 0;
    }

    public boolean login(String inputPassword) {
        if (locked) {
            System.out.println("账户已被锁定，请联系管理员。");
            return false;
        }

        if (USER_DATABASE.containsKey(username) && USER_DATABASE.get(username).equals(inputPassword)) {
            System.out.println("登录成功！");
            failedAttempts = 0; // 登录成功后重置失败次数
            return true;
        } else {
            failedAttempts++;
            System.out.println("密码错误！失败次数：" + failedAttempts);
            if (failedAttempts >= MAX_FAILED_ATTEMPTS) {
                locked = true;
                System.out.println("账户已被锁定，请联系管理员。");
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入用户名：");
        String username = scanner.nextLine();
        Teller teller = new Teller(username, ""); // 这里密码将由用户输入

        while (true) {
            System.out.print("请输入密码：");
            String password = scanner.nextLine();
            boolean success = teller.login(password);
            if (success) {
                break; // 登录成功，退出循环
            }
        }

        scanner.close();
    }
}