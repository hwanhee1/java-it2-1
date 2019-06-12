package project;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.io.*;
import java.net.Socket;
import javax.swing.*;

public class DicClientFrame extends JFrame {
	private Socket socket = null;
	private JTextField eng = new JTextField(10);
	private JTextField kor = new JTextField(10);
	private JButton searchBtn = new JButton("Ã£±â");
	
	BufferedReader in = null;
	BufferedWriter out = null;
	
	public DicClientFrame() {
		super
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
