import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.FreelancerMonthsVacation.monthsNumbers.MonthsNumberService;

public class MonthsNumberServiceTest {

    @Test
    void shouldCalculateExact1() {
        MonthsNumberService service = new MonthsNumberService();

        int expected = 3;
        int actual = service.calculation(10000, 3000, 20000);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateExact2() {
        MonthsNumberService service = new MonthsNumberService();

        int expected = 2;
        int actual = service.calculation(100000, 60000, 150000);

        Assertions.assertEquals(expected, actual);

    }
}
