public class ReportCard {

    private String materia;
    private double nota;

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return  "Materia:'" + materia + '\'' +
                ", Nota:" + nota ;
    }

    public ReportCard(String materia, double nota) {
        this.materia = materia;
        this.nota = nota;
    }
}
