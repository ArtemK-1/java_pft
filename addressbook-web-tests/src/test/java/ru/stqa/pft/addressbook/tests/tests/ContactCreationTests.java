package ru.stqa.pft.addressbook.tests.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.tests.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation(){
    app.initContactCreation();
    app.fillContactForm(new ContactData("Ivan", "Ivanov", "iv", "+79001230001", "mail@mail.ru"));
    app.saveContact();
  }

}
