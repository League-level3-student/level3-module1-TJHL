package _01_IntroToArrayLists;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton play = new JButton();
		JLabel name = new JLabel();
		
		ArrayList <Song> songList = new ArrayList <Song>();
		
	public static void main(String[] args) {
		_06_IPodShuffle a = new _06_IPodShuffle();
		
	}
	
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
	
		frame.add(panel);
		panel.add(name);
		name.setText("no song selected");
		panel.add(play);
		play.setText("Play");
		play.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		
		songList.add(new Song ("demo.mp3"));
		songList.add(new Song ("Joel Nielsen - BMS - On a Rail (old).mp3"));
		songList.add(new Song ("Joel Nielsen - Black Mesa Soundtrack - Surface Tension Uncut.mp3"));
		songList.add(new Song ("JoelNielsen.BeingHuman.mp3"));
		
				
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
	}
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==play) {
		for (int i = 0; i < songList.size(); i++) {
			songList.get(i).stop();
		}
		Random b = new Random();
		int c = b.nextInt(songList.size());
		name.setText(songList.get(c).toString());
		songList.get(c).play();
		
			}	
		}
		
	
}