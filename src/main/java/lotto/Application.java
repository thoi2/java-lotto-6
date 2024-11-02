package lotto;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println(new Lotto(lottoNumberGenerator()));

    }

    public static List<Integer> lottoNumberGenerator(){
        return Randoms.pickUniqueNumbersInRange(1,45,6);
    }
}
