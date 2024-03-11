/**
 * 티켓 판매원 클래스
 */
public class TicketSeller {

    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    /**
     * 티켓 셀러가 관객에게 티켓을 판매하는 메소드
     *
     * @param audience 티켓을 판매할 대상
     */
    public void sellTo(Audience audience) {
        Long paidFee = audience.buy(ticketOffice.getTicket());
        ticketOffice.plusAmount(paidFee);
    }
}
