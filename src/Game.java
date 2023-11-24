import com.game.models.Monster;
import com.game.models.Snake;
import com.game.models.Troll;

public class Game {


    public static void main(String[] args) {

        Monster troll = new Troll("trollname", 100000, 80);
        Monster snake = new Snake("Nagini", 5000000, 4500);

        System.out.println(troll);
        System.out.println(snake);
        System.out.println(snake.attack());
        System.out.println(troll.attack());

    }
}
