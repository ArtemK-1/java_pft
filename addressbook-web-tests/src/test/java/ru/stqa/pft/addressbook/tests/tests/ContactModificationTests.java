package ru.stqa.pft.addressbook.tests.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.tests.model.ContactData;

public class ContactModificationTests extends TestBase{

  @Test
  public void testContactModification(){
    app.getNavigationHelper().gotoHomePage();
    if (!app.getContactHelper().isThereAContact()){
      app.getContactHelper().createContact(new ContactData(
              "Ivan",
              "Ivanov",
              "iv",
              "+79001230001",
              "mail@mail.ru",
              "test1"),true);
    }
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData(
            "Ivan edit",
            "Ivanov edit",
            "iv",
            "+79001230001",
            "mail@mail.ru",
            null),false);
    app.getContactHelper().updateContact();
  }
}
