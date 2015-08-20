import org.fluentlenium.adapter.FluentTest;
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.*;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.fluentlenium.core.filter.FilterConstructor.*;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {

  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Task List");
  }
  //
  // @Test
  //   public void taskIsCreatedTest() {
  //     goTo("http://localhost:4567/");
  //     click("a", withText("Add a new task"));
  //     fill("#description").with("Finish homework");
  //     submit(".btn");
  //     assertThat(pageSource()).contains("Your task has been saved.");
  //   }
  //
  // @Test
  // public void taskIsDisplayedTest() {
  //   goTo("http://localhost:4567/tasks/new");
  //   fill("#description").with("Finish Tom Robbins book");
  //   submit(".btn");
  //   click("a", withText("View all tasks"));
  //   assertThat(pageSource()).contains("Finish Tom Robbins book");
  // }
  //
  // @Test
  // public void multipleTasksAreDisplayedTest() {
  //   goTo("http://localhost:4567/tasks/new");
  //   fill("#description").with("Epicodus homework");
  //   submit(".btn");
  //   goTo("http://localhost:4567/tasks/new");
  //   fill("#description").with("Buy new Neil Gaiman book");
  //   submit(".btn");
  //   click("a", withText("View all tasks"));
  //   assertThat(pageSource()).contains("Epicodus homework");
  //   assertThat(pageSource()).contains("Buy new Neil Gaiman book");
  // }
  //
  // @Test
  // public void taskShowPageDisplaysDescription() {
  //   goTo("http://localhost:4567/tasks/new");
  //   fill("#description").with("Do the dishes");
  //   submit(".btn");
  //   click("a", withText("View all tasks"));
  //   click("a", withText("Do the dishes"));
  //   assertThat(pageSource()).contains("Do the dishes");
  // }

  

}
