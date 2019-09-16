package edu.cau.cps.cis301.linsonbutts;
import java.util.*;


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

    ArrayList<String> book = new ArrayList<>();
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
          getOwnerName(namebook);
          menu(choice);
          break;
        case 2:
          getAppointments(namebook);
          menu(choice);
          break;
        case 3:
          addAppointment();
          menu(choice);
          break;
        case 4:
          getDescription();
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