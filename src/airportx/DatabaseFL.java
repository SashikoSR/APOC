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

public class DatabaseFL{

    public Object GHdb; 
    public Object ATCdb;
    public Object ACOdb;
    public Object APOdb;
    public Object ATCFMdb;

    private String departureFL;
    private String arrivalFL;
    private String AicraftTypeFL;
    private String LocalStandFL;
    private String AirlineFL;
    private String GateFL;
    private String planeIdFL;
	private String flightIdFL;
    private String SLDTFL;
    private String ELDTFL;
    private String ALDTFL;
    private String RefTimestampFL;
    private String EIBTFL;
    private String AIBTFL;
    private String SOBTFL;
    private String EOBTFL;
    private String TOBTFL;
    private String TSATFL;
    private String TTOTFL;
    private String ProbWFL;
    private String ProbSFL;
    private String ProbGFL;
    
    public DatabaseFL() {
        this.departureFL = "departure";
        this.arrivalFL = "arrival";
        this.AicraftTypeFL = "AicraftType";
        this.LocalStandFL = "LocalStand";
        this.AirlineFL = "Airline";
        this.GateFL = "Gate";
        this.planeIdFL = "planeId";
        this.flightIdFL = "flightId";
        this.SLDTFL = "SLDT";
        this.ELDTFL = "ELDT";
        this.ALDTFL = "ALDT";
        this.RefTimestampFL = "RefTimestamp";
        this.EIBTFL = "EIBT";
        this.AIBTFL = "AIBT";
        this.SOBTFL = "SOBT";
        this.EOBTFL = "EOBT";
        this.TOBTFL = "TOBT";
        this.TSATFL = "TSAT";
        this.TTOTFL = "TTOT";
        this.ProbWFL = "ProbW";
        this.ProbSFL = "ProbS";
        this.ProbGFL = "ProbG";
    }

public String getDeparture() {
    return departureFL;
}

public String getArrival() {
    return arrivalFL;
}

public String getAicraftType() {
    return AicraftTypeFL;
}

public String getLocalStand() {
    return LocalStandFL;
} 

public String getAirline() {
    return AirlineFL;
}

public String getGate() {
    return GateFL;
}

public String getPlaneId() {
    return planeIdFL;
}

public String getFlightId() {
    return flightIdFL;
}

public String getSLDT() {
    return SLDTFL;
}

public String getELDT() {
    return ELDTFL;
}

public String getALDT() {
    return ALDTFL;
}

public String getRefTimestamp() {
    return RefTimestampFL;
}

public String getEIBT() {
    return EIBTFL;
}

public String getAIBT() {
    return AIBTFL;
}

public String getSOBT() {
    return SOBTFL;
}

public String getEOBT() {
    return EOBTFL;
}

public String getTOBT() {
    return TOBTFL;
}

public String getTSAT() {
    return TSATFL;
}

public String getTTOT() {
    return TTOTFL;
}

public String getProbW() {
    return ProbWFL;
}

public String getProbS() {
    return ProbSFL;
}

public String getProbG() {
    return ProbGFL;
}

public void setDeparture(String newDeparture) {
    this.departureFL = newDeparture;
}

public void setArrival(String newArrival) {
    this.arrivalFL = newArrival;
}

public void setAircraftType(String newAircraftType) {
    this.planeIdFL = newAircraftType;
}

public void setLocalStand (String newLocalStand) {
    this.planeIdFL = newLocalStand;
}

public void setAirline(String newAirline) {
    this.AirlineFL = newAirline;
}

public void setGate(String newGate) {
    this.GateFL = newGate;
}

public void setPlaneId(String newPlaneId) {
    this.planeIdFL = newPlaneId;
}

public void setFlightId(String newFlightId) {
    this.flightIdFL = newFlightId;
}

public void setSLDT(String data) {
    this.SLDTFL = data;
}

public void setELDT(String data) {
    this.ELDTFL = data;
}

public void setALDT(String data) {
    this.ALDTFL = data;
}

public void setRefTimestamp(String data) {
    this.RefTimestampFL = data;
}

public void setEIBT(String data) {
    this.EIBTFL = data;
}

public void setAIBT(String data) {
    this.AIBTFL = data;
}

public void setSOBT(String data) {
    this.SOBTFL = data;
}

public void setEOBT(String data) {
    this.EOBTFL = data;
}

public void setTOBT(String data) {
    this.TOBTFL = data;
}
    
public void setTSAT(String data) {
    this.TSATFL = data;
}

public void setTTOT(String data) {
    this.TTOTFL = data;
}

public void setProbW(String data) {
    this.ProbWFL = data;
}

public void setProbS(String newProbS) {
    this.ProbSFL = newProbS;
}

public void setProbG(String newProbG) {
    this.ProbGFL = newProbG;
}

@Override
public String toString() {
    return "Flight Id : " + flightIdFL + "\n\nPlane Id : " + planeIdFL + "\n\nAirline : " + AirlineFL + "\n\nDeparture : " + departureFL + "\n\nArrival : " + arrivalFL + "\n\nLocalStand : " + LocalStandFL + "\n\nGate : " + GateFL + "\n\nSLDT : " + SLDTFL + 
    "\n\nELDT : " + ELDTFL + "\n\nALDT : " + ALDTFL + "\n\nRefTimestamp : " + RefTimestampFL + "\n\nEIBT : " + EIBTFL + "\n\nAIBT : " + AIBTFL + "\n\nSOBT : " + SOBTFL + "\n\nEOBT : " + EOBTFL + "\n\nTOBT : " + TOBTFL +  
    "\n\nTSAT : " + TSATFL + "\n\nTTOT : " + TTOTFL  + "\n\nProbW : " + ProbWFL + "\n\nProbS : " + ProbSFL + "\n\nProb : " + ProbGFL;
}
    
    Scanner scanner = new Scanner(new File("/Users/sashikoshirai/Downloads/SPL_FLIGHT_AR.csv"));
    Scanner dataScanner = null;
    int index1 = 0;
    List<DatabaseFL> DatabaseFL = new ArrayList<>();
  
    while (scanner.hasNextLine()) {
      dataScanner = new Scanner(scanner.nextLine());
      dataScanner.useDelimiter(",");
      DatabaseFL fld = new DatabaseFL();

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
      DatabaseFL.add(fld);
    

    scanner.close();
    }
}

public void GHdb(String arrivalFL, String AircraftTypeFL, String GateFL, String planeIdFL, String flightIdFL, String SLDTFL, String ELDTFL, String RefTimestampFL, String EIBTFL, String SOBTFL, String EOBTFL, String TOBTFL ) {
    
    this.arrivalFL = "arrival";
    this.AicraftTypeFL = "AicraftType";
    this.GateFL = "Gate";
    this.planeIdFL = "planeId";
    this.flightIdFL = "flightId";
    this.SLDTFL = "SLDT";
    this.ELDTFL = "ELDT";
    this.RefTimestampFL = "RefTimestamp";
    this.EIBTFL = "EIBT";
    this.SOBTFL = "SOBT";
    this.EOBTFL = "EOBT";
    this.TOBTFL = "TOBT";
}   
    public void GHdb(){
	    System.out.println("Flight Id : " + flightIdFL + "\n\nPlane Id : " + planeIdFL "\n\nArrival : " + arrivalFL + "\n\nGate : " + GateFL + "\n\nSLDT : " + SLDTFL + 
        "\n\nELDT : " + ELDTFL + "\n\nRefTimestamp : " + RefTimestampFL + "\n\nEIBT : " + EIBTFL +  "\n\nSOBT : " + SOBTFL + "\n\nEOBT : " + EOBTFL + "\n\nTOBT : " + TOBTFL +  
        "\n\nTOBT : " + TOBTFL);
    }

}
