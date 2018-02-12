import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ExemploJComboBox extends JFrame implements ActionListener {

	JComboBox comboBox1;
	JComboBox comboBox2;
	
	public ExemploJComboBox(){
		super("Exemplo JComboBox");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		getContentPane().add(montaPanel());
		setSize(300, 200);
		setVisible(true);

	}

	private JPanel montaPanel(){

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		String labels[] = { "Aline", "Bruno", "Carlos", "Debora","Elaine", "Fabio", "Gabriel", "Hugo","Igor", "João" };

		comboBox1 = new JComboBox(labels);
		comboBox1.setMaximumRowCount(6);
		comboBox1.addActionListener(this);
		panel.add(comboBox1, BorderLayout.NORTH);

		comboBox2 = new JComboBox(labels);
		comboBox2.setEditable(true);
		comboBox2.addActionListener(this);
		panel.add(comboBox2, BorderLayout.SOUTH);

		return panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(comboBox1 == e.getSource()){
			String nome = (String)comboBox1.getSelectedItem();
			JOptionPane.showMessageDialog(null, nome);
		}
		
		if(comboBox2 == e.getSource()){
			String nome = (String)comboBox2.getSelectedItem();
			JOptionPane.showMessageDialog(null, nome);		
		}
	}

	public static void main(String args[]) {
		ExemploJComboBox janela = new ExemploJComboBox();
	}

}
