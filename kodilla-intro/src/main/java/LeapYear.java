public class LeapYear {

    public static void main(String[] args) {

        int thisYear = 2020;
        boolean leapYear = false;

        if(thisYear % 4 == 0)
        {
            if(thisYear % 100 == 0)
            {
                if (thisYear % 400 == 0)
                    leapYear = true;
                else
                    leapYear = false;
            }
            else
                leapYear = true;
        }
        else
            leapYear = false;

        if(leapYear)
            System.out.println(thisYear + " is a leap year!");
        else
            System.out.println(thisYear + " is not a leap year.");
    }
}