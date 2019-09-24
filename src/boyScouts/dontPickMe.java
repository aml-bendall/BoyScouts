/**
 * @author Demystify
 * Created On: 8/8/2018
 *
 * This program creates a game where users are added to a list. The users are randomly eliminated and the last player stands.
 * 
 * Modification log: 8/11/2018 - Added Comments to code.
 * 
 */

package boyScouts;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class dontPickMe {
	public static void main(String[] args) {
		//Implement array of players
		List<String> boyScouts = new ArrayList<String>();	
		
		//Add players until the user chooses to stop
		boolean userStop=false;
		while (userStop==false) {
			String name;
			name = JOptionPane.showInputDialog("Enter your name");
				boyScouts.add(name);
				int reply = JOptionPane.showConfirmDialog(null, "Would you like to add another player?", "Add Player?", JOptionPane.YES_NO_OPTION);
		        if (reply == JOptionPane.YES_OPTION) {
		            //user chose to add another player
		        	userStop=false;
		        }
		        else {
		        	//user is ready to begin the game
		           JOptionPane.showMessageDialog(null, "The game has " + boyScouts.size() + " players. GOOD LUCK!!!");
		           	userStop=true;
		        }
			}
		
		JFrame frame=new JFrame(); 
		int numberOfBoys=boyScouts.size();
		
		for (int x=0; x<numberOfBoys; x++) {
            Random randomNumber = new Random();
            
            //Create a random number equal to the size of the boyscout array
            int  n = randomNumber.nextInt(boyScouts.size());
            
            //Subtract one because the index of a Java array begins at 0
            n=n-1;

            //If boyscout array size is one, do nothing because the winner has been determined.
        for(int i=0; i<boyScouts.size(); i++){
        	if (boyScouts.size()!=1) {
        		if(i==n) {
            		System.out.println("This is i: " +i);
            		System.out.println("This is n: " +n);
            		System.out.println("This is the N Player Being Eliminated (should match i player): " +boyScouts.get(n));
            		System.out.println("This is the I Player Being Eliminated (should match n player): " + boyScouts.get(i));
            		System.out.println("this is size: " + boyScouts.size());
        			//The random number matches the index of this user. They are eliminated.
        				JOptionPane.showMessageDialog(frame ,
        						boyScouts.get(n) + " has been eliminated!");
        				boyScouts.remove(n);
        				 }
        			}
        		}
			}
		
		//The last one standing wins!
		JOptionPane.showMessageDialog(frame ,
			    boyScouts.get(0) + " is the winner!!!");
		
		}
	}

