import com.engeto.seller.Car;
import com.engeto.seller.CarrotSeller;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String licensePlate;
        Pattern p = Pattern.compile("[0-9][A-Z][A-Z0-9][ ][0-9]{4}");

        Car car1 = new Car();
        Car car2 = new Car();

        car1.setCarId("1");
        licensePlate = "4Z0 2548";
        Matcher m = p.matcher(licensePlate);
        if (!m.find()) {
            licensePlate = "Nevalidně zadaná SPZ " + licensePlate + ".";
        }
        car1.setLicensePlate(licensePlate);
        car1.setCarConsumption(5.6F);

        car2.setCarId("2");
        licensePlate = "7Z01387";
        m = p.matcher(licensePlate);
        if (!m.find()) {
            licensePlate = "Nevalidně zadaná SPZ " + licensePlate  + ".";
        }
        car2.setLicensePlate(licensePlate);
        car2.setCarConsumption(5.5F);

        CarrotSeller seller1 = new CarrotSeller();
        seller1.setSellerName("Josef Hnízdo");
        seller1.setSellerAddressCity("Kolín");
        seller1.setSellerBirthDate(LocalDate.of(1970,1,1));
        seller1.setSellerCar("2");

        CarrotSeller seller2 = new CarrotSeller();
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