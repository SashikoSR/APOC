package airportx;

//import java.util.ArrayList;
//import java.util.Date;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.*;
//import java.text.*;

public class Flight{

    Object Flight;

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
      
        public Flight() {
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
    

}