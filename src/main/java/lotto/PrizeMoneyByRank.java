package lotto;

public enum PrizeMoneyByRank {
    FIRST(6,2000000000),
    SECOND(5,30000000),
    THIRD(5,1500000),
    FOURTH(4,50000),
    FIFTH(3,5000);

        private final int matchCount;
        private final int prizeMoney;


        PrizeMoneyByRank(int matchCount, int prizeMoney){
            this.matchCount = matchCount;
            this.prizeMoney = prizeMoney;
        }
        public int getMatchCount(){
            return  matchCount;
        }

        public int getPrizeMoney() {
            return prizeMoney;
        }
}
