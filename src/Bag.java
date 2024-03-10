/**
 * 가방 클래스
 */
public class Bag {

    private Long amount; // 보유 현금

    private Invitation invitation;

    private Ticket ticket;

    /**
     * 현금만 보유하는 경우에 사용하는 생성자
     *
     * @param amount 보유 현금 수량
     */
    public Bag(Long amount) {
        this.amount = amount;
    }

    /**
     * 초대장과 현금을 함께 보유하는 경우에 사용하는 생성자
     *
     * @param amount 보유 현금 수량
     * @param invitation 초대장
     */
    public Bag(Long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    /**
     * 초대장이 있는지 여부 체크하는 메소드
     *
     * @return true: 초대장 보유 / false: 초대장 미보유
     */
    public boolean hasInvitation() {
        return invitation != null;
    }

    /**
     * 입장 티멧 보유 여부를 체크하는 메소드
     *
     * @return true: 티켓 보유 / false: 티켓 미보유
     */
    public boolean hasTicket() {
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
