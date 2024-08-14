package Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CtrlAExample extends JFrame implements KeyListener, ActionListener {

    private JTextArea textArea;

    public CtrlAExample() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ctrl+A Example");

        // 创建文本区域
        textArea = new JTextArea();
        textArea.addKeyListener(this);

        // 创建滚动窗格并将文本区域添加到其中
        JScrollPane scrollPane = new JScrollPane(textArea);

        // 创建按钮
        JButton selectAllButton = new JButton("Select All");
        selectAllButton.addActionListener(this);

        // 将文本区域和按钮添加到框架上
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(selectAllButton, BorderLayout.SOUTH);

        // 显示框架
        pack();
        setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // 如果按下Ctrl+A键，则选中所有文本
        if (e.getKeyCode() == KeyEvent.VK_A && e.isControlDown()) {
            textArea.selectAll();
        }
    }

    // 必须实现KeyListener接口的所有方法，但不需要实际使用它们
    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void actionPerformed(ActionEvent e) {
        // 如果点击了“Select All”按钮，则选中所有文本
        if (e.getActionCommand().equals("Select All")) {
            textArea.selectAll();
        }
    }

}