package Test;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FileChooser extends JFrame {
    private JTable table;
    private JPopupMenu popupMenu;
    private int selectedRow = -1;

    public FileChooser() {
        super("文件选择器");

        // 创建表格
        table = new JTable(new DefaultTableModel(new Object[][] {}, new String[] { "文件名", "类型", "大小" }));
        table.getSelectionModel().addListSelectionListener(e -> {
            selectedRow = table.getSelectedRow();
        });
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    // 右键弹出菜单
                    popupMenu.show(table, e.getX(), e.getY());
                }
            }
        });

        // 创建弹出菜单
        popupMenu = new JPopupMenu();
        JMenuItem menuItem = new JMenuItem("确认");
        menuItem.addActionListener(e -> {
            if (selectedRow >= 0) {
                String fileName = (String) table.getValueAt(selectedRow, 0);
                String fileType = (String) table.getValueAt(selectedRow, 1);
                int fileSize = (int) table.getValueAt(selectedRow, 2);
                System.out.println("确认选择文件：" + fileName + "，类型：" + fileType + "，大小：" + fileSize);
            }
        });
        popupMenu.add(menuItem);

        // 创建菜单栏
        JMenu fileMenu = new JMenu("文件");
        JMenuItem openMenuItem = new JMenuItem("打开");
        openMenuItem.addActionListener(e -> {
            // TODO: 打开文件选择器
        });
        fileMenu.add(openMenuItem);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(fileMenu);

        // 创建面板
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(table), BorderLayout.CENTER);

        // 添加组件
        setJMenuBar(menuBar);
        add(panel);

        // 设置窗口大小和关闭方式
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new FileChooser().setVisible(true);
    }
}