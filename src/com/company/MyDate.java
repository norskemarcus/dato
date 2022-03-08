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

    switchYear();
    day = day += 1;
    switchMonth();
    restartDateCount();
  }


  public void restartDateCount() {
    // Måneder med 31 dage
    if ((month == january || month == march || month == may || month == july || month == august
        || month == october || month == december) && day > 31) {
      day = 1;

    } else if ((month == april || month == june || month == september || month == november) && day > 30) { //  måneder med 30 dage
        day = 1;

    }  else if ((year % 4 == 0 && year % 100!= 0 && month == february && day == 29) || year%400 == 0){
      // februar har 29 dage hvis skudår
      day = 29;

    } else if (year % 100 == 0 && month == february && day == 28){// februar har 28 dage (hvis ikke skudår)
      day += 1;

    } else {
      day =1;
    }
  }


  public String toString() {
    return "Dato: " + day + '/' + month + '/' + year;
  }

  public void switchMonth() {

      if ((month == january || month == march || month == may || month == july || month == august
          || month == october) && day > 31) {  // Måneder med 31 dage
        month += 1;

      } else if (month == december && day > 31) { //
        month = 1;

      } else if ((month == april || month == june || month == september || month == november) && day > 30) { //  måneder med 30 dage
        month += 1;

      } else if ((year % 4 == 0 && year % 100!= 0 && month == february && day == 29) || year%400 == 0){// feb 29 dage hvis skudår
          month = 2;

      } else if (year % 100 == 0 && month == february && day == 28){// februar har 28 dage (hvis ikke skudår)
        month += 1;

      } else{
        month += 1;
      }
  }


  public void switchYear() {
    if (day == 31 && month == december) {
      year += 1;
    }
  }

}





