package edu.cau.cps.cis301.linsonbutts;

import edu.pdx.cs410J.AbstractAppointment;
import edu.pdx.cs410J.AbstractAppointmentBook;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;

public class AppointmentBook extends AbstractAppointmentBook {
    private String owner;
    private ArrayList<String> appointments;

    public AppointmentBook(String owner, ArrayList<String>appointments){
        this.owner = owner;
        this.appointments = appointments;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String getOwnerName() {
        return this.owner;
    }

    @Override
    public Collection getAppointments() {
        System.out.println("The appointments for "+this.owner+"are :"+this.appointments);
        return appointments;
    }

    @Override
    public void addAppointment(AbstractAppointment abstractAppointment) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Provide a description for the appointment you would like to add.");
        String newentry = kb.nextLine();
        this.appointments.add(newentry);
    }
}
