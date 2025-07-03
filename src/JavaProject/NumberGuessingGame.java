package JavaProject;
import java.util.Scanner;
class Guesser {
    int GuesserNum;

    public int GuesserNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser kindly guess a number ");
        GuesserNum = sc.nextInt();
        return GuesserNum;
    }
}

class Player {
    int PlayerNum;

    public int PlayerNum() {
        Scanner sc = new Scanner(System.in);
        PlayerNum = sc.nextInt();
        return PlayerNum;
    }
}

class Umpire {
    int Guessernum;
    int Playernum1;
    int Playernum2;
    int Playernum3;

    public void CollectNumFromGuesser() {
        Guesser Gu = new Guesser();
        Guessernum = Gu.GuesserNum();
    }

    public void CollectNumFromPlayers() {
        System.out.println("Player1 guess your Number");
        Player p1 = new Player();
        Playernum1 = p1.PlayerNum();
        System.out.println("Player2 guess your Number");
//        Player p2 = new Player();
        Playernum2 = p1.PlayerNum();
        System.out.println("Player3 guess your Number");
        Player p3 = new Player();
        Playernum3 = p3.PlayerNum();

    }
    public void Compare(){
        if (Guessernum==Playernum1){
            if (Guessernum==Playernum2 && Guessernum==Playernum3){
                System.out.println("All Players won the game");
            }
            else if(Guessernum==Playernum2){
                System.out.println("Player1 and Player2 won the game");
            }
            else if (Guessernum==Playernum3){
                System.out.println("Player1 and Player3 won the game");
            }
            else {
                System.out.println("Only Player1 won the game");
            }
        }
        else if(Guessernum==Playernum2){
            if (Guessernum==Playernum3){
                System.out.println("Player2 and Player3");
            }
            else {
                System.out.println("Player2");
            }
        }
        else if (Guessernum==Playernum3){
            System.out.println("Only Player3 won the game");
        }
        else {
            System.out.println("All Players lost the game");
        }
    }
}
public class NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println("-----Game Started -------");
        Umpire um = new Umpire();
        um.CollectNumFromGuesser();
        um.CollectNumFromPlayers();
        um.Compare();
        System.out.println("----- Game Over-------");
    }

}
