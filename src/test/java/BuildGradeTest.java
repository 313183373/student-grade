import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BuildGradeTest {
    private BuildGrade buildGrade;

    @BeforeEach
    void beforeEach() {
        buildGrade = new BuildGrade(new MainMenu());
    }

    @Test
    void should_return_true_when_input_is_right() {
        assertTrue(buildGrade.isValidCommand("123, 132"));
    }
}
