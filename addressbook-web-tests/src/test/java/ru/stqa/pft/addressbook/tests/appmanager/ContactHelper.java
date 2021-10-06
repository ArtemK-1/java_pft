package ru.stqa.pft.addressbook.tests.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.tests.model.ContactData;


public class ContactHelper extends HelperBase {
  //private FirefoxDriver wd;

  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void saveContact() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"), contactData.getFirstName());
    type(By.name("lastname"), contactData.getLastName());
    type(By.name("nickname"), contactData.getNickName());
    type(By.name("home"), contactData.getHomePhone());
    type(By.name("email"), contactData.getEmail());
  }

  public void initContactCreation() {
    wd.findElement(By.linkText("add new")).click();
  }
}
