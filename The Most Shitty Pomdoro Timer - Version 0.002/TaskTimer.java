import java.time.*;
import java.util.*;
import java.lang.Math;
public class TaskTimer extends TimerTask
{
     int hours;
        int minutes;
        int seconds;
    Timer timer = new Timer();

    public void run()
        {
          seconds += 1;
            
        }
        
        
        
        public int getSeconds()
        {
            return seconds;
        }
        
        public int getHours()
        {
         return minutes = seconds/3600; 
        }
        
        public int getMinutes()
        {
       return minutes = seconds/60; 
        }
        
        public String toString ()
        {
          return " is: " + getHours() + " hours and " + getMinutes() + " minutes and " + getSeconds() + " seconds " ;
 
        }
        
}
