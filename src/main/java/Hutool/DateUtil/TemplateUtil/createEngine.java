package Hutool.DateUtil.TemplateUtil;

import cn.hutool.core.date.TemporalUtil;
import cn.hutool.extra.template.TemplateEngine;
import cn.hutool.extra.template.TemplateUtil;

/**
 * @author LY
 * @version 1.0
 * @date 2024/8/29 11:03
 */

public class createEngine {
    public static void main(String[] args) {
        TemplateEngine engine = TemplateUtil.createEngine();
        engine.getTemplate("example.xlsx");
    }
}

