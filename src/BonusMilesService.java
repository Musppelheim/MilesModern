public class BonusMilesService {
    public int calculate(int cost) {
        int score = 20;
        int miles= cost / score;
        return miles;
    }
}
