public class Game {
    
    public static void main(String[] args) {
       
      GameBoard board = new GameBoard(10, 10);
        
        Unit player = new Unit("勇者", 100, 25, 4, "player");
        Unit enemy = new Unit("ゴブリン", 50, 10, 3, "enemy");

      
        board.addUnit(player, 1, 5);
       
        board.addUnit(enemy, 8, 5);
        
        
        board.display();
    }
}
