package robert.eftene.g1092.decorator;

public abstract class AbstractBusinessDecorator extends AbstractBusiness {

    protected AbstractBusiness abstractBusiness;

    public AbstractBusinessDecorator(AbstractBusiness abstractBusiness) {
        this.abstractBusiness = abstractBusiness;
    }

    @Override
    public void displayBusiness() {
        this.abstractBusiness.displayBusiness();
    }
}
