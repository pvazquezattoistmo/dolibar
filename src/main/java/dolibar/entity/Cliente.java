package dolibar.entity;
//DIANA
public class Cliente extends Tercero {

    private int codCliente;
    private EtiquetaCategoria catCliente;
    private Tercero tercero;

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public EtiquetaCategoria getCatCliente() {
        return catCliente;
    }

    public void setCatCliente(EtiquetaCategoria catCliente) {
        this.catCliente = catCliente;
    }

    public Tercero getTercero() {
        return tercero;
    }

    public void setTercero(Tercero tercero) {
        this.tercero = tercero;
    }

    @Override
    public String toString() {
        return "Cliente codCliente=" + codCliente + ", catCliente=" + catCliente + ", tercero=" + tercero;
    }

}
