import com.esliceu.model.Game;
import com.esliceu.model.Monster;
import com.esliceu.service.GameService;
import com.esliceu.service.MonsterService;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Game game = new Game(0,true);
        GameService gameService= new GameService();
        MonsterService monsterService = new MonsterService();
        ArrayList monsters = monsterService.createMonster();
        Monster one = (Monster) monsters.get(0);
        Monster two = (Monster) monsters.get(1);
            gameService.doTurn((Monster) monsters.get(0), (Monster) monsters.get(1));
            System.out.println(game.getTurn());
            game.setTurn(game.getTurn()+1);

    }
}
