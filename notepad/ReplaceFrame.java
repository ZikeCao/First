package notepad;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.annotation.Repeatable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.View;

public class ReplaceFrame extends JFrame{
	JLabel findJlabel,replaceJlable;
	JTextField findtext,replacetext;
	JButton findnextButton,replaceButton,cancelButton;
	JPanel jp1,jp2;
	int count;
	public ReplaceFrame(){
		JFrame jf=new JFrame("����");
		Container c=jf.getContentPane();
		c.setLayout(new BorderLayout());
		findJlabel=new JLabel("�������ݣ�");
		findtext=new JTextField(10);
		replaceJlable=new JLabel("�滻Ϊ��");
		replacetext=new JTextField(10);
		jp1=new JPanel();
		jp1.setLayout(new GridLayout(2, 2));
		jp1.add(findJlabel);
		jp1.add(findtext);
		jp1.add(replaceJlable);
		jp1.add(replacetext);
		
		findnextButton=new JButton("������һ��");
		findnextButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				String str=NotePadJframe.noteja.getText();
				String strr=findtext.getText();
				System.out.println(str.indexOf(strr,count));
				count=str.indexOf(strr,count)+1;
				if(count==0){
					JOptionPane.showMessageDialog(jf, "û�в��ҵ�"+strr+"��","���±�",JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		replaceButton=new JButton("�滻");
		cancelButton=new JButton("ȡ��");
		cancelButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
			}
		});
		jp2=new JPanel();
		jp2.setLayout(new GridLayout(3, 1));
		jp2.add(findnextButton);
		jp2.add(replaceButton);
		jp2.add(cancelButton);
		
		c.add(jp1,BorderLayout.WEST);
		c.add(jp2,BorderLayout.EAST);
			
		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.DISPOSE_ON_CLOSE);
	}
}