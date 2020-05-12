import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;  


public class CurrentDateTimeExample1  extends Thread{  

  DateTimeFormatter dtf;
  LocalDateTime now;

  public CurrentDateTimeExample1()//constructor
  {
	 dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
         //now = LocalDateTime.now();
  }
  public void run()
  {
    try{
       while(true){  // infinite loop
       Thread.sleep(1000);
       System.out.print((char)13);
       //ex.disp();
       now = LocalDateTime.now();
       System.out.print((char)13);
       System.out.println(dtf.format(now));
       System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
       }

      }
   catch(Exception e){
      System.out.println("Error occured"+e);
      }
   
   
  }


  public static void main(String[] args) {  
   CurrentDateTimeExample1 ex=new CurrentDateTimeExample1();
   ex.start();
  
  }  
}  

