package edu.cau.cps.cis301.linsonbutts;

import edu.pdx.cs410J.AbstractAppointment;
public class Appointment extends AbstractAppointment {
  private String descript;
  private String beginTime;
  private String beginDate;
  private String endTime;
  private String endDate;
  public Appointment(String descript){
    this.descript = descript;
    this.beginDate = beginDate;
    this.beginTime = beginTime;
    this.endTime = endTime;
    this.endDate = endDate;
  }
    public void setDescript(String descript){
    this.descript = descript;
    }
  public void setBeginTime(String beginTime){
    this.beginTime = beginTime;
  }

  public void setBeginDate(String beginDate){
    this.beginDate = beginDate;
  }
  public void setEndTime(String endTime){
    this.endTime = endTime;
  }

  public void setEndDate(String endDate){
    this.endDate = endDate;
  }

  @Override
  public String getBeginTimeString() {
    return beginTime;
  }

  @Override
  public String getEndTimeString() {
    return endTime;
  }

  @Override
  public String getDescription() {
    return descript;
  }

  public String getEndDate() {
    return endDate;
  }

  public String getBeginDate() {
    return beginDate;
  }
}
