package racingcar;


import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static racingcar.Validation.carsMoreThanTwo;
import static racingcar.Validation.isLongName;

import org.junit.jupiter.api.Test;

class ValidationTest {
    @Test
    void carsMoreThanTwoTest() {
        assertThatThrownBy(() -> carsMoreThanTwo(1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("2대 이상의 차를 입력해야 합니다.");
    }

    @Test
    void isLongNameTest() {
        String[] names = {"Antonio, Sophia, Jack"};
        assertThatThrownBy(() -> isLongName(names))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("차의 이름은 5글자 이하여야 합니다.");
    }

}