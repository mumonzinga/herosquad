import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeroTest {

    @Test
    public void Hero_instantiatesCorrectly_true() {
        main.java.Hero myHero = new main.java.Hero("mumo", 65, "fire", "liar");
        assertEquals(true, myHero instanceof main.java.Hero);
    }
    @Test
    public void getName_forHeroesName_String() {
        main.java.Hero myHero = new main.java.Hero("mumo",65,"fire","liar");
        String expected = "mumo";
        assertEquals(expected, myHero.getName());
    }
}