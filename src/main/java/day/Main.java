package day;

import cn.hutool.core.util.ArrayUtil;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// 定义一个实体类来表示人员信息
class Person {
    private String name;
    private int age;

    // 构造函数
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter和Setter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}

// 定义一个实体类来表示重复元素及其索引位置
class DuplicateInfo {
    private String name;
    private List<Integer> indices;

    public DuplicateInfo(String name, List<Integer> indices) {
        this.name = name;
        this.indices = indices;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getIndices() {
        return indices;
    }

    @Override
    public String toString() {
        return "DuplicateInfo{" + "name='" + name + '\'' + ", indices=" + indices + '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // 定义一个人员列表
        List<Person> personList = Arrays.asList(
                new Person("1", 30),
                new Person("2", 30),
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Alice", 28),
                new Person("Charlie", 35),
                new Person("Bob", 40),
                new Person("Alice", 40)
        );
        System.out.println(personList.get(0));
        System.out.println(personList.get(personList.size() - 1));
        DuplicateInfo duplicateInfo = adda(personList);
        List<Integer> indices = duplicateInfo.getIndices();
        Integer[] array = indices.toArray(indices.toArray(new Integer[0]));
        Integer[] insert = ArrayUtil.insert(array, 0, 0);
        // 遍历索引，查询相邻索引的数据
        for (int i = 0; i < insert.length - 1; i++) {
            int start = insert[i];
            int end = insert[i + 1];
            // 查询指定索引位置的元素
            List<Person> element = personList.stream().sorted(Comparator.comparing(Person::getAge).reversed()).skip(start)
                    .limit(end - start).toList();
            // 输出相邻索引的数据
            System.out.println("索引" + i + "和" + (i + 1) + "的数据是: " + insert[i] + ", " + insert[i + 1]);
            System.out.println(element);
        }


    }

    private static DuplicateInfo adda(List<Person> personList) {


        // 使用HashMap统计名字及其索引位置
        Map<String, List<Integer>> duplicatesWithIndices = new HashMap<>();
        for (int i = 0; i < personList.size(); i++) {
            String name = personList.get(i).getName();
            if (name.equals("Alice")) {
                duplicatesWithIndices.computeIfAbsent(name, k -> new ArrayList<>()).add(i);
            }
        }

        // 创建DuplicateInfo列表
        DuplicateInfo result = duplicatesWithIndices.entrySet().stream()
                .filter(entry -> entry.getValue().size() >= 1)
                .map(entry -> new DuplicateInfo(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList()).get(0);
        // 输出结果
        System.out.println("重复名字及其索引位置:");
        return result;
    }
}