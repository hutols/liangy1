package Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 创建一个 List 来存储 MyEntity 对象
        List<MyEntity> myList = new ArrayList<>();
        myList.add(new MyEntity("value1", "test1"));
        myList.add(new MyEntity("value2", "test2"));
        myList.add(new MyEntity("value3", "test3"));

        // 自定义值用于比较
        String customValue = "value2";
        // 新值用于更新
        String newValue = "newValue";

        // 遍历 List 并使用反射获取字段进行判断和更新
        for (MyEntity item : myList) {
            Field[] fields = item.getClass().getDeclaredFields(); // 获取所有字段
            for (Field field : fields) {
                field.setAccessible(true); // 允许访问私有字段
                try {
                    // 判断字段值是否与 customValue 相同
                    if (field.get(item).equals(customValue)) {
                        field.set(item, newValue); // 更新找到的字段
                        System.out.println("成功更新了相同的字段值: " + field.getName());
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        // 打印更新后的 List 内容
        for (MyEntity item : myList) {
            System.out.println("实体 a 字段值: " + item.getA() + ", 实体 b 字段值: " + item.getB());
        }
    }
}