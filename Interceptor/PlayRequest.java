import java.sql.Date;

class PlayRequest implements Request {
    private Date time;

    public PlayRequest() {
        time =  new Date(System.currentTimeMillis());
      }

    @Override
    public void Execute() {
        //Change this later to suit some implementation
        System.out.println("Playing the CD");
    }

    @Override
    public String getType() {
        return "play";
    }

    @Override
    public Date getTime() {
        return time;
    }
}
