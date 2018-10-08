package _01_IntroToArrayLists;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle{
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
				
				
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
	}
	
	public static void main(String[] args) {
		new _06_IPodShuffle();
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton pause = new JButton();
		JTextField name = new JTextField();
		JButton next = new JButton();
		
		frame.add(panel);
		panel.add(next);
		panel.add(name);
		panel.add(pause);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}