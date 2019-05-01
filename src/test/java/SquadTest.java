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

}