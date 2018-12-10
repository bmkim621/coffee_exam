package coffee_exam.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.Font;

public class CoffeeManagementUI extends JFrame {

	private JPanel contentPane;
	private JTextField tfCode;
	private JTextField tfName;
	private JTextField tfPrice;
	private JTextField tfSaleCnt;
	private JTextField tfMarginRate;

	/**
	 * Create the frame.
	 */
	public CoffeeManagementUI() {
		setTitle("커피관리프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(10, 10));
		
		JPanel pContents = new JPanel();
		contentPane.add(pContents, BorderLayout.CENTER);
		pContents.setLayout(new GridLayout(0, 4, 20, 5));
		
		JLabel lblCode = new JLabel("제품코드");
		lblCode.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		lblCode.setHorizontalAlignment(SwingConstants.RIGHT);
		pContents.add(lblCode);
		
		tfCode = new JTextField();
		pContents.add(tfCode);
		tfCode.setColumns(10);
		
		JLabel lblName = new JLabel("제품명");
		lblName.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		pContents.add(lblName);
		
		tfName = new JTextField();
		tfName.setEditable(false);
		pContents.add(tfName);
		tfName.setColumns(10);
		
		JLabel lblPrice = new JLabel("제품단가");
		lblPrice.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		lblPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		pContents.add(lblPrice);
		
		tfPrice = new JTextField();
		pContents.add(tfPrice);
		tfPrice.setColumns(10);
		
		JLabel lblSaleCnt = new JLabel("판매수량");
		lblSaleCnt.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		lblSaleCnt.setHorizontalAlignment(SwingConstants.RIGHT);
		pContents.add(lblSaleCnt);
		
		tfSaleCnt = new JTextField();
		pContents.add(tfSaleCnt);
		tfSaleCnt.setColumns(10);
		
		JLabel lblMarginRate = new JLabel("마진율");
		lblMarginRate.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		lblMarginRate.setHorizontalAlignment(SwingConstants.RIGHT);
		pContents.add(lblMarginRate);
		
		tfMarginRate = new JTextField();
		pContents.add(tfMarginRate);
		tfMarginRate.setColumns(10);
		
		JPanel pButtons = new JPanel();
		contentPane.add(pButtons, BorderLayout.SOUTH);
		pButtons.setLayout(new GridLayout(0, 3, 10, 10));
		
		JButton btnInput = new JButton("입력");
		btnInput.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		pButtons.add(btnInput);
		
		JButton btnOutput1 = new JButton("출력1");
		btnOutput1.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		pButtons.add(btnOutput1);
		
		JButton btnOutput2 = new JButton("출력2");
		btnOutput2.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		pButtons.add(btnOutput2);
	}

}
