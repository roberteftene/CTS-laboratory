package robert.eftene.g1092.decorator;

public class BusinessDecorator extends AbstractBusinessDecorator {
    public BusinessDecorator(AbstractBusiness abstractBusiness) {
        super(abstractBusiness);
    }

    @Override
    public void displayBusiness() {
        System.out.println("Liked service");
    }
}
