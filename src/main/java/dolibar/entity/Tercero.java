package dolibar.entity;

public class Tercero {

    private int id;
    private String NombreSimple;
    private String direccion;
    private String CodPostal;
    private String pais;
    private String provincia;
    private String rfc;
    private String rpimms;
    private String impuesto;
    private String tipoTercero;
    private String FormaJuridica;
    private String inconterms;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreSimple() {
        return NombreSimple;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCodPostal() {
        return CodPostal;
    }

    public String getPais() {
        return pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getRfc() {
        return rfc;
    }

    public String getRpimms() {
        return rpimms;
    }

    public String getImpuesto() {
        return impuesto;
    }

    public String getTipoTercero() {
        return tipoTercero;
    }

    public String getFormaJuridica() {
        return FormaJuridica;
    }

    public String getInconterms() {
        return inconterms;
    }

    public void setNombreSimple(String NombreSimple) {
        this.NombreSimple = NombreSimple;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCodPostal(String CodPostal) {
        this.CodPostal = CodPostal;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public void setRpimms(String rpimms) {
        this.rpimms = rpimms;
    }

    public void setImpuesto(String impuesto) {
        this.impuesto = impuesto;
    }

    public void setTipoTercero(String tipoTercero) {
        this.tipoTercero = tipoTercero;
    }

    public void setFormaJuridica(String FormaJuridica) {
        this.FormaJuridica = FormaJuridica;
    }

    public void setInconterms(String inconterms) {
        this.inconterms = inconterms;
    }

    @Override
    public String toString() {
        return "Tercero id=" + id + ", NombreSimple=" + NombreSimple + ", direccion=" + direccion + ", CodPostal=" + CodPostal + ", pais=" + pais + ", provincia=" + provincia + ", rfc=" + rfc + ", rpimms=" + rpimms + ", impuesto=" + impuesto + ", tipoTercero=" + tipoTercero + ", FormaJuridica=" + FormaJuridica + ", inconterms=" + inconterms;
    }

}
