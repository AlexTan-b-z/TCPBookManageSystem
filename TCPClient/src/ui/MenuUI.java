package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Operator;

import javax.swing.JLabel;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MenuUI extends JFrame {

	private JPanel contentPane;
	public static int choice;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuUI frame = new MenuUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("欢迎...");
		label.setBounds(145, 0, 81, 21);
		contentPane.add(label);
		
		JButton addButton = new JButton("增加图书");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddUI addui = new AddUI();
				addui.setVisible(true);
				MenuUI.this.dispose();
			}
		});
		addButton.setBounds(110, 25, 123, 29);
		contentPane.add(addButton);
		
		JButton deleteButton = new JButton("删除图书");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteUI delete = new DeleteUI();
				delete.setVisible(true);
				MenuUI.this.dispose();
			}
		});
		deleteButton.setBounds(110, 56, 123, 29);
		contentPane.add(deleteButton);
		
		JButton button_1 = new JButton("修改图书");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangeUI change = new ChangeUI();
				change.setVisible(true);
				MenuUI.this.dispose();
			}
		});
		button_1.setBounds(110, 90, 123, 29);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("查询图书");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FindmenuUI findmenu = new FindmenuUI();
				findmenu.setVisible(true);
				MenuUI.this.dispose();
			}
		});
		button_2.setBounds(110, 124, 123, 29);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("清空图书");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClearUI clear = new ClearUI();
				clear.setVisible(true);
				MenuUI.this.dispose();
			}
		});
		button_3.setBounds(110, 157, 123, 29);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("退出系统");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Operator operate = new Operator();
				operate.Exit();
				MenuUI.this.dispose();
			}
		});
		button_4.setBounds(110, 189, 123, 29);
		contentPane.add(button_4);
	}
}
