import java.sql.Date;

public class StopRequest implements Request{
    private Date time;
  
    public StopRequest() {
      time = new Date(System.currentTimeMillis());
    }
    
    @Override
    public void Execute() {
    //Tell the user how long they've been listening to music for.
      System.out.println("Stopping the CD");
    }
    
    @Override
    public String getType() {
      return "Stop";
    }
    
    @Override
    public Date getTime() {
      return time;
    }
}
