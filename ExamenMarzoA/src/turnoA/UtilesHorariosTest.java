package turnoA;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Utiles Horarios Test")
class UtilesHorariosTest {

    @Test
    @DisplayName("Test Calculate Bill")
    void testCalculateBill() {
        UtilesHorarios utiles = new UtilesHorarios();
        String[] horaComienzo = {"0", "0"}, horaSalida = {"0", "1"};
        float tarifa = 1f;
        float expected = 1;
        utiles.setPayPerMinute(tarifa);
        // prueba SUT
        float calculateBill = utiles.calculateBill(horaComienzo, horaSalida);
        // ASERCION
        assertEquals(expected, calculateBill);
    }
}
