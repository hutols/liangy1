package six;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author LY
 * @version 1.0
 * @date 2023/7/27 23:27
 */

public class gg {
    public static void main(String[] args) {
        List<Nanme> nanmes = new ArrayList<>();
        Nanme nanme = new Nanme();
        nanme.setId("张三");
        nanme.setMax(new BigDecimal(3));
        nanmes.add(nanme);
        Nanme nanme1 = new Nanme();
        nanme1.setId("张三");
        nanme1.setMax(new BigDecimal(1));
        nanmes.add(nanme1);
        Nanme nanme2 = new Nanme();
        nanme2.setId("张三");
        nanme2.setMax(new BigDecimal(4));
        nanmes.add(nanme2);

        List<Nanme> collect = nanmes.stream().sorted(Comparator.comparing(Nanme::getMax).reversed()).collect(Collectors.toList());
        BigDecimal bigDecimal = new BigDecimal(0);
        for (int i = 0; i < 2; i++) {
            Nanme nanme3 = collect.get(i);
               bigDecimal= bigDecimal.add( nanme3.getMax());

        }
        System.out.println(bigDecimal);

    }
}

