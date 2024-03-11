import java.util.ArrayList;
import java.util.List;

/**
 * 티켓 판매처 클래스
 */
public class TicketOffice {

    private Long amount; // 티켓 판매 누적 금액

    private List<Ticket> tickets = new ArrayList<>(); // 티켓 리스트

    public TicketOffice(Long amount, Ticket ...tickets) {
        this.amount = amount;
        this.tickets.addAll(List.of(tickets));
    }

    /**
     * 티켓을 판매하는 메소드
     *
     * @param audience 판매 대상
     */
    public void sellTicketTo(Audience audience) {
        Long paidFee = audience.buy(getTicket());
        plusAmount(paidFee);
    }

    private Ticket getTicket() {
        return tickets.remove(0);
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }
}
