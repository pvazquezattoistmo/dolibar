package dolibar.entity;

public class Tercero {

    private int id;
    private String nombreSimple;
    private String direccion;
    private String codPostal;
    private String pais;
    private String provincia;
    private String rfc;
    private String rpimms;
    private String impuesto;
    private String tipoTercero;
    private String formaJuridica;
    private String inconterms;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreSimple() {
        return nombreSimple;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCodPostal() {
        return codPostal;
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
        return formaJuridica;
    }

    public String getInconterms() {
        return inconterms;
    }

    public void setNombreSimple(String NombreSimple) {
        this.nombreSimple = NombreSimple;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCodPostal(String CodPostal) {
        this.codPostal = CodPostal;
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
        this.formaJuridica = FormaJuridica;
    }

    public void setInconterms(String inconterms) {
        this.inconterms = inconterms;
    }

    @Override
    public String toString() {
        return "Tercero id=" + id + ", nombreSimple=" + nombreSimple + ", direccion=" + direccion + ", codPostal=" + codPostal + ", pais=" + pais + ", provincia=" + provincia + ", rfc=" + rfc + ", rpimms=" + rpimms + ", impuesto=" + impuesto + ", tipoTercero=" + tipoTercero + ", formaJuridica=" + formaJuridica + ", inconterms=" + inconterms;
    }

}
