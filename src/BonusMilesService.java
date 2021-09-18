public class BonusMilesService {

    public static int calculate (int cost) {

//        int cost = 10000;
        byte moneyPerMiles = 20;
        int bonusMiles = cost / moneyPerMiles;
        return bonusMiles ;

    }
}
