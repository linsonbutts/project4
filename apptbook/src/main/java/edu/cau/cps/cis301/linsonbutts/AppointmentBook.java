package edu.cau.cps.cis301.linsonbutts;

import edu.pdx.cs410J.AbstractAppointment;
import edu.pdx.cs410J.AbstractAppointmentBook;

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
        return owner;
    }

    @Override
    public Collection getAppointments() {
        return appointments;
    }

    @Override
    public void addAppointment(AbstractAppointment abstractAppointment) {
        this.appointments.add(appt);
    }
}
