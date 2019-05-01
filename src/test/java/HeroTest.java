import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeroTest {

    @Test
    public void Hero_instantiatesCorrectly_true() {
        main.java.Hero myHero = new main.java.Hero("mumo", 40, "fire", "liar");
        assertEquals(true, myHero instanceof main.java.Hero);
    }
    @Test
    public void getName_forHeroesName_String() {
        main.java.Hero myHero = new main.java.Hero("mumo",40,"fire","liar");
        String expected = "mumo";
        assertEquals(expected, myHero.getName());
    }
    @Test
    public void getAge_forHeroesName_String() {
        main.java.Hero myHero = new main.java.Hero("mumo",40,"fire","liar");
        int expected = 40;
        assertEquals(expected, myHero.getAge());
    }
}