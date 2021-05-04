package dolibarr.models.entity;
//holaaaaa

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

}
