package edu.cau.cps.cis301.linsonbutts;

import edu.cau.cps.cis301.linsonbutts.Appointment;
import edu.pdx.cs410J.AbstractAppointment;
import edu.pdx.cs410J.AbstractAppointmentBook;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;


public class AppointmentBook extends AbstractAppointmentBook {
    private String owner;
    private ArrayList<Appointment> appointments;

    public AppointmentBook(String owner, ArrayList<Appointment>appointments){
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
        Appointment appointment = null;

        System.out.println("Enter description");
        appointment.setDescript(kb.nextLine());

        System.out.println("Enter begin time");
        appointment.setBeginTime(kb.nextLine());

        System.out.println("Enter begin date");
        appointment.setBeginDate(kb.nextLine());

        System.out.println("Enter end time");
        appointment.setEndTime(kb.nextLine());

        System.out.println("Enter end date");
        appointment.setEndDate(kb.nextLine());

        appointments.add(appointment);
    }
}
