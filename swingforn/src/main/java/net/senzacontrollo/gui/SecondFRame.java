package net.senzacontrollo.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

public class SecondFRame extends JFrame {
	public SecondFRame() {
		getContentPane().setLayout(null);
		
		FormLayout layout = new FormLayout(
			      "right:pref, 6dlu, 50dlu, 4dlu, default",  // columns
			      "pref, 3dlu, pref, 3dlu, pref");           // rows

		JPanel panel = new JPanel();
		panel.setLayout(layout);

		getContentPane().add(panel);

		
		 
			 CellConstraints cc = new CellConstraints();
			 //JPanel panel = new JPanel(layout);
			 panel.add(new JLabel("Label1"),   cc.xy  (1, 1));
			 panel.add(new JTextField(),       cc.xywh(3, 1, 3, 1));
			 panel.add(new JLabel("Label2"),   cc.xy  (1, 3));
			 panel.add(new JTextField(),       cc.xy  (3, 3));
			 panel.add(new JLabel("Label3"),   cc.xy  (1, 5));
			 panel.add(new JTextField(),       cc.xy  (3, 5));
			 panel.add(new JButton("/u2026"),  cc.xy  (5, 5));
		
		
			 panel.setBounds(0, 0, 434, 262);
	}

}
