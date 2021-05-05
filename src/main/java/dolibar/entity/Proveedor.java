package dolibar.entity;

public class Proveedor extends Tercero {

    private int codigoProvedor;
    private EtiquetaCategoria catProvedor;
    private String codBarras;
    private Tercero tercero;

    public int getCodigoProvedor() {
        return codigoProvedor;
    }

    public void setCodigoProvedor(int CodigoProvedor) {
        this.codigoProvedor = CodigoProvedor;
    }

    public EtiquetaCategoria getCatprovedor() {
        return catProvedor;
    }

    public void setCatprovedor(EtiquetaCategoria Catprovedor) {
        this.catProvedor = Catprovedor;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String CodBarras) {
        this.codBarras = CodBarras;
    }

    public Tercero getTercero() {
        return tercero;
    }

    public void setTercero(Tercero tercero) {
        this.tercero = tercero;
    }

    @Override
    public String toString() {
        return "Proveedor codigoProvedor=" + codigoProvedor + ", Catprovedor=" + catProvedor + ", CodBarras=" + codBarras + ", tercero=" + tercero;
    }

}
