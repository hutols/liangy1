package Hutool.DateUtil.StrUtil;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

public class Main {
    public static void main(String[] args) {
        // 创建一个List并添加Person对象
        List<Person> list = new ArrayList<>();
        list.add(new Person("Alice"));
        list.add(new Person("Bob"));
        list.add(new Person("Charlie"));

        String nameToCheck = "Bob";
        Person[] array = ArrayUtil.toArray(list, Person.class);
        String string = ArrayUtil.toString(array);
        System.out.println(string);
        // 判断是否存在指定的name
        boolean exists = list.stream().anyMatch(person -> person.getName().equals(nameToCheck));
        
        // 格式化输出结果
        if (exists) {
            System.out.printf("%s 存在于列表中.%n", nameToCheck);
        } else {
            System.out.printf("%s 不存在于列表中.%n", nameToCheck);
        }

        Date date = new Date();
        String s = DateUtil.formatDate(date);
        String a =s+" 22:00:00";
        DateTime parse = DateUtil.parse(a);
        System.out.println(parse);

    }
}