package edu.cau.cps.cis301.linsonbutts;

import edu.pdx.cs410J.AbstractAppointment;
public class Appointment extends AbstractAppointment {
  private String descript;
  public Appointment(String descript){
    this.descript = descript;
  }
    public void setDescript(String descript){
    this.descript = descript;
    }
  @Override
  public String getBeginTimeString() {
    throw new UnsupportedOperationException("This method is not implemented yet");
  }

  @Override
  public String getEndTimeString() {
    throw new UnsupportedOperationException("This method is not implemented yet");
  }

  @Override
  public String getDescription() {
    return descript;
  }
}
