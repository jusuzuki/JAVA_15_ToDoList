import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

public class TaskTest {

  @Test
  public void Task_instantiatesCorrectly_true() {
    Task myTask = new Task("Finish CD Organizer Project");
    assertEquals(true, myTask instanceof Task);
  }

  @Test
  public void task_instantiatesWithDescription_true() {
    Task myTask = new Task("Buy new non-ficiton book");
    assertEquals("Buy new non-ficiton book", myTask.getDescription());
  }

  @Test
  public void isCompleted_isFalseAfterInstantiaon_false() {
    Task myTask = new Task("Finish Tamagotchi project");
    assertEquals(false, myTask.isCompleted());
  }

  @Rule
    public ClearRule clearRule = new ClearRule();

}
