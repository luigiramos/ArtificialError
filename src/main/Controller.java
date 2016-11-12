package main;

import java.awt.event.*;
import java.io.File;

import javax.swing.JOptionPane;

public class Controller {
	private Model model;
	private View view;
	private File input = null;

	public Controller(Model model, View view) {
		super();
		this.model = model;
		this.view = view;

		this.view.addOpenFileListener(new OpenListener());
		this.view.addProceedListener(new ProceedListener());
	}

	class OpenListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			input = view.getFile();
		}
	}

	class ProceedListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (input != null && input.exists())
				model.setFile(input);
			else
				JOptionPane.showMessageDialog(view, "Please Select a File.");
		}
	}
}
