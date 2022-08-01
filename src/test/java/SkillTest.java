import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SkillTest {
    @Test
    void deveCalcularExpressaoComFormula() {
        Skill skill = new Skill();
        skill.setDanoBase(100.0);
        skill.setDanoCritico(1.25);
        skill.setDanoElemental(1000.0);
        skill.setDanoFísico(900.0);

        assertEquals(2500.0, skill.calcularDano());
    }

}