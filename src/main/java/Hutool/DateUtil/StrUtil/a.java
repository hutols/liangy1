package Hutool.DateUtil.StrUtil;

import Hutool.DateUtil.DateUtli;
import cn.hutool.bloomfilter.bitMap.BitMap;
import cn.hutool.core.collection.ListUtil;
import cn.hutool.core.exceptions.CheckedUtil;
import cn.hutool.core.swing.ScreenUtil;
import cn.hutool.core.swing.clipboard.ClipboardUtil;
import cn.hutool.core.util.*;
import cn.hutool.cron.CronUtil;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author LY
 * @version 1.0
 * @date 2023/10/17 11:31
 */

public class a {
    public static void main(String[] args) throws IOException {

        HashMap<String, Object> map = new HashMap<>();
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 4);
        ArrayList<String> list = new ArrayList<>();
        list.add("1");

//        map.forEach((key,value)->{
//           // System.out.println(key);
//            for (Object o : list) {
//                if (o.equals(key)){
//                    System.out.println(key);
//                }
//            }
//        });
        System.out.println(CreditCodeUtil.randomCreditCode());
        System.out.println(DesensitizedUtil.fixedPhone("15112440097"));
        IdcardUtil.Idcard idcardInfo = IdcardUtil.getIdcardInfo("4313821211154");
        idcardInfo.getBirthDate();
        System.out.println(idcardInfo);
        BufferedImage bufferedImage = ScreenUtil.captureScreen();
        File output = new File("d:\\write.png");
        ImageIO.write(bufferedImage, "png", output);
        class s extends TimerTask {
            int count =0;
            @Override
            public void run() {

                String s = CreditCodeUtil.randomCreditCode();
                File output = new File("D:\\tp" + s + ".png");
                try {
                    ImageIO.write(bufferedImage, "png", output);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                count++;
                System.out.println("运行"+count);
            }
        }
        Timer timer = new Timer();
        timer.schedule(new s(), 0, 5000);
        System.out.println("开始执行了");


    }


}

