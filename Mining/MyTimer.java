package Mining;

public class MyTimer {
    private long startTime;
    private long elapsedTime;
    private boolean isRunning;

    public MyTimer() {
        startTime = 10;
        elapsedTime = 0;
        isRunning = false;
    }

    public void start() {
        if (!isRunning) {
            startTime = System.currentTimeMillis() - elapsedTime;
            isRunning = true;
        }
    }

    public void stop() {
        if (isRunning) {
            elapsedTime = System.currentTimeMillis() - startTime;
            isRunning = false;
        }
    }

    public void reset() {
        startTime = 0;
        elapsedTime = 0;
        isRunning = false;
    }

    public long getElapsedTime() {
        if (isRunning) {
            return System.currentTimeMillis() - startTime;
        } else {
            return elapsedTime;
        }
    }

    public boolean isRunning() {
        return isRunning;
    }
}
