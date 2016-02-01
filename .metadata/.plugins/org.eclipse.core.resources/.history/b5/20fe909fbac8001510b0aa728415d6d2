package com.ktds.jmj;

import java.util.Calendar;
import java.util.Date;

public class DateTime {

   public void start() {

      // 현재시간 가져오기
      printCurrentMillisecond();
      // 현재 날짜와 시간을 출력하기
      printCurrentDateTime();
      // 현재 날짜와 시간을 출력한다.
      printCurrentDateTimeByCalendar();

      printDateTimeByCalendar();
      // 시간차 구하기
      printDateMinusDate();
      
      printTwoDaysAfter();
      

   }

   private void printCurrentMillisecond() { // 시간차 구할때 무조건 써야한다.
      long currentSecond = System.currentTimeMillis(); // 시간을 long으로 갖고온다.
      System.out.println(currentSecond);

   }

   private void printCurrentDateTime() {
      Date date = new Date();
      System.out.println(date.toGMTString());
      System.out.println(date.toLocaleString());

   }

   private void printCurrentDateTimeByCalendar() {

      Calendar now = Calendar.getInstance();
      System.out.println(toString());

      System.out.println(now.get(Calendar.YEAR));
      System.out.println(now.get(Calendar.MONTH) + 1);
      System.out.println(now.get(Calendar.DAY_OF_MONTH));
      System.out.println(now.get(Calendar.AM_PM));
      System.out.println(now.get(Calendar.HOUR));
      System.out.println(now.get(Calendar.HOUR_OF_DAY));
      System.out.println(now.get(Calendar.MINUTE));
      System.out.println(now.get(Calendar.SECOND));
      System.out.println(now.get(Calendar.MILLISECOND));
      System.out.println(now.get(Calendar.DAY_OF_WEEK));
      System.out.println(now.getActualMaximum(Calendar.DAY_OF_MONTH));

   }

   private void printDateTimeByCalendar() {
      Calendar cal = Calendar.getInstance();
      cal.set(2016, (2 - 1), 14, 10, 59, 45);

      System.out.println(cal.get(Calendar.YEAR));
      System.out.println(cal.get(Calendar.MONTH) + 1);
      System.out.println(cal.get(Calendar.DAY_OF_MONTH));
      System.out.println(cal.get(Calendar.AM_PM));
      System.out.println(cal.get(Calendar.HOUR));
      System.out.println(cal.get(Calendar.HOUR_OF_DAY));
      System.out.println(cal.get(Calendar.MINUTE));
      System.out.println(cal.get(Calendar.SECOND));
      System.out.println(cal.get(Calendar.MILLISECOND));
      System.out.println(cal.get(Calendar.DAY_OF_WEEK));
      System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
   }
//날짜 빼기
   private void printDateMinusDate() {

      Calendar now = Calendar.getInstance();

      Calendar cal = Calendar.getInstance();
      cal.set(2016 , (2-1), 14, 10, 59, 45);

      long dateTime1 = now.getTimeInMillis();
      long dateTime2 = cal.getTimeInMillis();

      System.out.println(dateTime1);
      System.out.println(dateTime2);
      
      long result = (dateTime2 - dateTime1) / 1000;
      System.out.println("이거 "+result);
      
      //일자
      int date = (int)Math.round((double)result / 60 / 60 / 24);
      System.out.println("일자 :" + date);
      
      //시간
      int hour = (int)Math.round((double)result / 60 / 60);
      System.out.println("시간 :" + hour);
      
      //분
      int minute = (int)Math.round((double)result / 60 );
      System.out.println("분 :" + minute);
      
      System.out.println( minute % 60);
   }

//더하기 
   private void printTwoDaysAfter() {
      Calendar cal = Calendar.getInstance();
      cal.add(Calendar.DAY_OF_MONTH, 2);   //2일 더한다.
      cal.add(Calendar.MONTH, -1);      //한달전
      
      
   }
   
   public static void main(String[] args) {
      DateTime dateTime = new DateTime();
      dateTime.start();

   }

}