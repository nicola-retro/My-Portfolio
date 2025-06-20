package demo_sort;

import java.awt.*;
import javax.swing.*;

public class Interpreter {

	public Interpreter() {
		
	}
	
	public void run() {
		
		// Raw is the string input of the user before we convert it into an integer.
		
		String [] raw = {"","",""};
		
		// This is the array of integers that we will sort in a moment.
		
		int [] integers = {0,0,0};
		
		for(int i = 0; i <= 2; i++) {
			
			// We really don't want the user to put in a non-integer. 
			// If the input isn't an integer, we display an error message and close the program.
			
			try {
				raw[i] = JOptionPane.showInputDialog("Please insert an integer");
				integers[i] = Integer.parseInt(raw[i]);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"You did not put in an integer!");
				System.exit(0);
			}
		
		}
		
		// I could use native Java sorting but that's not the point of this demo!
		// Although Bubble Sort isn't adequate for larger sets of data, it is a simple
		// and effective demonstration of my knowledge of loops and sorting at a
		// basic level.
		
		for (int i = 0; i < integers.length - 1; i++) {
			for (int j = 0; j < integers.length - 1; j++) {
				if (integers[j] > integers[j+1]) {
					int k = integers[j];
					integers[j] = integers[j+1];
					integers[j+1] = k;
				}
			}
		}
		
		for (int i = 0; i < integers.length; i ++) {
			System.out.println(integers[i]);
		}
	}
}
