package Projects;
import java.util.*;

public class DigitalClock {
    
    public static void main( String []args ) throws InterruptedException{
        Calendar rightNow;
        int hour, minute, second;
        String time = "";
        while(true){
            rightNow = Calendar.getInstance( );
            hour = rightNow.get( Calendar.HOUR );
            minute = rightNow.get( Calendar.MINUTE );
            second = rightNow.get( Calendar.SECOND );
            time = ( hour >= 10 ? hour : "0" + hour ) + ":";
            time += ( minute >= 10 ? minute : "0" + minute ) + ":";
            time += ( second >= 10 ? second : "0" + second );
            System.out.print( time );
            Thread.sleep( 1000 );
            System.out.print( "\b\b\b\b\b\b\b\b" );
        }
    }
}

