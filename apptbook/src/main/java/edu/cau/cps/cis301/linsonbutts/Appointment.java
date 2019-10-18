package edu.cau.cps.cis301.linsonbutts;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import edu.pdx.cs410J.AbstractAppointment;
import edu.pdx.cs410J.ParserException;

import javax.swing.text.html.parser.Parser;

public class Appointment implements Comparable {

  private String descript;
  private String beginTime;
  private String endTime;
  StringBuilder sb = new StringBuilder();
  DateFormat df = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);



  public Appointment(String descript, String beginTime, String endTime){
    this.descript = descript;
    this.beginTime = beginTime;
    this.endTime = endTime;

  }
    private static Object parseDate(String dateValue)throws ParserException{
        List<String> patterns = Arrays.asList("m/d/yyyy h:mm", "mm/dd/yyyy h:mm", "mm/d/yyyy h:mm", "m/dd/yyyy h:m");
        SimpleDateFormat simpleDateFormat;
        Date date =null;
        for (String pattern:patterns){
            try{
                simpleDateFormat = new SimpleDateFormat(pattern);
                date = simpleDateFormat.parse(dateValue);
            }catch (Exception ex){}
        }
        return date;}
    public void setDescript(String descript){
    this.descript = descript+sb.append("+");
    }

  public void setBeginTime(String beginTime) throws ParserException {
      this.beginTime = (String) parseDate(beginTime)+sb.append("+");
  }

  public void setEndTime(String endTime) throws ParserException {
        this.endTime = (String) parseDate(endTime)+sb.append("+");
  }


  public String getBeginTimeString() {
    return df.format(beginTime);
  }


  public String getEndTimeString() {
    return df.format(endTime);
  }


  public String getDescription() {
    return descript;
  }

  public Date getEndTime() throws ParserException {
    return (Date) parseDate(endTime);
  }

  public Date getBeginTime() throws ParserException {
     return (Date) parseDate(beginTime);
  }

  //Chronological order
  @Override
  public int compareTo(Object o) {
    Appointment appointment = (Appointment) o;
      try {
          if(this.getBeginTime().before(appointment.getBeginTime())){
              return -1;
          }
          else if(this.getBeginTime().after(appointment.getBeginTime())){
              return 1;
          }
          else{
              if (this.getEndTime().before(appointment.getEndTime())){
                  return -1;}
                          else if(this.getEndTime().after(appointment.getEndTime())){
                              return 1;
                  }
          }
      } catch (ParserException e) {
          e.printStackTrace();
      }
      //If all other conditions were equal then compare each lexicographically
      AppointmentLexicalComparator ALP = new AppointmentLexicalComparator();
  return  ALP.compare(this,appointment);}
}