import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import airportx.Flight;
import airportx.Form;
import airportx.DatabaseFL;
import java.io.IOException;

public class Main {

    public static List<Flight> main(String[] args) throws IOException {

     Form vp = new Form();
     vp.setVisible(true);

        Scanner scanner = new Scanner(new File("/Users/sashikoshirai/Downloads/SPL_FLIGHT_AR.csv"));
        Scanner dataScanner = null;
        int index = 0;
        List<Flight> flightList = new ArrayList<>();
        List<DatabaseFL> DatabaseFL = new ArrayList<>();
  
        while (scanner.hasNextLine()) {
          dataScanner = new Scanner(scanner.nextLine());
          dataScanner.useDelimiter(",");
          Flight fl = new Flight();
          DatabaseFL fld = new DatabaseFL();
    
          while (dataScanner.hasNext()) {
            String data = dataScanner.next();
            if (index == 0)
              fl.setDeparture(data);
            else if (index == 1)
              fl.setArrival(data);
            else if (index == 2)
              fl.setAircraftType(data);
            else if (index == 3)
              fl.setLocalStand(data);
            else if (index == 4)
              fl.setAirline(data);
            else if (index == 5)
              fl.setGate(data);
            else if (index == 6)
              fl.setPlaneId(data);
            else if (index == 7)
              fl.setFlightId(data);
            else if (index == 8)
            fl.setSLDT(data);
            else if (index == 9)
              fl.setELDT(data);
            else if (index == 10)
              fl.setALDT(data);
            else if (index == 11)
              fl.setRefTimestamp(data);
            else if (index == 12)
              fl.setEIBT(data);
            else if (index == 13)
              fl.setAIBT(data);
            else if (index == 14)
              fl.setSOBT(data);
            else if (index == 15)
              fl.setEOBT(data);
            else if (index == 16)
              fl.setTOBT(data);
            else if (index == 17)
              fl.setTSAT(data);
            else if (index == 18)
              fl.setTTOT(data);
            else if (index == 19)
            fl.setProbW(data);
            else if (index == 20)
              fl.setProbS(data);
            else if (index == 21)
              fl.setProbG(data);
            else
              System.out.println("flight not find" + data);
            index++;
          }
          index = 0;
          flightList.add(fl);
         
          ArrayList<Flight> getAllFlights(); {
            return flightList;
        }
    
        Flight findFlight(int id); {
    
            for (int i = 0; i < flightList.size(); i++) {
                if (flightList.get(i).getFlightId() == id) {
                    return flightList.get(i);
                }
            }
    
            return null;
        }


        }
    
        scanner.close();
    
        Database.add(airportx.DatabaseFL);
      
        
        System.out.println(flightList);
    
        
  
  
    //Simuation Clock
        for (int day = 1; day < 7; ++day) {
          switch (day) {
            
            case 1:
              System.out.println("\tD-6");
              break;
    
            case 2:
              System.out.println("\tD-5");
              break;
    
            case 3:
              System.out.println("\tD-4");
              break;
    
            case 4:
              System.out.println("\tD-3");
              break;
    
            case 5:
              System.out.println("\tD-2");
              break;
    
            case 6:
              System.out.println("\tD-1");
              break;
          }
    
          for (int minute = 0; minute < 1440; ++minute) {
        
            //System.out.println(minute / 60 + " : " + minute % 60 + " hours");
    
          }
        }
        String Schedule = STime();

        public static String STime() 
        {
          int hour = r.nextInt(23);
          int min = r.nextInt(59);
          String h = (hour < 10) ? "0" + hour : String.valueOf(hour);
          String m = (min < 10) ? "0" + min : String.valueOf(min);
        }
          return h + ":" + m;
        }
  
    
        //File myObj = new File("C:/Users/sashikoshirai/Downloads/filename.txt");


    }