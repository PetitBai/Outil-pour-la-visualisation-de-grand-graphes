package com.Interface;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Interface extends JFrame{
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(10, 10, 900, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setContentPane(new graphics());
	}

}

class graphics extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		ReadData pointData = new ReadData();
		pointData.read("Data/Paris.csv");
		for(int i = 0;i<pointData.longitude.size();i++){
			g.drawString(".",pointData.longitude.get(i),pointData.latitude.get(i));
			g.setColor(Color.BLACK);
		}
		
		
	}
}
