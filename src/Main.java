import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import airportx.Flight;
import airportx.Form;
//import airportx.DatabaseFL;
import java.io.IOException;

public class Main {

    public static List<Flight> main(String[] args) throws IOException {

     Form vp = new Form();
     vp.setVisible(true);

        Scanner scanner = new Scanner(new File("/Users/sashikoshirai/Downloads/SPL_FLIGHT_AR.csv"));
        Scanner dataScanner = null;
        int index = 0;
        List<Flight> flightList = new ArrayList<>();
       // List<DatabaseFL> DatabaseFL = new ArrayList<>();
  
        while (scanner.hasNextLine()) {
          dataScanner = new Scanner(scanner.nextLine());
          dataScanner.useDelimiter(",");
          Flight fl = new Flight();
          //DatabaseFL fld = new DatabaseFL();
    
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

        }
    
        scanner.close();
    
        //Database.add(airportx.DatabaseFL);
      
        
        System.out.println(flightList);

      return flightList;
      
      }

      
      }