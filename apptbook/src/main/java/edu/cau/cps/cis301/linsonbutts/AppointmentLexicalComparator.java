package edu.cau.cps.cis301.linsonbutts;

import java.util.Comparator;

public class AppointmentLexicalComparator implements Comparator<Appointment> {
    @Override
    public int compare(Appointment o1, Appointment o2) {

        return o1.getDescription().compareTo(o2.getDescription());
        }
    }