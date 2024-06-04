package ObjectAndClass;

import java.time.LocalDateTime;


public class Call {
    private LocalDateTime startTime;
    private int duration; // Продължителност в секунди

    // Конструктор, който приема всички параметри
    public Call(LocalDateTime startTime, int duration) {
        this.startTime = startTime;
        this.duration = duration;
    }

    // Гетъри и сетъри
    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Call{" +
                "startTime=" + startTime +
                ", duration=" + duration +
                " seconds}";
    }


}

