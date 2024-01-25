public class CoinTester
{
    public static void main(String[] args) {

       Coins change = new Coins(3, 2, 1, 4);
       change.bankCount();
       
       change.addQuarter();
       change.addQuarter();
       change.addDime();
       change.addPenny();
       change.addPenny();
       change.addPenny();
       
       change.bankCount();
       change.bankValue();
       
    }
}

