package airportx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.io.IOException;
import airportx.Flight;

public class Database{
     Object GHdb; 
     Object ATCdb;
     Object ACOdb;
     Object APOdb;
     Object ATCFMdb;

    private String departure;
    private String arrival;
    private String AicraftType;
    private String LocalStand;
    private String Airline;
    private String Gate;
    private String planeId;
	private String flightId;
    private String SLDT;
    private String ELDT;
    private String ALDT;
    private String RefTimestamp;
    private String EIBT;
    private String AIBT;
    private String SOBT;
    private String EOBT;
    private String TOBT;
    private String TSAT;
    private String TTOT;
    private String ProbW;
    private String ProbS;
    private String ProbG;
    
    public Database() {
        this.departure = "departure";
        this.arrival = "arrival";
        this.AicraftType = "AicraftType";
        this.LocalStand = "LocalStand";
        this.Airline = "Airline";
        this.Gate = "Gate";
        this.planeId = "planeId";
        this.flightId = "flightId";
        this.SLDT = "SLDT";
        this.ELDT = "ELDT";
        this.ALDT = "ALDT";
        this.RefTimestamp = "RefTimestamp";
        this.EIBT = "EIBT";
        this.AIBT = "AIBT";
        this.SOBT = "SOBT";
        this.EOBT = "EOBT";
        this.TOBT = "TOBT";
        this.TSAT = "TSAT";
        this.TTOT = "TTOT";
        this.ProbW = "ProbW";
        this.ProbS = "ProbS";
        this.ProbG = "ProbG";
    }

public String getDeparture() {
    return departure;
}

public String getArrival() {
    return arrival;
}

public String getAicraftType() {
    return AicraftType;
}

public String getLocalStand() {
    return LocalStand;
} 

public String getAirline() {
    return Airline;
}

public String getGate() {
    return Gate;
}

public String getPlaneId() {
    return planeId;
}

public String getFlightId() {
    return flightId;
}

public String getSLDT() {
    return SLDT;
}

public String getELDT() {
    return ELDT;
}

public String getALDT() {
    return ALDT;
}

public String getRefTimestamp() {
    return RefTimestamp;
}

public String getEIBT() {
    return EIBT;
}

public String getAIBT() {
    return AIBT;
}

public String getSOBT() {
    return SOBT;
}

public String getEOBT() {
    return EOBT;
}

public String getTOBT() {
    return TOBT;
}

public String getTSAT() {
    return TSAT;
}

public String getTTOT() {
    return TTOT;
}

public String getProbW() {
    return ProbW;
}

public String getProbS() {
    return ProbS;
}

public String getProbG() {
    return ProbG;
}

public void setDeparture(String newDeparture) {
    this.departure = newDeparture;
}

public void setArrival(String newArrival) {
    this.arrival = newArrival;
}

public void setAircraftType(String newAircraftType) {
    this.planeId = newAircraftType;
}

public void setLocalStand (String newLocalStand) {
    this.planeId = newLocalStand;
}

public void setAirline(String newAirline) {
    this.Airline = newAirline;
}

public void setGate(String newGate) {
    this.Gate = newGate;
}

public void setPlaneId(String newPlaneId) {
    this.planeId = newPlaneId;
}

public void setFlightId(String newFlightId) {
    this.flightId = newFlightId;
}

public void setSLDT(String data) {
    this.SLDT = data;
}

public void setELDT(String data) {
    this.ELDT = data;
}

public void setALDT(String data) {
    this.ALDT = data;
}

public void setRefTimestamp(String data) {
    this.RefTimestamp = data;
}

public void setEIBT(String data) {
    this.EIBT = data;
}

public void setAIBT(String data) {
    this.AIBT = data;
}

public void setSOBT(String data) {
    this.SOBT = data;
}

public void setEOBT(String data) {
    this.EOBT = data;
}

public void setTOBT(String data) {
    this.TOBT = data;
}
    
public void setTSAT(String data) {
    this.TSAT = data;
}

public void setTTOT(String data) {
    this.TTOT = data;
}

public void setProbW(String data) {
    this.ProbW = data;
}

public void setProbS(String newProbS) {
    this.ProbS = newProbS;
}

public void setProbG(String newProbG) {
    this.ProbG = newProbG;
}

@Override
public String toString() {
    return "Flight Id : " + flightId + "\n\nPlane Id : " + planeId + "\n\nAirline : " + Airline + "\n\nDeparture : " + departure + "\n\nArrival : " + arrival + "\n\nLocalStand : " + LocalStand + "\n\nGate : " + Gate + "\n\nSLDT : " + SLDT + 
    "\n\nELDT : " + ELDT + "\n\nALDT : " + ALDT + "\n\nRefTimestamp : " + RefTimestamp + "\n\nEIBT : " + EIBT + "\n\nAIBT : " + AIBT + "\n\nSOBT : " + SOBT + "\n\nEOBT : " + EOBT + "\n\nTOBT : " + TOBT   
    + "\n\nTSAT : " + TSAT + "\n\nTTOT : " + TTOT  + "\n\nProbW : " + ProbW + "\n\nProbS : " + ProbS + "\n\nProb : " + ProbG;
}
    
    Scanner scanner = new Scanner(new File("/Users/sashikoshirai/Downloads/SPL_FLIGHT_AR.csv"));
    Scanner dataScanner = null;
    int index1 = 0;
    List<Flight> flightList = new ArrayList<>();
  
    while (scanner.hasNextLine()) {
      dataScanner = new Scanner(scanner.nextLine());
      dataScanner.useDelimiter(",");
      Flight fld = new Flight();

      while (dataScanner.hasNext()) {
        String data = dataScanner.next();
        if (index1 == 0)
          fld.setDeparture(data);
        else if (index1 == 1)
          fld.setArrival(data);
        else if (index1 == 2)
          fld.setAircraftType(data);
        else if (index1 == 3)
          fld.setLocalStand(data);
        else if (index1 == 4)
          fld.setAirline(data);
        else if (index1 == 5)
          fld.setGate(data);
        else if (index1 == 6)
          fld.setPlaneId(data);
        else if (index1 == 7)
          fld.setFlightId(data);
        else if (index1 == 8)
          fld.setSLDT(data);
        else if (index1 == 9)
          fld.setELDT(data);
        else if (index1 == 10)
          fld.setALDT(data);
        else if (index1 == 11)
          fld.setRefTimestamp(data);
        else if (index1 == 12)
          fld.setEIBT(data);
        else if (index1 == 13)
          fld.setAIBT(data);
        else if (index1 == 14)
          fld.setSOBT(data);
        else if (index1 == 15)
          fld.setEOBT(data);
        else if (index1 == 16)
          fld.setTOBT(data);
        else if (index1 == 17)
          fld.setTSAT(data);
        else if (index1 == 18)
          fld.setTTOT(data);
        else if (index1 == 19)
          fld.setProbW(data);
        else if (index1 == 20)
          fld.setProbS(data);
        else if (index1 == 21)
          fld.setProbG(data);
        else

        index1++;
      }

      index1 = 0;
      flightList.add(fld);
    }

    scanner.close();
   
   public Object toObject() {
    return fld.ightId + fld.planeId +  fld.Gate + fld.SLDT + fld.ELDT + fld.EIBT + fld.SOBT + fld.EOBT + fld.TOBT;
    }
}