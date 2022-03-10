package com.company;

//TODO: check leapyear egen metode, lave array til måneder?

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


  // skal den være void? Tine mumlet noget..
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


  public boolean isLeapYear(){
    if((year % 4 == 0 && year % 100!= 0) || year % 400 == 0){
      return true;
    }
    else {
      return false;

    }
  }


  public void restartDateCount() {

    if ((month == january || month == march || month == may || month == july || month == august   // Måneder med 31 dage
        || month == october || month == december) && day > 31) {
      day = 1;

    } else if ((month == april || month == june || month == september || month == november) && day > 30) { // Måneder med 30 dage
        day = 1;

    }  else if (!isLeapYear() && (month == february) && (day > 28)){// februar har 28 dage hvis ikke skudår
      day = 1;

    } else if (isLeapYear() && (month == february) && (day > 29)){
      // februar har 29 dage hvis skudår
      day = 1;
    }
  }



  public String toString() {
    return "Dato: " + day + '/' + month + '/' + year;
  }

  public void switchMonth() {

      if ((month == january || month == march || month == may || month == july || month == august
          || month == october) && day > 31) {  // Måneder med 31 dage
        restartDateCount();
        month += 1;

      } else if (month == december && day == 31) { // årsskifte


      } else if ((month == april || month == june || month == september || month == november) && day > 30) { //  måneder med 30 dage
        restartDateCount();
        month += 1;

      } else if (isLeapYear() && (month == february) && (day > 29)){// feb 29 dage hvis skudår
        restartDateCount();
        month += 1;
          //TODO: Problemet er at  datoen går fra 29/2 2024 til 1/2 2024 og ikke 1/3!

      } else if (!isLeapYear() && (month == february) && (day > 28)){// februar har 28 dage (hvis ikke skudår)
        restartDateCount();
        month += 1;
        //TODO: Problemet er at datoen går fra 28/2 2023 til 29/2 og ikke 1/3.
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


