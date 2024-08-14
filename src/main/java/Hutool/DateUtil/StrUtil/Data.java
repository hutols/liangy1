package Hutool.DateUtil.StrUtil;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author LY
 * @version 1.0
 * @date 2023/10/19 11:27
 */

@lombok.Data
public class Data {
    private String name;
    private String age;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date;
}

