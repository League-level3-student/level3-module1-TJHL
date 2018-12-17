package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class _02_LogSearch implements ActionListener{

	 // Crate a HashMap of Integers for the keys and Strings for the values.
	HashMap <Integer, String> jf= new HashMap <Integer, String>();
	//Create a GUI with three buttons. 
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton("Add Entry");
	JButton search = new JButton("Search by ID");
	JButton view = new JButton("View List");
	JButton remove = new JButton("Remove Entry");
	public static void main(String[] args)  {
		_02_LogSearch a = new _02_LogSearch();
	}
	_02_LogSearch (){
		frame.add(panel);
		add.addActionListener(this);
		search.addActionListener(this);
		view.addActionListener(this);
		remove.addActionListener(this);
		panel.add(add);
		panel.add(search);
		panel.add(view);
		panel.add(remove);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
		public void actionPerformed(ActionEvent e) {
	/* Button 1: Add Entry
	* 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	* 				After an ID is entered, use another input dialog to ask the user to enter a name.
	* 				Add this information as a new entry to your HashMap.
	*/
			if(e.getSource()== add) {
				Integer id;
				String s=JOptionPane.showInputDialog("Create an ID");
				id=Integer.parseInt(s);
				String name =JOptionPane.showInputDialog("Create a name to be bound to the ID");
				jf.put(id, name);
			}
	/* Button 2: Search by ID
	 * 
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 */		
			if(e.getSource()== search) {
				String searchResultsString=JOptionPane.showInputDialog("Search for IDs");
				Integer searchResultsInteger=Integer.parseInt(searchResultsString);
				if(jf.containsKey(searchResultsInteger)) {
					JOptionPane.showMessageDialog(null, "ID: "+searchResultsInteger+"\nName: "+jf.get(searchResultsInteger));
				}
			}
	/* Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 */ 		
			if(e.getSource()== view) {
				String display= "";
				Integer greatestInteger=0;
				for (Integer key: jf.keySet()) {
					if(key+1 >greatestInteger) {
					greatestInteger=key+1;
					}
				}
				for (int i = 0; i <greatestInteger ; i++) {
					if(jf.get(i)!= null) {
					display=display+"ID: "+i+"    Name:"+jf.get(i)+"\n";
					}
				}
				JOptionPane.showMessageDialog(null, display);
			}
	 /* When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 */
		
			if(e.getSource()== remove) {
				String idToRemoveString=JOptionPane.showInputDialog("Input an ID to remove");
				Integer idToRemove =Integer.parseInt(idToRemoveString);
				if(jf.containsKey(idToRemove)) {
					jf.remove(idToRemove);
					JOptionPane.showMessageDialog(null, "ID "+idToRemove+" Removed");
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Error 404\nID: "+idToRemove+" not found");
					
				}
			}
		
		}
}
