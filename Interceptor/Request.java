import java.sql.Date;

public interface Request {
    void Execute();
    String getType();
    Date getTime();
}
