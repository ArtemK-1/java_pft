package ru.stqa.pft.addressbook.tests.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.tests.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation(){
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGroupHelper().submitGroupForm();
    app.getGroupHelper().returnToGroupPage();
  }

}