package robert.eftene.g1092;

import robert.eftene.g1092.adapter.AdaptorBookingAPI;
import robert.eftene.g1092.adapter.NewBookingAPI;
import robert.eftene.g1092.builder.ServiceCategory;
import robert.eftene.g1092.builder.ServiceModel;
import robert.eftene.g1092.decorator.AbstractBusiness;
import robert.eftene.g1092.decorator.BusinessDecorator;
import robert.eftene.g1092.decorator.BusinessModel;
import robert.eftene.g1092.factory.AbstractUser;
import robert.eftene.g1092.factory.ERole;
import robert.eftene.g1092.factory.UserFactory;
import robert.eftene.g1092.prototype.EPeriod;
import robert.eftene.g1092.prototype.ReportModel;
import robert.eftene.g1092.singleton.DBConnection;

import java.util.HashMap;
import java.util.Map;

public class TestAssignment {

    public static void main(String[] args) throws CloneNotSupportedException {

        //Singleton
        System.out.println("-----------------------SINGLETON--------------------------------\n");
        DBConnection dbConnection = DBConnection.getInstance();
        DBConnection dbConnection1 = DBConnection.getInstance();
        if(dbConnection.equals(dbConnection1)) {
            System.out.println("Same connection");
        } else {
            System.out.println("Different connections");
        }

        //Builder
        System.out.println("-----------------------BUILDER--------------------------------\n");
        Map<String,String> workingHours = new HashMap<>();
        workingHours.put("Monday","08-18");
        workingHours.put("Friday","10-20");
        ServiceModel serviceModel =
                new ServiceModel.ServiceBuilder("TennisArena","Arena for tennis", ServiceCategory.Sportive)
                        .setEmail("roberteftene@gmail.com")
                        .setWorkingHours(workingHours)
                        .build();

        System.out.println(serviceModel.toString());

        //Factory
        System.out.println("-----------------------FACTORY--------------------------------\n");
        AbstractUser generalUser = UserFactory.createUser(ERole.USER_GENERAL,"roberteftene","eftenerobert18@stud.ase.ro","whatpassword");
        AbstractUser adminUser = UserFactory.createUser(ERole.USER_ADMINISTRATOR,"johnny","johnny@stud.ase.ro","strongpassword");
        AbstractUser bussinessOwnerUser = UserFactory.createUser(ERole.USER_BUSINESSOWNER,"chloe99","chloe99@stud.ase.ro","unexpectedpassword");
        generalUser.login();
        System.out.println();
        adminUser.login();
        System.out.println();
        bussinessOwnerUser.login();
        bussinessOwnerUser.logout();

        //Prototype
        System.out.println("-----------------------PROTOTYPE--------------------------------\n");
        ReportModel reportModelMonth = new ReportModel(EPeriod.LAST_MONTH);
        ReportModel reportModelWeek = new ReportModel(EPeriod.LAST_WEEK);
        ReportModel reportModelToday = (ReportModel) reportModelWeek.clone();
        ReportModel reportModelYesterday = (ReportModel) reportModelWeek.clone();


        //Decorator
        System.out.println("-----------------------DECORATOR--------------------------------\n");
        AbstractBusiness abstractBusiness = new BusinessModel("CafeArenaTennis");
        abstractBusiness.displayBusiness();
        AbstractBusiness abstractBusinessDecorated = new BusinessDecorator(abstractBusiness);
        abstractBusinessDecorated.displayBusiness();

        //Adapter
        System.out.println("-----------------------ADAPTER--------------------------------\n");
        NewBookingAPI newBookingAPI = new AdaptorBookingAPI();
        newBookingAPI.saveNewReservation("Friday 6PM");
        newBookingAPI.getReservation();
    }

}
