public class TimePrinter{
    public static void main(String[] args) {
        int s = 4500;
        int sec = s/60;
        int m = (s - sec) / 60;
        int min = m/60;
        int h = (m - min) / 60;
        int hrs = h%24;
        int d = hrs%24;
        int day = d%7;
        int w = day%7;
        System.out.println(m + "minutes" + s + "seconds");
        System.out.println(h + "hours" + m + "minutes" + s + "seconds");
        System.out.println(d + "days" + h + "hours" + m + "minutes" + s + "seconds");
        System.out.println(w + "weeks" + d + "days" + h + "hours" + m + "minutes" + s + "seconds" );
    }

    }

