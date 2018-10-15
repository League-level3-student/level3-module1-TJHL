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
		JButton pause = new JButton();
		JLabel name = new JLabel();
		JButton next = new JButton();
		JButton shuffle = new JButton();
		
		String currentSong = null;
		ArrayList <String> songList = new ArrayList <String>();
		
	public static void main(String[] args) {
		_06_IPodShuffle a = new _06_IPodShuffle();
		
		
	}
	
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
	
		frame.add(panel);
		panel.add(next);
		next.setText("Next");
		panel.add(name);
		name.setText("no song selected");
		panel.add(pause);
		pause.setText("Pause");
		panel.add(shuffle);
		shuffle.setText("Shuffle");
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		
		songList.add("");
				
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
	}
		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==next) {
			if(currentSong==null) {
					
			}
			
		}
		
		if(e.getSource()==pause) {
			if(currentSong==null) {
				
			}
			else {
			
			}
		}
			
		if(e.getSource()==shuffle) {
			songShuffle();
			playSong();
		}
		
		
		
	}

	void playSong() {
		Song a = new Song("demo.mp3");
		a.play();
		new _06_IPodShuffle();
		
	}
	void songShuffle() {
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}