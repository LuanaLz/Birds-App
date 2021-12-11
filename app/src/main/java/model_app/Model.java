package model_app;

public class Model {
    String title;
    String status;
    String localization;
    String datetime;
    String benefits;
    String materials;
    String classification;

    public Model(String title , String status , String localization, String datetime, String benefits, String materials, String classification){
        this.title = title ;
        this.status = status ;
        this.localization = localization ;
        this.datetime = datetime ;
        this.benefits = benefits ;
        this.materials = materials ;
        this.classification = classification ;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }
}
