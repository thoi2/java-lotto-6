package lotto;
import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        int payMoney = getPayMoney();
        int lottoPurchasesNum = calculateLottoPurchasesNum(payMoney);
        List<Lotto> myLottoNum = myLottoNum(lottoPurchasesNum);
        List<Integer> luckyNum = getLuckyNum();
        int bonusNumber = getBonusNumber();

    }

    public static List<Integer> lottoNumberGenerator(){
        List<Integer> lottoNumber = Randoms.pickUniqueNumbersInRange(1,45,6);
        return lottoNumber;
    }
    public static int getPayMoney(){
        System.out.println("구입금액을 입력해 주세요.");
        String unCheckedPayMoney = Console.readLine();
        int payMoney = checkPayMoney(unCheckedPayMoney);
        return payMoney;

    }
    public static int checkPayMoney(String unCheckedPayMoney){
        int checkPayMoney = Integer.parseInt(unCheckedPayMoney);
        return checkPayMoney;
    }
    public static int calculateLottoPurchasesNum (int payMoney){
        final int pricePerLotto=1000;
        int lottoPurchasesNum = payMoney/pricePerLotto;
        System.out.println(lottoPurchasesNum+"개를 구매했습니다.");
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
    public static List<Integer> getLuckyNum(){
        System.out.println("\n당첨 번호를 입력해 주세요.");
        String unCheckedLuckyNumber = Console.readLine();
        List<Integer> luckyNum = checkLuckyNum(unCheckedLuckyNumber);
        new Lotto(luckyNum);
        return luckyNum;

    }
    public static List<Integer> checkLuckyNum(String unCheckedLuckyNumber){
        StringTokenizer tokenizer = new StringTokenizer(unCheckedLuckyNumber,",");
        List<Integer> checkLuckyNum = new ArrayList<>();
        while (tokenizer.hasMoreTokens()) {
            int token = Integer.parseInt(tokenizer.nextToken());
            checkLuckyNum.add(token);
        }
        return checkLuckyNum;
    }
    public  static int getBonusNumber(){
        System.out.println("\n보너스 번호를 입력해 주세요.");
        String unCheckedBonusNumber = Console.readLine();
        int bonusNumber=checkBonusNumber(unCheckedBonusNumber);
        return bonusNumber;
    }
    public static int checkBonusNumber(String unCheckedBonusNumber) {
        int checkBonusNumber = Integer.parseInt(unCheckedBonusNumber);
        return checkBonusNumber;
    }
}


