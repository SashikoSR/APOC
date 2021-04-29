package airportx;

	import java.io.BufferedReader;
	import java.util.*;
	import java.io.FileReader;
	import java.io.IOException;
    import sim.engine.*;

	import airportx.Flight;

public class GH {

	 //______________________________________________________________________
	 //input
	 //______________________________________________________________________
	        			  
    private String AicraftType;
    private String Airline;
    private String Gate;
    private String planeId;
	private String flightId;
    private String SLDT;
    private String ELDT;
    private String EIBT;
    private String AIBT;
    private String SOBT;
    private String EOBT;
    private String TOBT;
	private int GHteam;
    private int WaitingTime[] = new int[n];
	private int TurnAroundTime [] = new int[n];
	private int TotalWaitingTime = 0;
	private int TotalTurnAroundTime = 0;
	private double AVGWaitingTime;
	private double AVGTurnAroundTime;

	
	
	Scanner sc = new Scanner(System.in);	
	int n = sc.nextInt();
	
	


	//Databases for agents

public Object GHdb() {
    return GHdb;
}

public void GHdb (Object data) {
  
	this.AicraftType = "AicraftType";
	this.Airline = "Airline";
	this.Gate = "Gate";
	this.planeId = "planeId";
	this.flightId = "flightId";
	this.SLDT = "SLDT";
	this.ELDT = "ELDT";
	this.EIBT = "EIBT";
	this.SOBT = "SOBT";
	this.EOBT = "EOBT";
	this.TOBT = "TOBT";
	
	
}

@Override
public String toString() {
    return "Flight Id : " + flightId + "\n\nPlane Id : " + planeId + "\n\nAircraftType : " + AicraftType + "\n\nAirline : " + Airline + "\n\nGate : " + Gate + "\n\nSLDT : " + SLDT + "\n\nELDT : " + ELDT +
    "\n\nEIBT : " + EIBT + "\n\nSOBT : " + SOBT + "\n\nEOBT : " + EOBT + "\n\nTOBT : " + TOBT;
}

	       		    for (int i = 0; i < n; i++) {
	        			        System.out.println("Flight id of movement " + (i + 1));
	        			        flightId= sc.nextInt();
	        			    }

	        			    System.out.println("______________________________________");

	        			    System.out.println("*SLDT for each movement*");
	        			    for (int i = 0; i < n; i++) {
	        			        System.out.println("SLDT for each movement " + (i + 1));
	        			        SLDT[i] = sc.nextInt();
	        			    }

	        			    System.out.println("_______________________________________");

	        			    System.out.println("*Ref time stamp for each movement*");
	        			    for (int i = 0; i < n; i++) {
	        			        System.out.println("Ref time stamp for each movement  " + (i + 1));
	        			        RefTime[i] = sc.nextInt();
	        			    }

	        			    //______________________________________________________________________
	        			    //process
	        			    //______________________________________________________________________
	        			    int time = 0; // "time" for the current time.
	        			    int min = 0;  // "min" for the least service time.
	        			    int j = 0;    // "j" to save the task with the least time.
	        			    int count;    // "count" to identify if it is the first operation in this turn. 

	        			    for (int c = 0; c < n; c++) {
	        			        count = 0;
	        			        for (int i = 0; i < n; i++) //looping through all the tasks
	        			        {
	        			            if (EOBT[i] == 0) //checking if the task wasn't done before
	        			            {
	        			                if (ELDT[i] <= time) //checking if the flight is on SLDT
	        			                {
	        			                    count++;
	        			                    if (count == 1) //checking if it's the first task in this turn movements per hour first one
	        			                    {
	        			                        min = RefTime[i];
	        			                        j = i;
	        			                    } else {
	        			                        if (RefTime[i] < min) //checking if the task's service time is less than the current min
	        			                        {
	        			                            min = RefTime[i];
	        			                            j = i; //takes process number and puts it in "j" then compares again
	        			                        }
	        			                    }
	        			                }
	        			            }
	        			        }
	        			        EIBT[j] = time;
	        			        time += min;
	        			        EOBT[j] = time;
	        			    }

	        			    //calculating waiting time and turnaround time
	        			    for (int y = 0; y < n; y++) {
	        			        WaitingTime[y] = EIBT[y] - ELDT[y];
	        			        TurnAroundTime[y] = WaitingTime[y] + RefTime[y];
	        			        TotalWaitingTime += WaitingTime[y];
	        			        TotalTurnAroundTime += TurnAroundTime[y];
	        			    }

	        			    AVGWaitingTime = (double) TotalWaitingTime / n;
	        			    AVGTurnAroundTime = (double) TotalTurnAroundTime / n;

	        			    //______________________________________________________________________
	        			    //output
	        			    //______________________________________________________________________
	        			    System.out.println("*Finish time for the processes*");

	        			    System.out.println("_______________________________________");

	        			    for (int i = 0; i < n; i++) {
	        			        System.out.println("Estimated TOBT  " + (i + 1) + "  " + EOBT[i]);
	        			    }

	        			    System.out.println("____________________________________________________");

	        			    System.out.println("*Waiting time for the processes*");

	        			    System.out.println("_______________________________________");

	        			    for (int i = 0; i < n; i++) {
	        			        System.out.println("Waiting time for process  " + (i + 1) + "  " + WaitingTime[i]);
	        			    }

	        			    System.out.println("____________________________________________________");

	        			    for (int i = 0; i < n; i++) {
	        			        System.out.println("Turnaround time for process  " + (i + 1) + "  " + TurnAroundTime[i]);
	        			    }

	        			    System.out.println("____________________________________________________");

	        			    System.out.println("_______________________________________");

	        			    System.out.println("AVGWaiting time for processes  " + "  " + AVGWaitingTime);

	        			    System.out.println("____________________________________________________");

	        			    System.out.println("AVGTurnAroundTime time for processes  " + "  " + AVGTurnAroundTime);

	        			    System.out.println("____________________________________________________");

	        			 }
	        			}       			
	        			
}
}
}
