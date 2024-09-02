package Hutool.DateUtil.Ftp;

import cn.hutool.extra.ftp.Ftp;
import cn.hutool.extra.ftp.FtpConfig;

import java.io.File;

/**
 * @author LY
 * @version 1.0
 * @date 2024/8/30 16:53
 */

public class ftp {
    public static void main(String[] args) {
        // 创建FtpConfig
        FtpConfig ftpConfig = new FtpConfig();
        ftpConfig.setHost("ftp.example.com");
        ftpConfig.setPort(21);
        ftpConfig.setUser("yourUsername");
        ftpConfig.setPassword("yourPassword");
        Ftp ftp = new Ftp("", 21, "", "");
        ftp.download("", new File(""));

    }
}

