import java.sql.Date;

class LoggingInterceptor implements Interceptor {
    @Override
    public void beforeExecute(Request request) {
      System.out.println("About to execute " + request.getType() + " request at " + request.getTime());
    }
    
    @Override
    public void afterExecute(Request request) {
      System.out.println("Finished executing " + request.getType() + " request at " + new Date((System.currentTimeMillis())));
    }
  }