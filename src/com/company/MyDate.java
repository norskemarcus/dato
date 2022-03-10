package com.company;

public class MyDate {

  private int day, month, year;
  int january = 1;
  int february = 2;
  int march = 3;
  int april = 4;
  int may = 5;
  int june = 6;
  int july = 7;
  int august = 8;
  int september = 9;
  int october = 10;
  int november = 11;
  int december = 12;


  public MyDate(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }


  public void setToNextDay() {
    day += 1;
    switchYear();
    switchMonth();
  }


  public boolean isLeapYear() {
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
      return true;
    } else {
      return false;

    }
  }


  public void restartDateCount() {

    // 31 dage
    if ((month == january || month == march || month == may || month == july || month == august
        || month == october || month == december) && day > 31) {
      day = 1;

      // 30 dage
    } else if ((month == april || month == june || month == september || month == november) && day > 30) {
      day = 1;

      // ikke skudår = februar har 28 dage
    } else if (!isLeapYear() && (month == february) && (day > 28)) {
      day = 1;

      // skudår = februar har 29 dage
    } else if (isLeapYear() && (month == february) && (day > 29)) {
      day = 1;
    }
  }


  public String toString() {
    return "Dato: " + day + '/' + month + '/' + year;
  }

  public void switchMonth() {

    // 31 dage
    if ((month == january || month == march || month == may || month == july || month == august
        || month == october) && day > 31) {
      restartDateCount();
      month += 1;

      // årsskifte
    } else if (month == december && day == 31) {

      // 30 dage
    } else if ((month == april || month == june || month == september || month == november) && day > 30) {
      restartDateCount();
      month += 1;

      // ikke skudår = februar har 28 dage
    } else if (!isLeapYear() && (month == february) && (day > 28)) {
      restartDateCount();
      month += 1;
    }
    // skudår = feb 29 dage
    else if (isLeapYear() && (month == february) && (day > 29)) {
      restartDateCount();
      month += 1;
    }
  }

  public void switchYear() {
    if (day > 31 && month == december) {
      year += 1;
      day = 1;
      month = 1;
    }
  }
}


