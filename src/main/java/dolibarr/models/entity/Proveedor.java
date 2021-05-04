package dolibarr.models.entity;

public class Proveedor extends Tercero {

    private int CodigoProvedor;
    private EtiquetaCategoria Catprovedor;
    private String CodBarras;
    private Tercero tercero;

    public int getCodigoProvedor() {
        return CodigoProvedor;
    }

    public void setCodigoProvedor(int CodigoProvedor) {
        this.CodigoProvedor = CodigoProvedor;
    }

    public EtiquetaCategoria getCatprovedor() {
        return Catprovedor;
    }

    public void setCatprovedor(EtiquetaCategoria Catprovedor) {
        this.Catprovedor = Catprovedor;
    }

    public String getCodBarras() {
        return CodBarras;
    }

    public void setCodBarras(String CodBarras) {
        this.CodBarras = CodBarras;
    }

    public Tercero getTercero() {
        return tercero;
    }

    public void setTercero(Tercero tercero) {
        this.tercero = tercero;
    }

    @Override
    public String toString() {
        return "Proveedor CodigoProvedor=" + CodigoProvedor + ", Catprovedor=" + Catprovedor + ", CodBarras=" + CodBarras + ", tercero=" + tercero;
    }

}
