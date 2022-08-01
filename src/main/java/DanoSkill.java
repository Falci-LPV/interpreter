public class DanoSkill {
    public static String formula = "danoBase + danoElemental + danoFisico * danoCritico";

    public static double calcularDano(double danoBase, double danoCritico, double danoElemental, double danoFisico) {
        String expressao;
        expressao = formula.replace("danoBase", Double.toString(danoBase));
        expressao = expressao.replace("danoElemental", Double.toString(danoElemental));
        expressao = expressao.replace("danoFisico", Double.toString(danoFisico));
        expressao = expressao.replace("danoCritico", Double.toString(danoCritico));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
