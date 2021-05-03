package robert.eftene.g1092.decorator;

public class BusinessModel extends AbstractBusiness {

    public BusinessModel(String business) {
        this.business = business;
    }

    @Override
    public void displayBusiness() {
        System.out.println("General business: " + business);
    }
}
