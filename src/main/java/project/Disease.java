package project;

public class Disease {
    String typeOfDisease;      //viral ,heredietery,
    String diseaseName;       //cold

    public String getTypeOfDisease() {
        return typeOfDisease;
    }

    public void setTypeOfDisease(String typeOfDisease) {
        this.typeOfDisease = typeOfDisease;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    @Override
    public String toString() {
        return "Disease{" +
                "typeOfDisease='" + typeOfDisease + '\'' +
                ", diseaseName='" + diseaseName + '\'' +
                '}';
    }
}
