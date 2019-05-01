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
    @Test
    public void getWeakness_forHeroesName_String() {
        main.java.Hero myHero = new main.java.Hero("mumo",40,"fire","liar");
        String expected = "liar";
        assertEquals(expected, myHero.getWeakness());
    }
    @Test
    public void getPower_forHeroesName_String() {
        main.java.Hero myHero = new main.java.Hero("mumo",40,"fire","liar");
        String expected = "fire";
        assertEquals(expected, myHero.getPower());
    }
    @Test
    public void getId_forHeroesName_int() {
        main.java.Hero.clear();
        main.java.Hero myHero = new main.java.Hero("mumo",40,"fire","liar");
        assertEquals(1, myHero.getId());
    }

}