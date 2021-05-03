package robert.eftene.g1092.adapter;

public class ExistingBookingAPI implements ExistingAbstractBookingAPI {
    @Override
    public void submitReservation(String reservation) {
        System.out.println("Booking reservation...");
        System.out.println(reservation + " successfully submitted!");
    }

    @Override
    public void showReservation() {
        System.out.println("Display available reservation from database...");
    }
}
