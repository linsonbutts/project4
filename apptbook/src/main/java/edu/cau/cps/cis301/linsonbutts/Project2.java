package edu.cau.cps.cis301.linsonbutts;
import java.util.*;
import edu.cau.cps.cis301.linsonbutts.Appointment;
import edu.cau.cps.cis301.linsonbutts.AppointmentBook;
import edu.pdx.cs410J.AbstractAppointment;
import edu.pdx.cs410J.AbstractAppointmentBook;
/**
 * The main class for the CS410J appointment book Project
 */
public class Project2 {
  public static Scanner kb = new Scanner(System.in);
  public static void main(String[] args) {

    System.out.println("Enter a description for you appointment");
    String appt = kb.nextLine();
    System.out.println("Enter your name please");
    String name = kb.nextLine();

    System.err.println("Missing command line arguments");

    ArrayList<Appointment> book = new ArrayList<>();
    Appointment appointment = new Appointment(appt);
    AppointmentBook namebook = new AppointmentBook(name,book);


    System.exit(1);

    System.out.println("Enter a choice for your appointment book.\n" +
            " 1.Get the owner of the appointment book \n" +
            "2.To list the appointments within the book\n" +
            "3.Add another appointment to the book\n" +
            "4.Provides the description of the most recent appointment.\n" +
            "5.Exit the program.");

    int choice = kb.nextInt();
    while (choice != 5) {
      switch (choice) {
        case 1:
          namebook.getOwnerName();
          menu(choice);
          break;
        case 2:
          namebook.getAppointments();
          menu(choice);
          break;
        case 3:
          namebook.addAppointment(appointment);
          menu(choice);
          break;
        case 4:
          appointment.getDescription();
          menu(choice);
          break;
        default:
          System.out.println("Error please enter  1-5.");
          menu(choice);
      }
    }

  }
  public static int menu(int choice){
    System.out.println("Enter a choice for your appointment book.\n" +
            " 1.Get the owner of the appointment book \n" +
            "2.To list the appointments within the book\n" +
            "3.Add another appointment to the book\n" +
            "4.Provides the description of the most recent appointment.\n" +
            "5.Exit the program.");
    int c = kb.nextInt();
    return c;
  }
}