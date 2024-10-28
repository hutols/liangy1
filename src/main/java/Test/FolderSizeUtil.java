package Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FolderSizeUtil {

    // 计算指定目录下每个文件夹的大小
    public static Map<String, Double> calculateFolderSizes(String directoryPath) {
        Map<String, Double> folderSizes = new HashMap<>();
        File directory = new File(directoryPath);
        
        if (directory.exists() && directory.isDirectory()) {
            calculateSizes(directory, folderSizes);
        } else {
            System.out.println("指定路径无效或不是一个目录。");
        }
        
        return folderSizes;
    }

    // 递归计算文件夹大小
    private static void calculateSizes(File folder, Map<String, Double> folderSizes) {
        long size = 0;
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    size += file.length();
                } else if (file.isDirectory()) {
                    // 递归获取子文件夹大小
                    calculateSizes(file, folderSizes);
                }
            }
        }
        
        // 将文件夹大小转换为MB并存入map
        folderSizes.put(folder.getAbsolutePath(), size / (1024.0 * 1024.0));
    }

    // 主方法用于测试
    public static void main(String[] args) {
        String directoryPath = "C:\\Program Files"; // 指定C盘的路径
        Map<String, Double> sizes = calculateFolderSizes(directoryPath);

        // 输出每个文件夹的大小
        for (Map.Entry<String, Double> entry : sizes.entrySet()) {
            if (entry.getValue()>100){
                System.out.printf("文件夹: %s, 大小: %.2fMB%n", entry.getKey(), entry.getValue());
            }

        }
    }
}