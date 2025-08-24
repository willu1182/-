public class Unit {
    
    String name;    
    int hp;         
    int attack;    
    int moveRange; 
    int x, y;       
    String team;    

  public Unit(String name, int hp, int attack, int moveRange, String team) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.moveRange = moveRange;
        this.team = team;
    }

    public void takeDamage(int damage) {
        this.hp -= damage; // 
        if (this.hp < 0) {
            this.hp = 0; 
        }
        System.out.println(this.name + "は" + damage + "のダメージを受けた！");
    }

    
    @Override
    public String toString() {
        return this.name.substring(0, 1);
    }
}
