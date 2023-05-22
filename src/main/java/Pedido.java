public class Pedido {
    private String registroPedido;
    private boolean entregue;

    public Pedido(String registro, boolean status) {
        this.registroPedido = registro;
        this.entregue = status;
    }

    public String getRegistroPedido() {
        return registroPedido;
    }

    public void setRegistroPedido(String registroPedido) {
        this.registroPedido = registroPedido;
    }

    public boolean isEntregue() {
        return entregue;
    }

    public void setEntregue(boolean entregue) {
        this.entregue = entregue;
    }
}
