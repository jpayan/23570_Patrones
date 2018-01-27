import Behaviors.AxeBehavior;
import Behaviors.CrossBowBehavior;
import Behaviors.KnifeBehavior;
import Behaviors.SwordBehavior;
import Fighters.King;
import Fighters.Knight;
import Fighters.Queen;
import Fighters.Troll;

public class Main {
    public static void main(String[] args) {
        King king = new King(new CrossBowBehavior());
        king.fight();

        Queen queen = new Queen(new KnifeBehavior());
        queen.fight();

        Knight knight = new Knight(new SwordBehavior());
        knight.fight();

        Troll troll = new Troll(new AxeBehavior());
        troll.fight();
    }
}