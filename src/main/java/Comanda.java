import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Comanda implements Iterable<Pedido>{
    private List<Pedido>  comanda = new ArrayList<Pedido>();

    public Comanda(Pedido... clientes) {
        this.comanda = Arrays.asList(clientes);
    }

    @Override
    public Iterator<Pedido> iterator() {
        return comanda.iterator();
    }

}
