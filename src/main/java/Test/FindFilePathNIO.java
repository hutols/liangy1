package Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

public class FindFilePathNIO {

    public static void main(String[] args) {
        String startDir = "D:\\apache-maven-3.6.1"; // 起始搜索目录
        String fileNameToSearch = "_remote.repositories"; // 目标文件名
        try {
            Optional<Path> path = findFile(Paths.get(startDir), fileNameToSearch);
            path.ifPresentOrElse(
                p -> System.out.println("文件路径: " + p.toAbsolutePath()),
                () -> System.out.println("文件未找到")
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Optional<Path> findFile(Path startPath, String fileNameToSearch) throws IOException {
        try (var paths = Files.walk(startPath)) {
            return paths
                .filter(Files::isRegularFile)
                .filter(p -> p.getFileName().toString().equalsIgnoreCase(fileNameToSearch))
                .findFirst();
        }
    }
}
