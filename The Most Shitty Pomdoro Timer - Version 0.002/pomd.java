
import java.util.*;
public class pomd
{
    Scanner scanner = new Scanner(System.in);

    int amountOfTask;
    Timer timer = new Timer();
    clock clock1 = new clock();
    
    ArrayList<String> clock = new ArrayList<String>();
    public pomd()
    {
     start();
      on();
     prompt();
     
     
     
     
     
     
     
    }

    public void prompt()
    {
       
     Scanner scanner = new Scanner(System.in);
     System.out.println( " To See amount of time you have spent on a task type show" +  "  \n To set a new pomodoro Timer type new" );
     menu();
     
    }
    public void menu()
    {
        int x = 0;
     if (scanner.hasNext("show"))
     {
       clock1.seeTaskTimer(); 
       prompt();
       
     }
     else if (scanner.hasNext("new"))
     {
         start();
       
        
         
     }
     else {
       System.out.println("Sorry, didn't understand what you typed. Please try again");
       x = 1;
       prompt();
       
       
    }


    }

    public void on()
    {
      
      timer.schedule(clock1, 0, 1000);
      

        
    }
    
    public void start()
    {
        clock1.ben();
    }
    
    public void cancel()
    {
        timer.cancel();
        timer.purge();
    }
    
    public void display()
    {
        clock1.displayPom();
    }
    
    
}


