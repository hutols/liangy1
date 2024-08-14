package Hutool.DateUtil.StrUtil;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.compress.Gzip;
import cn.hutool.core.convert.Convert;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.map.multi.AbsCollValueMap;
import cn.hutool.core.net.NetUtil;
import cn.hutool.core.util.NumberUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.extra.mail.MailAccount;
import cn.hutool.extra.mail.MailUtil;

import java.io.File;
import java.math.BigDecimal;
import java.util.*;

public class ListReplaceAllExample {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            MailAccount account = new MailAccount();
            account.setHost("smtp.qq.com");
            account.setPort(587);
            account.setAuth(true);
            account.setFrom("2532017385@qq.com");
            account.setUser("2532017385@qq.com");
            account.setPass("wcpiwrhcbqzaecfd");
            account.setSocketFactoryClass("javax.net.ssl.SSLSocketFactory");
            account.setSocketFactoryFallback(false);
            account.setSocketFactoryPort(587);

            MailUtil.send(account, "1912752320@qq.com", "爱你", "宝子，哥哥爱你", false);
            System.out.println("成功");
        }


    }
}
