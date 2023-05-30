import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.FreelancerMonthsVacation.monthsNumbers.MonthsNumberCalc;


public class MonthsNumberCalcTest {

    @Test
    void numberOfMonthsToBeOffCases() {
        MonthsNumberCalc calc = new MonthsNumberCalc();

        int expected = 3;
        int actual = calc.calculation(10000, 3000, 20000);

        Assertions.assertEquals(expected, actual);

    }

}

