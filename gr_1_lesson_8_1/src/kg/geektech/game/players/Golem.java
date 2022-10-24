package kg.geektech.game.players;

public class Golem extends Hero {
    public Golem(int health, int damage,  String name) {
        super(health, damage, SuperAbility.TAKE_DAMAGE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int golem = boss.getDamage()/5;
        for (int i = 0; i < heroes.length; i++) {
            if (this.getHealth() > 0 && heroes[i].getHealth() > 0 && this != heroes[i]){
                heroes[i].setHealth(heroes[i].getHealth() + boss.getDamage());
                this.setHealth(this.getHealth() - golem);
            }

        }
        System.out.println("Golem took boss damage");

    }
}
