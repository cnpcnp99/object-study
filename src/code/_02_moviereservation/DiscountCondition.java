package code._02_moviereservation;

public interface DiscountCondition {

    boolean isSatisfiedBy(Screening screening);
}
