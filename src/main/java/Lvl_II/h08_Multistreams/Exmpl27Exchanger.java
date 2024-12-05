package Lvl_II.h08_Multistreams;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class Exmpl27Exchanger {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friendAction = new ArrayList<>();
        friendAction.add(Action.SCISSORS);
        friendAction.add(Action.PAPER);
        friendAction.add(Action.STONE);
        List<Action> friendAction2 = new ArrayList<>();
        friendAction2.add(Action.PAPER);
        friendAction2.add(Action.STONE);
        friendAction2.add(Action.PAPER);
        new BestFriend("Ivan", friendAction,exchanger);
        new BestFriend("Petr", friendAction2,exchanger);
    }
}

enum Action {
    STONE, SCISSORS, PAPER
}

class BestFriend extends Thread{
    private String name;
    private List<Action> myAction;
    private Exchanger<Action> exchanger;
    public BestFriend(String name, List<Action> myAction, Exchanger<Action> exchanger) {
        this.name = name;
        this.myAction = myAction;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action friendAction) {
        if((myAction == Action.STONE) && (friendAction == Action.SCISSORS) ||
                (myAction == Action.SCISSORS) && (friendAction == Action.PAPER) ||
                (myAction == Action.PAPER) && (friendAction == Action.STONE)) {
            System.out.println(name + " WINS!!!");
        }

    }

    public void run() {
        Action reply;
        for(Action action: myAction) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(1500);
            }   catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}