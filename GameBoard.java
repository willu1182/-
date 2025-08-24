public class GameBoard {
    
    private Unit[][] grid;
    private int width;  
    private int height; 

    public GameBoard(int width, int height) {
        this.width = width;
        this.height = height;
        this.grid = new Unit[width][height];
    }

    public void addUnit(Unit unit, int x, int y) {
        if (x >= 0 && x < this.width && y >= 0 && y < this.height) {
            this.grid[x][y] = unit; 
            unit.x = x; 
            unit.y = y;
        }
    }

    public void display() {
        System.out.println("\n--- マップ ---");
        for (int y = 0; y < this.height; y++) {
            for (int x = 0; x < this.width; x++) {
                if (this.grid[x][y] != null) {
                    System.out.print("[" + this.grid[x][y] + "]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println(); 
        }
        System.out.println("--------------");
    }
}
