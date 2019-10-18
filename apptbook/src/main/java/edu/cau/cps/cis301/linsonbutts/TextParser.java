package edu.cau.cps.cis301.linsonbutts;
import edu.pdx.cs410J.AbstractAppointmentBook;
import edu.pdx.cs410J.ParserException;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;
import edu.pdx.cs410J.AbstractAppointment;
import edu.cau.cps.cis301.linsonbutts.Appointment;

public class TextParser implements edu.pdx.cs410J.AppointmentBookParser {
    File contents;

    @Override
    public AbstractAppointmentBook parse() throws ParserException  {
        StringTokenizer breaker = new StringTokenizer(contents.toString(),"+");
        ArrayList<Appointment> appts = new ArrayList<Appointment>();
        AppointmentBook book  = new AppointmentBook(null, appts);
        try{
        FileReader fr = new FileReader(contents);
        BufferedReader br = new BufferedReader(fr);
            book.setOwner(breaker.nextToken());
        while(!(br.readLine()).equals(null)){
            Appointment appointment = null;
            appointment.setDescript(breaker.nextToken());
            appointment.setBeginTime(breaker.nextToken());
            appointment.setEndTime(breaker.nextToken());
            appts.add(appointment);
        }
    }catch (IOException e){ System.err.println("Error has occurred.");}
    return book;    }

}
