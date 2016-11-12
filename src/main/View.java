package main;

import java.awt.event.*;
import java.io.File;
import javax.swing.*;

public class View extends JFrame {
	private JButton openFileBtn = new JButton("Open File");
	private JButton proceedBtn = new JButton("Proceed");
	private JFileChooser fileChooser = new JFileChooser();
	File file;

	public View() {
		JPanel mainPanel = new JPanel();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);

		mainPanel.add(openFileBtn);
		mainPanel.add(proceedBtn);
		this.add(mainPanel);
	}

	public File getFile() {
		JFileChooser fc = new JFileChooser();
		if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
			return fc.getSelectedFile();
		else
			return null;
	}

	public void addOpenFileListener(ActionListener al) {
		openFileBtn.addActionListener(al);
	}
	
	public void addProceedListener(ActionListener al) {
		proceedBtn.addActionListener(al);
	}
}
