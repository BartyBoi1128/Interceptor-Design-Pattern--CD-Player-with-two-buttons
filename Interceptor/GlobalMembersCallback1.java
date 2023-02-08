public class GlobalMembersCallback1{
    public static void main(String[] args){
        LoggingInterceptor loggingInterceptor = new LoggingInterceptor();
        CdPlayer cdPlayer = new CdPlayer(loggingInterceptor);
        Button playButton = new Button(cdPlayer);
        Button stopButton = new Button(cdPlayer);
        cdPlayer.setPlayButton(playButton);
        cdPlayer.setStopButton(stopButton);
        playButton.push();
        stopButton.push();
    }
}