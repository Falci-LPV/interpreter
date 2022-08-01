public class DanoSkill {
    public static String formula = "danoBase + danoElemental + danoFísico * danoCritico";

    public static double calcularDano(double danoBase, double danoCritico, double danoElemental, double danoFísico) {
        String expressao;
        expressao = formula.replace("danoBase", Double.toString(danoBase));
        expressao = expressao.replace("danoElemental", Double.toString(danoElemental));
        expressao = expressao.replace("danoFísico", Double.toString(danoFísico));
        expressao = expressao.replace("danoCritico", Double.toString(danoCritico));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
