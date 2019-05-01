import org.junit.*;
import static org.junit.Assert.*;
public class SquadTest {

    @Test
    public void squad_instantiatesCorrectly_true() {
        Squad testSquad = new Squad("nerdsClub", 5, "Computer illiteracy");
        assertEquals(true, testSquad instanceof Squad);
    }
    @Test
    public void getName_squadInstantiatesWithName_String() {
        Squad testSquad = new Squad("nerdsClub", 5, "Computer illiteracy");
        assertEquals("nerdsClub", testSquad.getName());
    }
    @Test
    public void getSize_squadInstantiatesWithSize_int() {
        Squad testSquad = new Squad("nerdsClubs", 5, "Computer illiteracy");
        assertEquals(5, testSquad.getSize());
    }
    @Test
    public void getCause_squadInstantiatesWithCause_String() {
        Squad testSquad = new Squad("nerdsClubs", 5, "Computer illiteracy");
        assertEquals("nerdsClubs", testSquad.getCause());
    }
}