package edu.cau.cps.cis301.linsonbutts;

import edu.pdx.cs410J.AbstractAppointmentBook;
import edu.pdx.cs410J.AbstractAppointment;

import java.io.*;
import java.util.ArrayList;

public class TextDumper implements edu.pdx.cs410J.AppointmentBookDumper {
    public File contents;
    private ArrayList<Appointment> appointments;
    @Override
    public void dump(AbstractAppointmentBook abstractAppointmentBook) throws IOException {
            FileWriter FW = new FileWriter(contents);
            PrintWriter PW = new PrintWriter(FW);
            while (this.appointments.listIterator().hasNext()) {
                PW.println(this.appointments.toString());
            }
        }
    }