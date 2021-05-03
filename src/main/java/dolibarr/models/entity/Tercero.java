package dolibarr.models.entity;

public class Tercero {

    private int id;
    private String NombreSimple;
    private String Tipo;
    private String direccion;
    private int CodPostal;
    private String pais;
    private String provincia;
    private String rfc;
    private String rpimms;
    private int impuesto;
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

    public String getTipo() {
        return Tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCodPostal() {
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

    public int getImpuesto() {
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

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCodPostal(int CodPostal) {
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

    public void setImpuesto(int impuesto) {
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

    public void setId_tercero(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_tercero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
