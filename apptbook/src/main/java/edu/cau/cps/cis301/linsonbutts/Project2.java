package edu.cau.cps.cis301.linsonbutts;

/**
 * The main class for the CS410J appointment book Project
 */
public class Project2 {

  public static void main(String[] args) {
    Appointment appointment = new Appointment();  // Refer to one of Dave's classes so that we can be sure it is on the classpath
    System.err.println("Missing command line arguments");
    for (String arg : args) {
      System.out.println(arg);
    }
    System.exit(1);
  }

}