import java.time.*;
import java.util.*;
import java.lang.Math;
public class Task 
    {
            ArrayList<String> tasks = new ArrayList<String>();
    Timer timer = new Timer();
     String currentTask;
     TaskTimer timer1 = new TaskTimer();
        
     public void  printTaskTimer()
        {
        System.out.println("The total time spend for the current task: " + currentTask + timer1.toString());
        }
        
         public void showAllTasks()
    {
        for(int i = 0; i < tasks.size(); i++)
        {
            System.out.println(tasks.get(i));
        }
    }
        public void pickTasks()
    {
        Scanner scanner2 = new Scanner(System.in);
        for(int i = 0; i < tasks.size(); i++)
        {
            System.out.println(tasks.get(i));
        }
        
        System.out.println("Pick from the below tasks, or enter a new one: ");
        String newTask = scanner2.next();
        
        if (tasks.contains(newTask))
        {
            currentTask = newTask;
            timer.schedule(timer1, 0, 1000);
        }
        else
        {
         currentTask = newTask;
         tasks.add(newTask);
         timer.schedule(timer1, 0, 1000);

        }

    }
   

   public void seeTaskTimer()
    {
        Scanner scanner = new Scanner(System.in);
    System.out.println( "Please Enter the task name" );
    String seeTaskTime = scanner.next(); 

    if (tasks.contains(seeTaskTime))
    {
        
       System.out.println("The task was found");
       int indexCurrentTask= tasks.indexOf(seeTaskTime);
       currentTask = tasks.get(indexCurrentTask);
       currentTask.toString();
    }
    else
    {
    System.out.println("The task wasn't found, please enter a task that exists");

    }
    seeTaskTime = currentTask;
    printTaskTimer();
    
    }
     public String getCurrentTask()
    {
        return currentTask;
    }
    
  
    
     /*   
        public void setTime()
    {
        int newTime;
        int currentIndex = indexOf(getCurrentTask());
        tasks.set(currentIndex,n);
        for (int 
        y = y-1;
        
        
        if (x < 0)
        {
            y = 59;
            x -= 1;
        }
        System.out.println( "The Time is: " + x + " Minutes and " + y + " seconds" );
        if(x <= 0)
        {
            System.out.println( "The Time is: " + x + " Minutes and " + y + " seconds" );
            cancel();
        }
    }
    */
    
   /*public int getTime()
    {
        int currentIndex = indexOf(getCurrentTask());
        return 
    }
    */
    public int getCurrentIndex()
    {
        int currentIndex = tasks.indexOf(getCurrentTask());
        System.out.println(currentIndex);
        return currentIndex;
    }
    
   
    }
