package cz.zomer.basicCalculator


import org.assertj.core.api.Assertions.assertThat
import org.junit.Assert
import org.junit.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.MethodSource


internal class CalculationServiceAdditionTest {
    @ParameterizedTest
    @MethodSource
    @CsvSource(
        "1.0, 3.0, 4.0",
        "3.0, 2.0, 5.0",
        "89.0, 23.0, 112.0",
        "20.0, 10.0, 30"
    )
    fun add() {
        addition()



    }
    companion object{
        @JvmStatic
        fun addition() = listOf(
            Arguments.of()
        )
    }

    /*fun addition () {
        val service1 = calculationService(6.0, 4.0)
        val service2 = calculationService(4.0, 6.0)
        val service3 = calculationService(5.0, 7.0)
        assertThat(service1.addition()).isEqualTo(service2.addition())
        assertThat(service1.addition()).isLessThan(service3.addition())

    }
    @Test
    fun division () {
        val serviceDivision1 = calculationService(18.0, 9.0)
        val serviceDivision2 = calculationService(20.0, 10.0)
        assertThat(serviceDivision1.division()).isEqualTo(serviceDivision2.division())
    }
    @Test
    fun substraction () {
        val serviceSubstraction1 = calculationService(56.0, 46.0)
        val serviceSubstraction2 = calculationService(66.0, 56.0)
        assertThat(serviceSubstraction1.substraction()).isEqualTo(serviceSubstraction2.substraction())
        assertThat(serviceSubstraction1.substraction()).isGreaterThan(0.0)
    }
    @Test
    fun multiplication () {
        val serviceMultiplying1 = calculationService(8.0,16.0)
        val serviceMultiplying2 = calculationService(16.0, 8.0)
        val serviceMultiplying3 = calculationService(1654.0, 0.0)
        assertThat(serviceMultiplying1.multipliction()).isEqualTo(serviceMultiplying2.multipliction())
        assertThat(serviceMultiplying3.multipliction()).isEqualTo(0.0)
    }*/
}
