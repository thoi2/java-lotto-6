package lotto;
import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("구입금액을 입력해 주세요.");
        String unCheckedPayMoney = Console.readLine();
        int payMoney = checkPayMoney(unCheckedPayMoney);
        int lottoPurchasesNum = calculateLottoPurchasesNum(payMoney);
        System.out.println(lottoPurchasesNum+"개를 구매했습니다.");
        myLottoNum(lottoPurchasesNum);



    }

    public static List<Integer> lottoNumberGenerator(){
        List<Integer> lottoNumber = Randoms.pickUniqueNumbersInRange(1,45,6);
        return lottoNumber;
    }
    public static int checkPayMoney(String unCheckedPayMoney){
        int checkPayMoney = Integer.parseInt(unCheckedPayMoney);
        return checkPayMoney;
    }
    public static int calculateLottoPurchasesNum (int payMoney){
        int lottoPurchasesNum = payMoney/1000;
        return lottoPurchasesNum;
    }
    public static List<Lotto> myLottoNum(int lottoPurchasesNum){
        List<Lotto> myLottoNum = new ArrayList<>();
        for(int i=1;i<lottoPurchasesNum+1;i++ ){
            Lotto lotto = new Lotto(lottoNumberGenerator());
            myLottoNum.add(lotto);
            System.out.println(lotto);
        }
        return myLottoNum;
    }

}
