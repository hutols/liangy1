//package map;
//
//import cn.hutool.core.io.FileUtil;
//import org.apache.commons.lang3.concurrent.ConcurrentUtils;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class TestListMap {
//
//    public static void main(String[] args) {
//
//        List<Hosting> list = new ArrayList<>();
//        list.add(new Hosting(1, "liquidweb.com", 80000));
//        list.add(new Hosting(2, "linode.com", 90000));
//        list.add(new Hosting(3, "digitalocean.com", 120000));
//        list.add(new Hosting(4, "aws.amazon.com", 200000));
//        list.add(new Hosting(5, "mkyong.com", 1));
//
//        // key = id, value - websites
//        Map<Integer, String> result1 = list.stream().collect(
//                Collectors.toMap(Hosting::getId, Hosting::getName));
//
//        System.out.println("Result 1 : " + result1);
//
//        // key = name, value - websites
//        Map<String, Long> result2 = list.stream().collect(
//                Collectors.toMap(Hosting::getName, Hosting::getWebsites));
//
//        System.out.println("Result 2 : " + result2);
//
//        // Same with result1, just different syntax
//        // key = id, value = name
//        Map<Integer, String> result3 = list.stream().collect(
//                Collectors.toMap(x -> x.getId(), x -> x.getName()));
//       // ConcurrentUtils.createIfAbsent()
//        String userHomePath = FileUtil.getUserHomePath();
//        System.out.println("Result 3 : " + result3);
//    }
//}