package Test;

import java.io.File;
import java.nio.file.*;
import java.io.IOException;

public class FileSelector {
  public static void main(String[] args) throws IOException {
    Path folderPath = Paths.get("D:\\excel");
    Files.walk(folderPath)
         .forEach(path -> {
             File file = new File(path.toUri());
             System.out.println(file.getName());
         });
     }
}