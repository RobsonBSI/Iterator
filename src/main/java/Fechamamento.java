import java.util.Iterator;

public class Fechamamento {

    public static Integer TotalPedidosEntregue(Comanda pedido) {
        int quantidade = 0;
        for (Pedido cliente : pedido) {
            if (cliente.isEntregue()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer TotalPedidos(Comanda pedido) {
        int quantidade = 0;
        for (Iterator a = pedido.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}