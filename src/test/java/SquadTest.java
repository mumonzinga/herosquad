import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class SquadTest {

    @Test
    public void squad_instantiatesCorrectly_true() {
        Squad testSquad = new Squad("brightclub", 7, "creativity");
        assertEquals(true, testSquad instanceof Squad);
    }
    @Test
    public void getName_squadInstantiatesWithName_String() {
        Squad testSquad = new Squad("brightclub", 7, "creativity");
        assertEquals("brightclub", testSquad.getName());
    }
    @Test
    public void getSize_squadInstantiatesWithSize_int() {
        Squad testSquad = new Squad("brightclubs", 7, "creativity");
        assertEquals(7, testSquad.getSize());
    }
    @Test
    public void getCause_squadInstantiatesWithCause_String() {
        Squad testSquad = new Squad("brightclubs", 7, "creativity");
        assertEquals("creativity", testSquad.getCause());
    }
    @Test
    public void all_returnsAllInstancesOfSquad_true() {
        Squad firstSquad = new Squad("brightclubs", 7, "creativity");
        Squad secondSquad = new Squad("army", 4, "strong soldiers");
        assertEquals(true, Squad.all().contains(firstSquad));
        assertEquals(true, Squad.all().contains(secondSquad));
    }
    @Test
    public void clear_emptiesAllSquadsFromList_0() {
        Squad testSquad = new Squad("brightclubs", 7, "creativity");
        Squad.clear();
        assertEquals(Squad.all().size(), 0);
    }
    @Test
    public void getId_squadsInstantiatesWithAnId_1() {
        Squad.clear();
        Squad testSquad = new Squad("brightclubs", 7, "creativity");
        assertEquals(1, testSquad.getId());
    }

    @Test
    public void find_returnsSquadWithSameId_secondSquad() {
        Squad.clear();
        Squad firstSquad = new Squad("brightclubs", 7, "creativity");
        Squad secondSquad = new Squad("army", 4, "strong soldiers ");
        assertEquals(Squad.find(secondSquad.getId()), secondSquad);
    }

    @Test
    public void getHeroes_initiallyReturnsEmptyList_ArrayList() {
        Squad.clear();
        Squad testSquad = new Squad("brightclubs", 7, "creativity");
        assertEquals(0, testSquad.getHeroes().size());
    }
    @Test
    public void addHero_addsHeroToList_true() {
        Squad testSquad = new Squad("brightclubs", 7, "creativity");
        main.java.Hero testHero = new main.java.Hero("panther", 20, "intelligent", "anger stricken");
        testSquad.addHero(testHero);
        assertTrue(testSquad.getHeroes().contains(testHero));
    }

    @Test
    public void heroAlreadyExists_checksIfHeroExistsinSquads_true() {
        Squad testSquad = new Squad("brightclubs", 7, "creativity");
        main.java.Hero testHero = new main.java.Hero("panther", 20, "intelligent", "anger stricken");
        testSquad.addHero(testHero);
        assertTrue(testSquad.heroAlreadyExists(testHero));


    }
}