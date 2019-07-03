import org.assertj.core.api.Assertions;
import org.junit.Test;


public class Euler6MethodTest {

    Euler6Method em = new Euler6Method();

    /*
    number 3 >> (1 + 2 + 3) ^ 2; result   36
    number 3 >> 1^1 + 2^2 + 3^2; result   14
                                 RESULT   22

    number 6 >> (1 + ... + 6)^2; result  441
    number 6 >> 1^1 + ... + 6^2; result   91
                                 RESULT  350

    number 10 >> (1 +...+ 10)^2; result 3025
    number 10 >> 1^1+...+10^2;   result  385
                                 RESULT 2640

     */

    @Test
    public void euler6_3() {
        //given
        int number = 3;
        //when
        int result = em.squareDifference(number);
        //then
        Assertions.assertThat(result).isEqualTo(22);
    }
    @Test
    public void euler6_6() {
        //given
        int number = 3;
        //when
        int result = em.squareDifference(number);
        //then
        Assertions.assertThat(result).isEqualTo(22);
    }
    @Test
    public void euler6_10() {
        //given
        int number = 10;
        //when
        int result = em.squareDifference(number);
        //then
        Assertions.assertThat(result).isEqualTo(2640);
    }

}
