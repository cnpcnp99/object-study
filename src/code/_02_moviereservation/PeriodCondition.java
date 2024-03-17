package code._02_moviereservation;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class PeriodCondition implements DiscountCondition {

    private DayOfWeek dayOfWeek;
    
    private LocalTime startedAt;
    
    private LocalTime endedAt;

    public PeriodCondition(DayOfWeek dayOfWeek, LocalTime startedAt, LocalTime endedAt) {
        this.dayOfWeek = dayOfWeek;
        this.startedAt = startedAt;
        this.endedAt = endedAt;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return dayOfWeek.equals(screening.getStartTime().getDayOfWeek())
               && !startedAt.isAfter(screening.getStartTime().toLocalTime())
               && !endedAt.isBefore(screening.getStartTime().toLocalTime());
    }
}
