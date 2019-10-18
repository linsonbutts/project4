package edu.cau.cps.cis301.linsonbutts;


import edu.pdx.cs410J.ParserException;
import org.w3c.dom.Text;
import edu.pdx.cs410J.AppointmentBookDumper;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * The main class for the CS410J appointment book Project
 */
public class Project4 {

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


  protected static Appointment parseArgs(String[] args) throws ParserException, IOException {
    boolean isPrintSet=false;


    String owner = null;
    String description=null;
    String startDate=null;
    String startTime=null;
    String endDate=null;
    String endTime=null;
    Appointment appointment = null;
    TextDumper dumper = new TextDumper();
    TextParser parser = new TextParser();
    PrettyPrint pretty = new PrettyPrint();
    AppointmentBook book = new AppointmentBook(null,null);


//Lines 42-54 check the value of the arguments from the user if null then the usage will be printed.
    for (int i=0;i< args.length;i++){
      if(args[i].equals("-README")){
        usage();
      }else if(args[i].equals("-print")){
        isPrintSet = true;
        if(i!=0){
          usage();
        }
        else if(args[i].equals("-textFile")){
          dumper.dump(book);
          if(args[i+1].equals("file")){
            parser.parse();
          }
        }
      }


    }


    return appointment;
  }
  //Main method parses Appointment and AppoinmentBook classes.
  public static void main(String[] args) throws IOException, ParserException {
    Appointment appointment=null;
    ArrayList<Appointment> appointments = null;
    AppointmentBook book = null;
    boolean isTextFileSet=false;
    boolean isFileSet=false;
    boolean isPretty=false;
//If statements set the values for the appointments and display them at the end.
    if(args==null || args.length==0){
      usage();
    }

    else if(args[1]!= null && !(args[1].equals("-textFile"))){
      book.setOwner(args[1]);
      if(args[1].equals("-textFile")){
        isTextFileSet=true;
        book.setOwner(args[2]);
      }

      else if(args[1]!= null && !(args[1].equals("-Pretty"))){
          book.setOwner(args[1]);
          if(args[1].equals("-Pretty")){
              isPretty=true;
              book.setOwner(args[2]);
          }

      if(args[2].equals("-file")){
        isFileSet=true;
        book.setOwner(args[3]);
      }
    }
    //Introduced isTextFileSet and isFileSet booleans to make sure every possible condition is accepted.
    else if(args[2]!= null && isTextFileSet == true || isPretty == true && isFileSet ==true){
      appointment.setDescript(args[4]);
      if(isTextFileSet == true || isPretty == true && isFileSet == false){
        appointment.setDescript(args[3]);
        if(isTextFileSet == false || isPretty == false && isFileSet == false){
          appointment.setDescript(args[2]);
        }
      }
    }
    else if(args[3]!= null){
      if(isTextFileSet == true || isPretty == true && isFileSet ==true){
        appointment.setBeginTime(args[5]);
        if(isTextFileSet == true || isPretty == true && isFileSet == false){
          appointment.setBeginTime(args[4]);
          if(isTextFileSet == false || isPretty == false && isFileSet == false){
            appointment.setBeginTime(args[3]);
    }
    else if(args[4]!= null){
            if(isTextFileSet == true || isPretty == true && isFileSet ==true){
              appointment.setEndTime(args[6]);
              if(isTextFileSet == true || isPretty == true && isFileSet == false){
                appointment.setEndTime(args[5]);
                if(isTextFileSet == false || isPretty == true && isFileSet == false){
                  appointment.setEndTime(args[4]);
    }
    else if(args[5]!= null){
                  if(isTextFileSet == true && isFileSet ==true){
                    appointment.setBeginTime(args[7]);
                    if(isTextFileSet == true && isFileSet == false){
                      appointment.setBeginTime(args[6]);
                      if(isTextFileSet == false && isFileSet == false){
                        appointment.setBeginTime(args[5]);
    }
    else if(args[5]!= null){

                            } else if (args.length == 7 || args.length == 6 || args.length == 5) {
                              out.println(book.getOwnerName() + " Appointments are the following " + book.getAppointments());
                            } else if (args.length != 8 || args.length != 7 || args.length != 6) {
                              out.println("Missing arguments or passed too many arguments check README");
                            }


                            appointment = parseArgs(args);


                            System.exit(1);
                          }

                        }}}}}}}}}}}}}}