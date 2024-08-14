package easyExcel;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.ICaptcha;
import cn.hutool.captcha.LineCaptcha;
import cn.hutool.core.thread.ThreadUtil;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @author LY
 * @version 1.0
 * @date 2023/11/16 17:27
 */

public class ll {
    public static void main(String[] args) throws Exception {
//        System.out.println("开始完成");
//        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
//            for (int i = 0; i <100 ; i++) {
//                System.out.println(i);
//
//            }
//        });
//        future.get();
//        System.out.println(ThreadUtil.sleep(10000));
//        System.out.println("执行完成");
        // 定义图形验证码的长和宽
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(200, 100);

// 图形验证码写出，可以写出到文件，也可以写出到流
        lineCaptcha.write("D:/line.png");

// 输出code
        System.out.println(lineCaptcha.getCode());

// 验证图形验证码的有效性，返回boolean值
        lineCaptcha.verify("12345");

// 重新生成验证码
        lineCaptcha.createCode();

    }

}

