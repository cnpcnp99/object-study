/**
 * 관람객 클래스
 */
public class Audience {

    private Bag bag; // 관람객은 가방을 보유할 수 있다

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }
}
