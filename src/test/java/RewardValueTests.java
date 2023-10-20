import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cash = 100;
        double expected_miles_value = cash / 0.0035;
        var rewardValue = new RewardValue(cash);
        assertEquals(expected_miles_value, rewardValue.getMilesValue(), 1);

    }

    @Test
    void convert_from_miles_to_cash() {
        int miles = 10000;
        double expected_cash_value = miles * 0.0035;
        var rewardValue = new RewardValue(miles);
        assertEquals(expected_cash_value, rewardValue.getCashValue());

    }
}
