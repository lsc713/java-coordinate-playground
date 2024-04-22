import fuelCharge.Avante;
import fuelCharge.K5;
import fuelCharge.RentCompany;
import fuelCharge.Sonata;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RentCompanyTest {

    private static final String NEWLINE = System.getProperty("line.separator");


    @Test
    public void report() throws Exception {
        RentCompany company = RentCompany.create();
        company.addCar(new Sonata(150));
        company.addCar(new K5(260));
        company.addCar(new Sonata(120));
        company.addCar(new Avante(300));
        company.addCar(new K5(390));

        String report = company.generateReport();
        Assertions.assertThat(report).isEqualTo(
            "fuelCharge.Sonata : 15리터" + NEWLINE +
                "fuelCharge.K5 : 20리터" + NEWLINE +
                "fuelCharge.Sonata : 12리터" + NEWLINE +
                "fuelCharge.Avante : 20리터" + NEWLINE +
                "fuelCharge.K5 : 30리터" + NEWLINE
        );
    }
}
