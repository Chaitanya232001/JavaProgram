package loop;

public class LeapYear {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int year = 2022;
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            System.out.println(year + " is a Leap year");
        else
            System.out.println(year + " is not a Leap year");
    }

}

