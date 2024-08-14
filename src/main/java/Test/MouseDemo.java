package Test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MouseDemo {
    public static void main(String[] args) {
        // 创建一个窗口
        JFrame frame = new JFrame("Mouse Demo");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 添加一个鼠标移动监听器
        frame.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                // 获取鼠标的位置
                int x = e.getX();
                int y = e.getY();
                System.out.println("鼠标的位置是：" + x + ", " + y);
            }
        });

        frame.setVisible(true);
    }
}