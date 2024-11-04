package lotto;

public enum PrizeMoneyByRank {
    FIRST(1,6,2000000000),
    SECOND(2,5,30000000),
    THIRD(3,5,1500000),
    FOURTH(4,4,50000),
    FIFTH(5,3,5000);

    private final int matchCount;
    private final int prizeMoney;
    private final int rank;


    PrizeMoneyByRank(int rank, int matchCount, int prizeMoney){
        this.rank = rank;
        this.matchCount = matchCount;
        this.prizeMoney = prizeMoney;
    }
    public int getMatchCount(){
        return  matchCount;
    }

    public int getPrizeMoney() {
        return prizeMoney;
    }
    public int getRank(){
        return rank;
    }
}
