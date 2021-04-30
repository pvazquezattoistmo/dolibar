package dolibarr.models.entity;
//holaaaaa
public class Cliente extends Tercero {

    private int codCliente;
    private EtiquetaCategoria catCliente;

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

}
