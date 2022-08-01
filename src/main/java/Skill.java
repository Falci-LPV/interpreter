public class Skill {
    private double danoBase;
    private double danoCritico;
    private double danoElemental;
    private double danoFísico;

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

    public double getDanoFísico() {
        return danoFísico;
    }

    public void setDanoFísico(double danoFísico) {
        this.danoFísico = danoFísico;
    }

    public double calcularDano() {
        return DanoSkill.calcularDano(this.danoBase, this.danoCritico, this.danoElemental, this.danoFísico);
    }
}
