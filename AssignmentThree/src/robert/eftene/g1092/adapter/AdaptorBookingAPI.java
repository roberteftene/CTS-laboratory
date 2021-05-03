package robert.eftene.g1092.adapter;

public class AdaptorBookingAPI extends ExistingBookingAPI implements NewBookingAPI {
    @Override
    public void saveNewReservation(String reservation) {
        System.out.println("Integrating new API...");
        this.submitReservation(reservation);
    }

    @Override
    public void getReservation() {
        System.out.println("Integrating new API...");
        this.showReservation();
    }
}
