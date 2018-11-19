package _03_IntroToStacks;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	
	Stack<Character> textDelete = new Stack <Character>();
	public static void main(String[] args) {
		_02_TextUndoRedo a = new _02_TextUndoRedo();
	}
	
	_02_TextUndoRedo(){
	frame.add(panel);
	panel.add(label);
	label.setText("");
	frame.addKeyListener(this);
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(1000, 500);
	frame.setVisible(true);
	}
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */


	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE) {
			String s = label.getText();
			char deletedChar = s.charAt(s.length()-1);
			textDelete.push(deletedChar);
			String serria = s.substring(0, s.length()-1);
				label.setText(serria);
				
			}
		else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			char returned=textDelete.pop();
			label.setText(label.getText()+returned);
		}
		else {
			label.setText(label.getText()+e.getKeyChar());
		}
	}
		
	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}
	
}
