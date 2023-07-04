package OOP_1;

public class OOP_1 {
    public static void main(String[] args) {

        
        Peasant peasant = new Peasant("Leroy", 5, 100);
        Rogue rogue = new Rogue("Ana", 5, 150);
        Sniper sniper = new Sniper("Ghost", 5, 120);
        Wizard wizard = new Wizard("Kir", 5, 80);
        Spearman spearman = new Spearman("Pasha", 5, 200);
        Crossbowman crossbowman = new Crossbowman("Olivia", 5, 110);
        Monk monk = new Monk("Grace", 5, 90);

        
        System.out.println(  );
        peasant.attack(rogue);
        peasant.harvest();
        rogue.attack(spearman);
        rogue.die();
        sniper.rest(50);
        sniper.aim();
        wizard.rest(30);
        wizard.curse();
        crossbowman.attack(monk);
        crossbowman.reload();
        spearman.takeDamage(50);
        spearman.brace();
        monk.rest(20);
        monk.heal();

        System.out.println( "\n" + peasant );
        System.out.println( rogue );
        System.out.println( sniper );
        System.out.println( wizard );
        System.out.println( crossbowman );
        System.out.println( spearman );
        System.out.println( monk + "\n" );
    }
}
