package kg.geektech.game.players;

import kg.geektech.game.genaral.RPG_Game;

public class Thor extends Hero{
    public Thor(int health, int damage,  String name) {
        super(health, damage, SuperAbility.DEAFF, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean attack = RPG_Game.random.nextBoolean();
        if (this.getHealth() > 0 && attack == true){
            boss.setDamage(0);
            System.out.println("Thor deafened ");

        }else {
            boss.setDamage(50);
        }
    }
}
