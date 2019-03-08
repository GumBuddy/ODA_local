package DTOs;

import javax.persistence.OneToOne;
import java.util.Objects;

@javax.persistence.Entity
@javax.persistence.Table(name = "objetoAprendizaje", schema = "dbo", catalog = "ODA_local")
public class DTO_ObjetoAprendizaje {
    private int idOa;
    private String nomOa;
    private Object duracionOa;
    private String objetivoOa;
    private String descripcionOa;
    private String enlace;
    @OneToOne
    private DTO_Autor autor;
    @OneToOne
    private DTO_Licenciatura licenciatura;
    @OneToOne
    private DTO_Subcategoria subcategoria;
    @OneToOne
    private DTO_Subcompetencia subcompetencia;
    @OneToOne
    private DTO_TipoObjeto tipo;
    @OneToOne
    private DTO_UnidadAprendizaje UnidadAprendizaje;

    public DTO_Autor getAutor() {
        return autor;
    }

    public void setAutor(DTO_Autor autor) {
        this.autor = autor;
    }

    public DTO_Licenciatura getLicenciatura() {
        return licenciatura;
    }

    public void setLicenciatura(DTO_Licenciatura licenciatura) {
        this.licenciatura = licenciatura;
    }

    public DTO_Subcategoria getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(DTO_Subcategoria subcategoria) {
        this.subcategoria = subcategoria;
    }

    public DTO_Subcompetencia getSubcompetencia() {
        return subcompetencia;
    }

    public void setSubcompetencia(DTO_Subcompetencia subcompetencia) {
        this.subcompetencia = subcompetencia;
    }

    public DTO_TipoObjeto getTipo() {
        return tipo;
    }

    public void setTipo(DTO_TipoObjeto tipo) {
        this.tipo = tipo;
    }

    public DTO_UnidadAprendizaje getUnidadAprendizaje() {
        return UnidadAprendizaje;
    }

    public void setUnidadAprendizaje(DTO_UnidadAprendizaje unidadAprendizaje) {
        UnidadAprendizaje = unidadAprendizaje;
    }

    @javax.persistence.Id
    @javax.persistence.Column(name = "id_OA", nullable = false)
    public int getIdOa() {
        return idOa;
    }

    public void setIdOa(int idOa) {
        this.idOa = idOa;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "nom_OA", nullable = false, length = 100)
    public String getNomOa() {
        return nomOa;
    }

    public void setNomOa(String nomOa) {
        this.nomOa = nomOa;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "duracion_OA", nullable = false)
    public Object getDuracionOa() {
        return duracionOa;
    }

    public void setDuracionOa(Object duracionOa) {
        this.duracionOa = duracionOa;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "objetivo_OA", nullable = false, length = 500)
    public String getObjetivoOa() {
        return objetivoOa;
    }

    public void setObjetivoOa(String objetivoOa) {
        this.objetivoOa = objetivoOa;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "descripcion_OA", nullable = false, length = 500)
    public String getDescripcionOa() {
        return descripcionOa;
    }

    public void setDescripcionOa(String descripcionOa) {
        this.descripcionOa = descripcionOa;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "enlace", nullable = false, length = 300)
    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DTO_ObjetoAprendizaje that = (DTO_ObjetoAprendizaje) o;
        return idOa == that.idOa &&
                Objects.equals(nomOa, that.nomOa) &&
                Objects.equals(duracionOa, that.duracionOa) &&
                Objects.equals(objetivoOa, that.objetivoOa) &&
                Objects.equals(descripcionOa, that.descripcionOa) &&
                Objects.equals(enlace, that.enlace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOa, nomOa, duracionOa, objetivoOa, descripcionOa, enlace);
    }
}
