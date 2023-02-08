public class CdPlayer implements IPushCallBack{
    private Button playButton;
    private Button stopButton;

    private Interceptor interceptor;

    public CdPlayer(Interceptor interceptor){
        this.interceptor = interceptor;
    }

    public final void notifyButtonPushed(Button b){
        if (b==playButton){
            this.playButtonPushed(b);
        }
        if (b==stopButton){
            this.stopButtonPushed(b);
        }
    }

    public final void setPlayButton(Button b){
        playButton = b;
    }

    public final void setStopButton(Button b){
        stopButton = b;
    }

    public final void playButtonPushed(Button b){
        Request request = new PlayRequest();
        interceptor.beforeExecute(request);
        request.Execute();
        interceptor.afterExecute(request);
    }

    public final void stopButtonPushed(Button b){
        Request request = new StopRequest();
        interceptor.beforeExecute(request);
        request.Execute();
        interceptor.afterExecute(request);
    }
}
