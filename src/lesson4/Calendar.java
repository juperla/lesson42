package lesson4;

import java.util.Calendar;

class Get_Current_Year {
    public static void main(String args[]) {
        Calendar cal = Calendar.getInstance();
        System.out.println("The Current Year is:" + cal.get(Calendar.YEAR));
    }
}