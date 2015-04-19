package net.senzacontrollo.gui;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class FirstWindow implements ActionListener{

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=-30,169
	 */
	private final JPanel panel = new JPanel();
	private JLabel lblFileExcelPod;
	private JLabel lblNewLabel;
	private JLabel lblDirectorySorgenteFiles;
	private JLabel lblDirectoryDestinazioneFile;
	private JButton btnScegli;
	private JButton btnScegli_1;
	private JButton btnScegli_2;
	private JButton btnScegli_3;
	private JLabel field_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnNewButton;
	private JFileChooser fc;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
			  UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch(Exception e) {
			  System.out.println("Error setting native LAF: " + e);
			}
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstWindow window = new FirstWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FirstWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		fc = new JFileChooser();
		frame = new JFrame();
		frame.setBounds(100, 100, 619, 229);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{40, 143, 59, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{25, 30, 23, 23, 23, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		lblFileExcelPod = new JLabel("File excel pod");
		GridBagConstraints gbc_lblFileExcelPod = new GridBagConstraints();
		gbc_lblFileExcelPod.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFileExcelPod.insets = new Insets(0, 0, 5, 5);
		gbc_lblFileExcelPod.gridx = 1;
		gbc_lblFileExcelPod.gridy = 1;
		frame.getContentPane().add(lblFileExcelPod, gbc_lblFileExcelPod);
		
		btnScegli = new JButton("Scegli");
		GridBagConstraints gbc_btnScegli = new GridBagConstraints();
		gbc_btnScegli.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnScegli.insets = new Insets(0, 0, 5, 5);
		gbc_btnScegli.gridx = 2;
		gbc_btnScegli.gridy = 1;
		btnScegli.addActionListener(this);
		frame.getContentPane().add(btnScegli, gbc_btnScegli);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 1;
		frame.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		lblNewLabel = new JLabel("File xsd");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 2;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		btnScegli_1 = new JButton("Scegli");
		GridBagConstraints gbc_btnScegli_1 = new GridBagConstraints();
		gbc_btnScegli_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnScegli_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnScegli_1.gridx = 2;
		gbc_btnScegli_1.gridy = 2;
		btnScegli_1.addActionListener(this);
		frame.getContentPane().add(btnScegli_1, gbc_btnScegli_1);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 2;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 2;
		frame.getContentPane().add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		lblDirectorySorgenteFiles = new JLabel("Directory Sorgente files xml");
		GridBagConstraints gbc_lblDirectorySorgenteFiles = new GridBagConstraints();
		gbc_lblDirectorySorgenteFiles.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDirectorySorgenteFiles.insets = new Insets(0, 0, 5, 5);
		gbc_lblDirectorySorgenteFiles.gridx = 1;
		gbc_lblDirectorySorgenteFiles.gridy = 3;
		frame.getContentPane().add(lblDirectorySorgenteFiles, gbc_lblDirectorySorgenteFiles);
		
		btnScegli_2 = new JButton("Scegli");
		GridBagConstraints gbc_btnScegli_2 = new GridBagConstraints();
		gbc_btnScegli_2.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnScegli_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnScegli_2.gridx = 2;
		gbc_btnScegli_2.gridy = 3;
		btnScegli_2.addActionListener(this);
		frame.getContentPane().add(btnScegli_2, gbc_btnScegli_2);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 2;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 3;
		frame.getContentPane().add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		lblDirectoryDestinazioneFile = new JLabel("Directory destinazione file xml");
		GridBagConstraints gbc_lblDirectoryDestinazioneFile = new GridBagConstraints();
		gbc_lblDirectoryDestinazioneFile.anchor = GridBagConstraints.WEST;
		gbc_lblDirectoryDestinazioneFile.insets = new Insets(0, 0, 5, 5);
		gbc_lblDirectoryDestinazioneFile.gridx = 1;
		gbc_lblDirectoryDestinazioneFile.gridy = 4;
		frame.getContentPane().add(lblDirectoryDestinazioneFile, gbc_lblDirectoryDestinazioneFile);
		
		btnScegli_3 = new JButton("Scegli");
		GridBagConstraints gbc_btnScegli_3 = new GridBagConstraints();
		gbc_btnScegli_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnScegli_3.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnScegli_3.gridx = 2;
		gbc_btnScegli_3.gridy = 4;
		btnScegli_3.addActionListener(this);
		frame.getContentPane().add(btnScegli_3, gbc_btnScegli_3);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.gridwidth = 2;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 3;
		gbc_textField_3.gridy = 4;
		frame.getContentPane().add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		btnNewButton = new JButton("Avvia");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 5;
		frame.getContentPane().add(btnNewButton, gbc_btnNewButton);
		addListeners();

	}
	
	private void addListeners(){

		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if(		isNullOrEmpty(textField) || isNullOrEmpty(textField_1) ||
						isNullOrEmpty(textField_2) || isNullOrEmpty(textField_3)){
					JOptionPane.showMessageDialog(frame, "Valorizzare i campi obbligatori","Attenzione",JOptionPane.ERROR_MESSAGE);
				}
				else{
					//TODO Avviare processo di filtraggio
					System.out.println("Avvio filtering");
				}
			}
		});
	}

	public void actionPerformed(ActionEvent e) {
		 if (e.getSource() == btnScegli) {
			 	fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		        int returnVal = fc.showOpenDialog(frame);

		        if (returnVal == JFileChooser.APPROVE_OPTION) {
		            File file = fc.getSelectedFile();
		            textField.setText(file.getPath());
		           
		        } else {
		            textField.setText("");
		        }
		   } 
		 else if (e.getSource() == btnScegli_1) {
			 	fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		        int returnVal = fc.showOpenDialog(frame);

		        if (returnVal == JFileChooser.APPROVE_OPTION) {
		            File file = fc.getSelectedFile();
		            textField_1.setText(file.getPath());

		        } else {
		        	textField_1.setText("");
		        }
		   }
		 else  if (e.getSource() == btnScegli_2) {
			 	fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);	
		        int returnVal = fc.showOpenDialog(frame);

		        if (returnVal == JFileChooser.APPROVE_OPTION) {
		            File file = fc.getSelectedFile();
		            textField_2.setText(file.getPath());

		        } else {
		        	textField_2.setText("");
		        }
		   }
		 else  if (e.getSource() == btnScegli_3) {
			 	fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		        int returnVal = fc.showOpenDialog(frame);

		        if (returnVal == JFileChooser.APPROVE_OPTION) {
		            File file = fc.getSelectedFile();
		            textField_3.setText(file.getPath());

		        } else {
		        	textField_3.setText("");
		        }
		   }
	}
	
	private boolean isNullOrEmpty(JTextField field){
		return field.getText() == null || "".equals(field.getText());
	}
}
