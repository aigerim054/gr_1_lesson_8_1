package kg.geektech.game.players;

import kg.geektech.game.genaral.RPG_Game;

public class Witch extends Hero{
    public Witch(int health, int damage, String name) {
        super(health, damage, SuperAbility.SACERIFACE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean attack = RPG_Game.random.nextBoolean();
        if(this.getHealth() > 0 && attack ==  true){
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getHealth() <= 0){
                    heroes[i].setHealth(this.getHealth() + heroes[i].getHealth());
                    this.setHealth(0);
                    System.out.println("Witch saved a hero");
                }

            }
        }

    }
}
