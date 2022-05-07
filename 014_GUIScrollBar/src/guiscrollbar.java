import javax.swing.*;

public class guiscrollbar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame a = new JFrame("example");
		JScrollBar b = new JScrollBar();
		b.setBounds(90,90,40,90);
		a.add(b);
		a.setSize(300,300);
		a.setLayout(null);
		a.setVisible(true);
	}

}
