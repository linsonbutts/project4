package edu.cau.cps.cis301.linsonbutts;
import edu.pdx.cs410J.AbstractAppointmentBook;
import edu.pdx.cs410J.ParserException;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class PrettyPrint implements edu.pdx.cs410J.AppointmentBookDumper {
    public File contents;
    private ArrayList<Appointment> appointments;
    private Appointment appointment;

    @Override
    public void dump(AbstractAppointmentBook abstractAppointmentBook) throws IOException {
        try {
            FileWriter FW = new FileWriter(contents);
            PrintWriter PW = new PrintWriter(FW);
            String fileS = contents.toString();
            StringTokenizer breaker = new StringTokenizer(fileS, "+");
            while (this.appointments.listIterator().hasNext()) {
                // Set Description,BeginTime, and EndTime is called to make sure the dates are correctly parsed into a date format.
                appointment.setDescript(breaker.nextToken());
                appointment.setBeginTime(breaker.nextToken());
                appointment.setEndTime(breaker.nextToken());
                PW.println(appointment.getDescription());
                PW.print(appointment.getBeginTimeString());
                PW.print(appointment.getEndTimeString());
            }
        } catch (ParserException e) {
            System.err.println("Parser error!");
        }
    }
}