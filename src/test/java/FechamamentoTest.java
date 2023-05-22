import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FechamamentoTest {

    @Test
    void RetonaraNumeroPedidosEntregues() {
        Comanda comadaDia = new Comanda(
                new Pedido("Per001", true),
                new Pedido("Per002", true),
                new Pedido("Per003", false),
                new Pedido("Per004", true),
                new Pedido("Per005", false),
                new Pedido("Per006", true),
                new Pedido("Per007", false),
                new Pedido("Per008", true)
        );
        assertEquals(5, Fechamamento.TotalPedidosEntregue(comadaDia));
    }
    @Test
    void RetonaraNumeroPedidos() {
        Comanda comadaDia = new Comanda(
                new Pedido("Per001", true),
                new Pedido("Per002", true),
                new Pedido("Per003", false),
                new Pedido("Per004", true),
                new Pedido("Per005", false),
                new Pedido("Per006", true),
                new Pedido("Per007", false),
                new Pedido("Per008", true)
        );
        assertEquals(8, Fechamamento.TotalPedidos(comadaDia));
    }
}