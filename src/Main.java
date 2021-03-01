import kg.megacom.enums.WeekDays;
import kg.megacom.presidents.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        today = today.minusYears(15).minusMonths(5);
        //LocalDate provides date output in the format of YYYY-MM-dd
        LocalDate localDate = LocalDate.of(2010, 3, 5);
        //LocalTime provides date output in the format hour-minute-second-nano second
        LocalTime localTime = LocalTime.of(15, 15, 15, 15);
        LocalDateTime time = LocalDateTime.of(localDate, localTime);
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        zonedDateTime = zonedDateTime.minusYears(10).minusMonths(2);
        ZonedDateTime zonedDateTime2 = ZonedDateTime.now();
        zonedDateTime2 = zonedDateTime.minusYears(8).minusMonths(2);
        List<String> presidents = new ArrayList<>();
        presidents.add("President of Russia Vladimir Putin " + today);
        presidents.add("President of Kazakhstan Kassym-Jomart Tokayev " + zonedDateTime);
        presidents.add("President of Kazakhstan Nursultan Nazarbayev " + zonedDateTime2);
        presidents.add("President of Uzbekistan Islam Abdughanievich Karimov " + time);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number from 1 to 6 ");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                President askarAkayev = new President("Askar Akayev", LocalDateTime.now(),  WeekDays.MONDAY);
                System.out.println(askarAkayev);
                LocalDateTime localDateTime = LocalDateTime.of(1944, 11, 10, 20, 22, 22);
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM-dd-YYYY hh:mm:ss");
                System.out.println("Birth day of Askar Akayev " + dateTimeFormatter.format(localDateTime));
                System.out.println();
                askarAkayev.getWorkDays();
                askarAkayev.getWeekDays();
                System.out.println("Distance he flew during his presidency " + askarAkayev.getFlight(995698090, 505596640) + " km.");
                System.out.println();
                System.out.println("First meeting with presidents");
                for (String person : presidents) {
                    System.out.println(person);
                }
                try {
                    //Date is legacy class, which does not support internationalization.
                    Date dateToday = new Date();
                    System.out.println("Today is: " + dateToday);
                    askarAkayev.getInstant();
                    System.out.println();
                    //SimpleDateFormat is a concrete class for formatting and parsing date
                    SimpleDateFormat akayevSimpleDateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
                    String akayevDateInString = "27-10-1991 10:20:56";
                    Date date = akayevSimpleDateFormat.parse(akayevDateInString);
                    System.out.println("Start of presidency: " + date);
                    //Calendar provides internationalization support.
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(2005, 2, 24, 10, 22, 23);
                    System.out.println("End of presidency: " + calendar.getTime());
                } catch (ParseException e) {
                    System.out.println("Parse Exception");
                    e.printStackTrace();
                }
                askarAkayev.workedYears(12,14);
                break;
            case 2:
                President kurmanbekBakiev = new President("Kurmanbek Bakiev", LocalDateTime.now(),  WeekDays.TUESDAY);
                System.out.println(kurmanbekBakiev);
                LocalDateTime bakievlocalDateTime = LocalDateTime.of(1949, 8, 1, 10, 12, 22);
                DateTimeFormatter bakievlocaldateTimeFormatter = DateTimeFormatter.ofPattern("MMMM/dd/YYYY hh:mm:ss");
                System.out.println("Birth day of Kurmanbek Bakiev " + bakievlocaldateTimeFormatter.format(bakievlocalDateTime));
                System.out.println();
                kurmanbekBakiev.getWorkDays();
                kurmanbekBakiev.getWeekDays();
                System.out.println("Distance he flew during his presidency " + kurmanbekBakiev.getFlight(555698090, 505596640) + " km.");
                System.out.println();
                System.out.println("First meeting with presidents");
                for (String person : presidents) {
                    System.out.println(person);
                }
                try {
                    Date dateToday = new Date();
                    System.out.println("Today is: " + dateToday);
                    kurmanbekBakiev.getInstant();
                    System.out.println();
                    SimpleDateFormat kurmanbekBakievSimpleDateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
                    String kurmanbek = "25-03-2005 10:20:56";
                    Date date = kurmanbekBakievSimpleDateFormat.parse(kurmanbek);
                    System.out.println("Start of presidency: " + date);
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(2010, 3, 15, 15, 22, 23);
                    System.out.println("End of presidency: " + calendar.getTime());
                } catch (ParseException e) {
                    System.out.println("Parse Exception");
                    e.printStackTrace();
                }
                kurmanbekBakiev.workedYears(5,12);
                break;
            case 3:
                President sooronbayJeenbekov = new President("Sooronbay Jeenbekov", LocalDateTime.now(),  WeekDays.FRIDAY);
                System.out.println(sooronbayJeenbekov);
                LocalDateTime localDateTimeJeenbekov = LocalDateTime.of(1958, 11, 1, 20, 22, 22);
                DateTimeFormatter dateTimeFormatterJeenbekov = DateTimeFormatter.ofPattern("MMMM-dd-YYYY hh:mm:ss");
                System.out.println("Birth day of Sooronbay Jeenbekov " + dateTimeFormatterJeenbekov.format(localDateTimeJeenbekov));
                System.out.println();
                sooronbayJeenbekov.getWorkDays();
                sooronbayJeenbekov.getWeekDays();
                System.out.println("Distance he flew during his presidency " + sooronbayJeenbekov.getFlight(775698090, 505596640) + " km.");
                System.out.println();
                System.out.println("First meeting with presidents");
                for (String person : presidents) {
                    System.out.println(person);
                }
                try {
                    Date dateToday = new Date();
                    System.out.println("Today is: " + dateToday);
                    sooronbayJeenbekov.getInstant();
                    System.out.println();
                    SimpleDateFormat sooronbaySimpleDateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
                    String sooronbayDateInString = "24-11-2017 10:20:56";
                    Date date = sooronbaySimpleDateFormat.parse(sooronbayDateInString);
                    System.out.println("Start of presidency: " + date);
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(2020, 10, 15, 10, 22, 23);
                    System.out.println("End of presidency: " + calendar.getTime());
                } catch (ParseException e) {
                    System.out.println("Parse Exception");
                    e.printStackTrace();
                }
                sooronbayJeenbekov.workedYears(3,12);
                break;
            case 4:
                President almazbekAtambayev = new President("Almazbek Atambayev", LocalDateTime.now(),  WeekDays.WEDNESDAY);
                System.out.println(almazbekAtambayev);
                LocalDateTime localDateTimeAtambayev = LocalDateTime.of(1956, 9, 17, 20, 22, 22);
                DateTimeFormatter dateTimeFormatterAtambayev = DateTimeFormatter.ofPattern("MMMM-dd-YYYY hh:mm:ss");
                System.out.println("Birth day of Almazbek Atambayev " + dateTimeFormatterAtambayev.format(localDateTimeAtambayev));
                System.out.println();
                almazbekAtambayev.getWorkDays();
                almazbekAtambayev.getWeekDays();
                System.out.println("Distance he flew during his presidency " + almazbekAtambayev.getFlight(885698090, 505596640) + " km.");
                System.out.println();
                System.out.println("First meeting with presidents");
                for (String person : presidents) {
                    System.out.println(person);
                }
                try {
                    Date dateToday = new Date();
                    System.out.println("Today is: " + dateToday);
                    almazbekAtambayev.getInstant();
                    System.out.println();
                    SimpleDateFormat almazbekSimpleDateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
                    String almazbekDateInString = "01-12-2011 10:20:56";
                    Date date = almazbekSimpleDateFormat.parse(almazbekDateInString);
                    System.out.println("Start of presidency: " + date);
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(2017, 11, 24, 10, 22, 23);
                    System.out.println("End of presidency: " + calendar.getTime());
                } catch (ParseException e) {
                    System.out.println("Parse Exception");
                    e.printStackTrace();
                }
                almazbekAtambayev.workedYears(6,12);
                break;
            case 5:
                President rozaOtunbayeva = new President("Roza Otunbayeva", LocalDateTime.now(), WeekDays.THURSDAY);
                System.out.println(rozaOtunbayeva);
                LocalDateTime Otunbayeva= LocalDateTime.of(1950, 8, 23, 10, 12, 22);
                DateTimeFormatter otunbayeva = DateTimeFormatter.ofPattern("MMMM/dd/YYYY hh:mm:ss");
                System.out.println("Birth day of Roza Otunbayeva " + otunbayeva.format(Otunbayeva));
                System.out.println();
                rozaOtunbayeva.getWorkDays();
                rozaOtunbayeva.getWeekDays();
                System.out.println("Distance he flew during his presidency " + rozaOtunbayeva.getFlight(995698090, 505596640) + " km.");
                System.out.println();
                System.out.println("First meeting with presidents");
                for (String person : presidents) {
                    System.out.println(person);
                }
                try {
                    Date dateToday = new Date();
                    System.out.println("Today is: " + dateToday);
                    rozaOtunbayeva.getInstant();
                    System.out.println();
                    SimpleDateFormat rozaOtunbayevaSimpleDateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
                    String roza = "07-04-2010 10:20:56";
                    Date date = rozaOtunbayevaSimpleDateFormat.parse(roza);
                    System.out.println("Start of presidency: " + date);
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(2011, 12, 1, 15, 22, 23);
                    System.out.println("End of presidency: " + calendar.getTime());
                } catch (ParseException e) {
                    System.out.println("Parse Exception");
                    e.printStackTrace();
                }
                rozaOtunbayeva.workedYears(1,12);
                break;
            case 6:
                President sadyrJaparov = new President("Sadyr Japarov", LocalDateTime.now(), WeekDays.THURSDAY);
                System.out.println(sadyrJaparov);
                LocalDateTime birthDayJaparov = LocalDateTime.of(1968, 12, 6, 20, 22, 22);
                DateTimeFormatter birthDayOfJaparov = DateTimeFormatter.ofPattern("MMMM-dd-YYYY hh:mm:ss");
                System.out.println("Birth day of Sadyr Japarov " + birthDayOfJaparov.format(birthDayJaparov));
                System.out.println();
                sadyrJaparov.getWorkDays();
                sadyrJaparov.getWeekDays();
                System.out.println();
                System.out.println("Distance he flew during his presidency " + sadyrJaparov.getFlight(7090, 5055940) + " km.");
                System.out.println();
                System.out.println("First meeting with presidents");
                for (String person : presidents) {
                    System.out.println(person);
                }
                System.out.println();
                try {
                    Date dateToday = new Date();
                    System.out.println("Today is: " + dateToday);
                    sadyrJaparov.getInstant();
                    System.out.println();
                    SimpleDateFormat sadyrSimpleDateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
                    System.out.println();
                    String sadyrDateInString = "28-01-2021 10:20:56";
                    Date date = sadyrSimpleDateFormat.parse(sadyrDateInString);
                    System.out.println("Start of presidency: " + date);
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(2025, 10, 15, 10, 22, 23);
                    System.out.println("End of presidency: " + calendar.getTime());
                } catch (ParseException e) {
                    System.out.println("Parse Exception");
                    e.printStackTrace();
                }

                break;
        }
    }
}

