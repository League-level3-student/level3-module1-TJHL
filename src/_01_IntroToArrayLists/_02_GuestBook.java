package _01_IntroToArrayLists;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
		JPanel panel;
		JFrame frame ;
		JButton add;
		JButton view;
		ArrayList <String> nameList = new ArrayList <String>();
		String input = "";
		String visualList ="";
	public static void main(String[] args) {
		_02_GuestBook a = new _02_GuestBook ();	

	}
	_02_GuestBook(){
		panel = new JPanel();
		frame = new JFrame();
		add = new JButton("Add Name");
		view = new JButton("View Names");
		add.addActionListener(this);
		view.addActionListener(this);
		frame.add(panel);
		panel.add(add);
		panel.add(view);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		nameList.add("Bob Banders");
		nameList.add("Sandy Summers");
		nameList.add("Greg Ganders");
		nameList.add("Donny Doners");
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==add) {
		input=	JOptionPane.showInputDialog("Input those name you dub as");
		nameList.add(input);
		}
		
		if(e.getSource()==view) {
			for (int i = 0; i < nameList.size(); i++) {
				visualList= visualList +nameList.get(i);
				visualList= visualList + "\n";
			}
			
			JOptionPane.showMessageDialog(null,	"Your only friends are: \n"+visualList);
			visualList = "";
		}
		
		
	}
	
	
	
}
