package edu.cau.cps.cis301.linsonbutts;

import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;

import edu.cau.cps.cis301.linsonbutts.Appointment;
import edu.cau.cps.cis301.linsonbutts.AppointmentBook;
import edu.pdx.cs410J.AbstractAppointment;
import edu.pdx.cs410J.AbstractAppointmentBook;
/**
 * The main class for the CS410J appointment book Project
 */
public class Project2 {
// Lines 16-29 provide user with instruction on how to use project and provide PrintWriter class to project.
  private static PrintWriter out = new PrintWriter(System.out,true);
  protected static void usage(){
    out.println("\nusage: java edu.cau.cps.cis301.linsonbutts.Project2 [options] <args>");
    out.println("   args are (in this order):");
    out.println("\towner\t\t\tThe person whose owns the appt book");
    out.println("\tdescription\t\tA description of the appointment");
    out.println("\tbeginTime\t\tWhen the appt begins (24-hour time)       ");
    out.println("\tendTime\t\t\tWhen the appt ends (24-hour time)");
    out.println("options are (options may appear in any order): ");
    out.println("\t-print\t\t\tPrints a description of the new appointment        ");
    out.println("\t-README\t\t\tPrints a README for this project and exits Date and       ");
    out.println("\t\t\t\t\ttime should be in the format: mm/dd/yyyy hh:mm");
    System.exit(1);
  }

  protected static Appointment parseArgs(String[] args){
    boolean isPrintSet=false;


    String owner = null;
    String description=null;
    String startDate=null;
    String startTime=null;
    String endDate=null;
    String endTime=null;
    Appointment appointment = null;
//Lines 42-54 check the value of the arguments from the user if null then the usage will be printed.
    for (int i=0;i< args.length;i++){
      if(args[i].equals("-README")){
        usage();
      }else if(args[i].equals("-print")){
        isPrintSet = true;
        if(i!=0){
          usage();
        }
      }


    }


    return appointment;
  }
  //Main method parses Appointment and AppoinmentBook classes.
  public static void main(String[] args) {
    Appointment appointment=null;
    ArrayList<Appointment> appointments = null;
    AppointmentBook book = null;
//If statements set the values for the appointments and display them at the end.
    if(args==null || args.length==0){
      usage();
    }
    else if(args[0]!=null && args[0]!= "addentry"){
      book = new AppointmentBook(args[0],appointments);
    }
    else if(args[0]!= null && args[0] == "addentry")
    {
      Appointment newentry = null;
      out.println("Add an appointment to your appointment book");
      book.addAppointment(newentry);
    }
    else if(args[1]!= null){
      appointment.setDescript(args[1]);
    }
    else if(args[2]!= null){
      appointment.setBeginDate(args[2]);
    }
    else if(args[3]!= null){
      appointment.setBeginTime(args[3]);
    }
    else if(args[4]!= null){
      appointment.setEndDate(args[4]);
    }
    else if(args[1]!= null){
      appointment.setEndTime(args[5]);
    }
    else if(args.length == 5){
      out.println(book.getOwnerName()+"Appointments are the following"+book.getAppointments());
    }
    else if(args.length != 5){
      out.println("Missing arguments or passed too many arguments check README");
    }


    appointment = parseArgs(args);



    System.exit(1);
  }

}