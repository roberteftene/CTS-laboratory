package ro.ase.cts.g1092.dp.composite;

public abstract class AbstractNode implements NPCActions {

    public abstract void addNode(AbstractNode abstractNode);
    public abstract void removeNode(AbstractNode abstractNode);
    public abstract AbstractNode getNode(int index);

}
