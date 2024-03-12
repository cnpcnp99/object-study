package code._01_theatre;

/**
 * 관람객 클래스
 */
public class Audience {

    private Bag bag; // 관람객은 가방을 보유할 수 있다

    public Audience(Bag bag) {
        this.bag = bag;
    }

    /**
     * 티켓을 구매하는 메소드(초대권이 있다면 무료로 티켓을 구매하게 됨)
     *
     * @param ticket 구매할 티켓
     * @return 구매하면서 지불한 금액
     */
    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
