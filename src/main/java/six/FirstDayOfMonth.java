package six;

import java.util.Calendar;

public class FirstDayOfMonth {
    public static void main(String[] args) {
        // 获取当前日期
        Calendar calendar = Calendar.getInstance();
        
        // 将日期设置为当月第一天
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        
        // 获取当月第一天的日期
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // 月份从0开始，需要加1
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        
        // 输出结果
        String formattedDate = String.format("%04d-%02d-%02d", year, month, day);
        System.out.println(formattedDate);
    }
}