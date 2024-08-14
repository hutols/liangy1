package map;

import java.io.File;

public class FileDeleteUtil {
    /**
     * 删除单个文件或空目录
     *
     * @param file 要删除的文件或目录
     * @return 删除成功返回 true，否则返回 false
     */
    public static boolean deleteFile(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        } else {
            // 如果是目录，则先删除目录下的所有文件和子目录
            for (File subFile : file.listFiles()) {
                if (!deleteFile(subFile)) {
                    return false;
                }
            }
            // 删除空目录
            return file.delete();
        }
    }

    /**
     * 删除指定目录及其所有文件和子目录
     *
     * @param dir 要删除的目录
     * @return 删除成功返回 true，否则返回 false
     */
    public static boolean deleteDirectory(File dir) {
        if (dir == null || !dir.exists() || !dir.isDirectory()) {
            return true;
        }
        // 删除目录下的所有文件和子目录
        for (File subFile : dir.listFiles()) {
            if (!deleteFile(subFile)) {
                return false;
            }
        }
        // 删除空目录
        return dir.delete();
    }


}