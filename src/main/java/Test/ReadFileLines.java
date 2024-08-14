package Test;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReadFileLines {
    public static void main(String[] args) {
        File file = new File("D:\\excel\\c.xlsx");
        try {
            List<String> lines = FileUtils.readLines(file, "UTF-8");
            for (String line : lines) {
                System.out.println(line);
            }
            int lineCount = lines.size();
            System.out.println("文件中的行数为：" + lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}