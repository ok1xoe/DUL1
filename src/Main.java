import com.engeto.seller.Car;
import com.engeto.seller.Seller;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();

        car1.setCarId("1");
        car1.setLicensePlate("4Z0 2548");
        car1.setCarConsumption(5.6F);

        car2.setCarId("2");
        car2.setLicensePlate("7Z0 1387");
        car2.setCarConsumption(5.5F);

        Seller seller1 = new Seller();
        seller1.setSellerName("Josef Hnízdo");
        seller1.setSellerAddressCity("Kolín");
        seller1.setSellerBirthDate(LocalDate.of(1970,1,1));
        seller1.setSellerCar("2");

        Seller seller2 = new Seller();
        seller2.setSellerName("Jan Novák");
        seller2.setSellerAddressCity("Praha");
        seller2.setSellerBirthDate(LocalDate.of(2000,10,25));
        seller2.setSellerCar("1");

        System.out.println("Obchodník " + seller1.getSellerId());
        System.out.println("Jméno: " + seller1.getSellerName());
        System.out.println("Město: " + seller1.getSellerAddressCity());
        System.out.println("Car ID: " + seller1.getSellerCar());
        System.out.println("SPZ: " +  car2.getLicensePlate());
        System.out.println("Spotřeba: " +  car2.getCarConsumption());

        System.out.println("---");
        System.out.println("Obchodník " + seller2.getSellerId());
        System.out.println("Jméno: " + seller2.getSellerName());
        System.out.println("Město: " + seller2.getSellerAddressCity());
        System.out.println("Car ID: " + seller2.getSellerCar());
        System.out.println("SPZ: " +  car1.getLicensePlate());
        System.out.println("Spotřeba: " +  car1.getCarConsumption());


    }
}