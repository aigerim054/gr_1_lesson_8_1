package kg.geektech.game.players;

public class Magic extends Hero  {
    private int increase = 10;
    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage() + increase);


        }
        System.out.println(" Magic increased heroes damage");
    }
}
