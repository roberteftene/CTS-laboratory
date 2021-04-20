package ro.ase.cts.g1092.dp.composite;

public class TestComposite {

    public static void main(String[] args) {

        AbstractNode g1 = new Group("Red team");
        g1.addNode(new NPC("SoldierOne",100));
        g1.addNode(new NPC("SoldierTwo",100));

        AbstractNode g2 = new Group("Blue team");
        g2.addNode(new NPC("Soldier Three",100));
        g2.addNode(new NPC("Demolition",300));

        AbstractNode levelGroup = new Group("Level 2");
        levelGroup.addNode(new NPC("Lvl Boss",500));
        levelGroup.addNode(g1);
        levelGroup.addNode(g2);

        levelGroup.attack("Superman");
        levelGroup.retreat();
        levelGroup.getNode(0).move();

    }
}
