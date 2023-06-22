/**
 * Пірат
 */
public class Pirate extends Character {

    @Override
    protected void pickUpWeapon() {
        System.out.println("Picks up sword");
    }

    @Override
    protected void defenseAction() {
        System.out.println("Defends with sword");
    }

    @Override
    protected void moveToSafety() {
        System.out.println("Returns to the ship");
    }

}