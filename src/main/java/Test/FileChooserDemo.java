package Test;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.JFileChooser;

public class FileChooserDemo {
    private JFileChooser fileChooser;

    public FileChooserDemo() {
        // 创建文件选择器
        fileChooser = new JFileChooser();
        // 设置文件选择器的选择模式为文件和目录
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
    }

    public void showFileChooser(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                fileChooser.setSelectedFile(f);
                // 弹出文件选择器
                Robot robot = null;
                try {
                    new CtrlAExample();
                    robot = new Robot();
                    robot.mouseMove(193, 253); // 鼠标移动
                    robot.mousePress(KeyEvent.BUTTON3_DOWN_MASK); // 模拟鼠标右键按下
                    robot.mouseRelease(KeyEvent.BUTTON3_DOWN_MASK); // 模拟鼠标右键抬起
                    Thread.sleep(1000); // 等待1秒钟

                    robot.keyPress(KeyEvent.VK_DOWN); // 模拟键盘向下键按下
                    robot.keyRelease(KeyEvent.VK_DOWN); // 模拟键盘向下键抬起
                    Thread.sleep(500); // 等待0.5秒钟
                    robot.keyPress(KeyEvent.VK_ENTER); // 模拟键盘Enter键按下
                    robot.keyRelease(KeyEvent.VK_ENTER); // 模拟键盘Enter键抬起
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }



    public static void main(String[] args) {
        FileChooserDemo demo = new FileChooserDemo();
        File file = new File("D:\\test");
        demo.showFileChooser(file);
    }
}