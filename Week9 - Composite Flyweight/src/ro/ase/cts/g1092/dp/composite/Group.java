package ro.ase.cts.g1092.dp.composite;

import java.util.ArrayList;

public class Group extends AbstractNode {

    String groupName;
    ArrayList<AbstractNode> nodes = new ArrayList<>();

    public Group(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void addNode(AbstractNode abstractNode) {
        this.nodes.add(abstractNode);
    }

    @Override
    public void removeNode(AbstractNode abstractNode) {
        this.nodes.remove(abstractNode);
    }

    @Override
    public AbstractNode getNode(int index) {
        return this.nodes.get(index);
    }

    @Override
    public void attack(String playerName) {
        this.nodes.forEach(node -> node.attack(playerName));
    }

    @Override
    public void move() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void retreat() {
        this.nodes.forEach(NPCActions::retreat);
    }
}
