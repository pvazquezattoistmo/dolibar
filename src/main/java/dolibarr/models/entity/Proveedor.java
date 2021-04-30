package dolibarr.models.entity;

public class Proveedor extends Tercero {

    private int CodigoProvedor;
    private EtiquetaCategoria Catprovedor;
    private String CodBarras;

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

}
