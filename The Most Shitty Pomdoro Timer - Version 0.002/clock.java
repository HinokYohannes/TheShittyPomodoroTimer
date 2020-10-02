import java.time.*;
import java.util.*;
import java.lang.Math;
public class clock extends TimerTask
{
    int y;
    int x;
    int amountOfTask;
    
    String currentTask;
    Task newTask = new Task();

    public void run()
    {
        
        y = y-1;
        if (y < 0)
        {
            y = 59;
            x -= 1;
        }
        else if(x <= 0)
        {
            System.out.println( "The Time is: " + x + " Minutes and " + y + " seconds"  + " Type exit to stop the timer" );
            cancel();
        }
         
         System.out.println( "The Time is: " + x + " Minutes and " + y + " seconds "  + "Type exit to stop the timer" );
      
     

    }
   
    public void ben()
    {
                 Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount of minutes you want ");
        x = scanner.nextInt();

        System.out.println("Enter the amount of seconds you want ");
        y = scanner.nextInt();

        System.out.println("Do you want to set a task for the current pomodoro timer?: y/n ");
        if (scanner.hasNext("y"))
        {
            newTask.pickTasks();
        }
       

        
    }
    
      public void seeTaskTimer()
    {
        newTask.seeTaskTimer();
    
    }
     public String getCurrentTask()
    {
        return newTask.getCurrentTask();
    }
    
    public void displayPom()
    {
        
        
   
    
    

    }
   

    
}
