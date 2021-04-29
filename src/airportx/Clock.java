package airportx;

public class Environment {

	Talker t;  // Start t

	
	public String[] start(int steps){ // Start method 
		String messages []= new String [steps];
		
		t = new Talker();  
                //Create talker
		for(int i=0;i<steps;i++){  
                     // "for loop" 
		messages[i]= t.saySomething(); 
                   // launch sentence
		} 
		
		return messages;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) { 
         // main method
		
		Environment e = new Environment(); 
                 // Create environment
		e.start(5); 
               // Run for 5 steps
	}
}





