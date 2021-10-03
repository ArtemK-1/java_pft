package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class ContactCreationTests extends TestBase{

  @Test
  public void testContactCreation(){
    initContactCreation();
    fillContactForm(new ContactData("Ivan", "Ivanov", "iv", "+79001230001", "mail@mail.ru"));
    saveContact();
  }

}
