package ro.ase.acs.cts.g1092.refactor.phase2;

public enum ProductType {

    NEW(0),
    DISCOUNTED(0.1f),
    LIMITED_STOCK(0.25f),
    OLD(0.35f);

    private float discount;

    ProductType(float discountValue) {
        this.discount = discountValue;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
}
