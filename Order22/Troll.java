/**
 * Троль
 */
public class Troll extends Character {

    @Override
    protected void pickUpWeapon() {
        System.out.println("Picks up club");
    }

    @Override
    protected void defenseAction() {
        System.out.println("Defends with club");
    }

    @Override
    protected void moveToSafety() {
        System.out.println("Returns to the mountain");
    }

}