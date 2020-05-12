
import javax.swing.*;
import java.awt.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime; 

public class dateClock extends Thread
{

 DateTimeFormatter dtf;
  LocalDateTime now;
JFrame frame;
JPanel statusPanel;
JLabel statusLabel;
String str;
public dateClock()//constructor
  {
	 dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
         now = LocalDateTime.now();
         frame = new JFrame();
         frame.setLayout(new BorderLayout());
         frame.setSize(200, 200);
         statusPanel = new JPanel();
         frame.add(statusPanel, BorderLayout.SOUTH);
	 statusPanel.setPreferredSize(new Dimension(frame.getWidth(), 16));
	 statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.X_AXIS));
         str=dtf.format(now);
	 statusLabel = new JLabel(str);
         statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
	 statusPanel.add(statusLabel);
         frame.setVisible(true);
  }


public void run()
  {
    try{
       while(true){  // infinite loop
       Thread.sleep(1000);
       System.out.print((char)13);
       now = LocalDateTime.now();
     
        statusLabel.setText(dtf.format(now));
     
       }

      }
   catch(Exception e){
      System.out.println("Error occured"+e);
      }
   
   
  }

public static void main(String [] ar){

dateClock dc = new dateClock();
dc.start();




}

}
