import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Stack;

public class Checkpoint {
/*		//CHECKPOINT ARRAYLIST
	public static void main(String[] args) {
		
		ArrayList<Cow> a = new ArrayList<Cow>();
		Cow b = new Cow();
		a.add(b);
		int d = 0;
		Random bob = new Random();
		d=bob.nextInt(Integer.MAX_VALUE);
		for (int i = 0; i < d; i++) {
			a.add(b);
		}
		for (int j = 0; j < a.size(); j++) {
			a.get(j).feed();
		}
		
	}
	
}

class Cow {
    public void feed(){}
    */
	
/*		//CHECKPOINT STACKS
	public static void main(String[] args) {
		Stack<Integer> a = new Stack<Integer>();
		for (int i = 0; i < 10; i++) {
			int input = 0;
			Random number = new Random();
			input=number.nextInt();
			a.push(input);
		}
		int sum=0;
		for (int i = 0; i < 10; i++) {
			sum = sum + a.pop();
			
		}
		System.out.println(sum);
	}	*/
	
	//CHECKPOINT HASHMAP
		public static void main(String[] args) {
		
			HashMap<String, String> translator = new  HashMap<String, String>();
			
			translator.put("Alpha", "a");
			translator.put("Bravo", "b");
			translator.put("Charlie", "c");
			translator.put("Delta", "d");
			translator.put("Echo", "e");
			
			for (int i = 0; i < translator.size(); i++) {
				System.out.println(translator.+" , "++"\n");
			}
			
			
			
			
			
			
		}
		
  }