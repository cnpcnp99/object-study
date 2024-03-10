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

    public Ticket getTicket() {
        return tickets.remove(0);
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
