import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeroTest {

    @Test
    public void Hero_instantiatesCorrectly_true() {
        main.java.Hero myHero = new main.java.Hero("Vick", 65, "madem", "madem");
        assertEquals(true, myHero instanceof main.java.Hero);
    }
}