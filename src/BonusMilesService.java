public class BonusMilesService {

    public static int calculate (int cost) {

        byte moneyPerMiles = 20;
        int bonusMiles = cost / moneyPerMiles;
        return bonusMiles ;

    }
}
