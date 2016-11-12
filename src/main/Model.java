package main;

import java.io.File;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Model {
	private File file;

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
		JOptionPane.showMessageDialog(new JFrame(), "wew lad");
	}

}
