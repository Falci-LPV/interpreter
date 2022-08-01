public class Skill {
    private double danoBase;
    private double danoCritico;
    private double danoElemental;
    private double danoFisico;

    public double getDanoBase() {
        return danoBase;
    }

    public void setDanoBase(double danoBase) {
        this.danoBase = danoBase;
    }

    public double getDanoCritico() {
        return danoCritico;
    }

    public void setDanoCritico(double danoCritico) {
        this.danoCritico = danoCritico;
    }

    public double getDanoElemental() {
        return danoElemental;
    }

    public void setDanoElemental(double danoElemental) {
        this.danoElemental = danoElemental;
    }

    public double getDanoFisico() {
        return danoFisico;
    }

    public void setDanoFisico(double danoFisico) {
        this.danoFisico = danoFisico;
    }

    public double calcularDano() {
        return DanoSkill.calcularDano(this.danoBase, this.danoCritico, this.danoElemental, this.danoFisico);
    }
}
