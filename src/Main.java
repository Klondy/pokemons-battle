import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args)
    {
        Battle b = new Battle();
        Pokemon p1 = new Comfey("Comfey",4);
        Pokemon p2 = new Cubone("Cubone", 2);
        Pokemon p3 = new Marowalk("Marowalk", 5);
        Pokemon p4 = new Slakoth("Slakoth", 3);
        Pokemon p5 = new Vigoroth("Vigoroth", 3);
        Pokemon p6 = new Slaking("Slaking", 4);

        b.addAlly(p1);
        b.addAlly(p5);
        b.addAlly(p6);

        b.addFoe(p2);
        b.addFoe(p3);
        b.addFoe(p4);

        b.go();
    }
}