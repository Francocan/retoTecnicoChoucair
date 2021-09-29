package co.com.choucair.retotecnico.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestObject {
    public static final Target BUTTON_JOIN = Target.the("Join Today")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up'][contains(.,'Join Today')]"));
    public static final Target INPUT_FN = Target.the("FIRST NAME")
            .located(By.xpath("//input[contains(@name,'firstName')]"));
    public static final Target INPUT_LN = Target.the("LAST NAME")
            .located(By.xpath("//input[contains(@name,'lastName')]"));
    public static final Target INPUT_EMAIL = Target.the("EMAIL")
            .located(By.xpath("//input[contains(@name,'email')]"));
    public static final Target BUTTON_DB = Target.the("DATE OF BIRTH")
            .located(By.xpath("//select[contains(@ng-model,'registrationData.birthDate.month')]"));
    public static final Target BUTTON_DAY = Target.the("DAY")
            .located(By.xpath("//select[contains(@ng-model,'registrationData.birthDate.day')]"));
    public static final Target BUTTON_YEAR = Target.the("YEAR")
            .located(By.xpath("//select[contains(@ng-model,'registrationData.birthDate.year')]"));
    public static final Target BUTTON_LANGUAGE = Target.the("LANGUAGES")
            .located(By.xpath("//input[contains(@type,'search')]"));
    public static final Target BUTTON_SPANISH = Target.the("SPOKEN SPANISH")
            .located(By.xpath("//div[@ng-bind-html='language.name | highlight: $select.search'][contains(.,'Spanish')]"));
    public static final Target BUTTON_NEXT1 = Target.the("NEXT LOCATION")
            .located(By.xpath("//span[contains(.,'Next: Location')]"));
    public static final Target INPUT_CITY = Target.the("CITY")
            .located(By.xpath("//input[contains(@id,'city')]"));
    public static final Target INPUT_POSTAL = Target.the("POSTAL")
            .located(By.xpath("//input[contains(@ng-blur,'geocodeAddress()')]"));
    public static final Target BUTTON_COUNTRY = Target.the("COUNTRY")
            .located(By.xpath("//span[@tabindex='-1'][contains(.,'Select a country')]"));
    public static final Target BUTTON_COL = Target.the("COUNTRY")
            .located(By.xpath("//div[@ng-bind-html='country.name | highlight: $select.search'][contains(.,'Colombia')]"));
    public static final Target BUTTON_ND = Target.the("NEXT DEVICE")
            .located(By.xpath("//span[@aria-hidden='true'][contains(.,'Next: Devices')]"));
    public static final Target BUTTON_YCPT = Target.the("YOUR COMPUTER")
            .located(By.xpath("(//i[contains(@class,'caret pull-right')])[1]"));
    public static final Target BUTTON_WINDOWS = Target.the("YOUR COMPUTER WINDOWS")
            .located(By.xpath("//div[@ng-bind-html='device.name | highlight: $select.search'][contains(.,'Windows')]"));
    public static final Target BUTTON_VERSION = Target.the("VERSION")
            .located(By.xpath("(//i[contains(@class,'caret pull-right')])[2]"));
    public static final Target BUTTON_VESIONIN = Target.the("VERSION 10")
            .located(By.xpath("(//div[@ng-bind-html='version.name | highlight: $select.search'][contains(.,'10')])[2]"));
    public static final Target BUTTON_LANGUAGUE2 = Target.the("LANGUAGE2")
            .located(By.xpath("(//i[contains(@class,'caret pull-right')])[3]"));
    public static final Target BUTTON_LANGUAGUESPANISH = Target.the("LANGUAGE2 SPANISH")
            .located(By.xpath("//div[@ng-bind-html='language.name | highlight: $select.search'][contains(.,'Spanish')]"));
    public static final Target BUTTON_MOBILE = Target.the("YOUR MOBILE DEVICE")
            .located(By.xpath("(//i[contains(@class,'caret pull-right')])[4]"));
    public static final Target BUTTON_MOBILEHW = Target.the("YOUR MOBILE DEVICE iPhone")
            .located(By.xpath("//div[@ng-bind-html='device.name | highlight: $select.search'][contains(.,'Apple')]"));
    public static final Target BUTTON_MODEL = Target.the("MODEL")
            .located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/div[1]/span[1]/span[1]"));
    public static final Target BUTTON_MODELCLICK = Target.the("MODEL 4")
            .located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/input[1]"));
    public static final Target BUTTON_CLICKIPHONE = Target.the("CLICK_IPHONE")
            .located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/ul[1]/li[1]/div[3]/span[1]/div[1]"));
    public static final Target BUTTON_OPSYSCLICK = Target.the("CLICK EN OPSYS")
            .located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div[1]/span[1]/span[1]"));
    public static final Target BUTTON_OPSYSCLICKIOS = Target.the("CLICK EN IOS")
            .located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/input[1]"));
    public static final Target BUTTON_OPSYS113 = Target.the("CLICK EN IOS 11.3")
            .located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/ul[1]/li[1]/div[3]/span[1]/div[1]/span[1]"));
    public static final Target BUTTON_NEXTLSTEP = Target.the("NEXT DEVICE")
            .located(By.xpath("//span[contains(.,'Next: Last Step')]"));
    public static final Target BUTTON_PASSWORD = Target.the("CLICK PASSWORD")
            .located(By.xpath("//input[contains(@name,'password')]"));
    public static final Target BUTTON_PASSWORD_CONFIRM = Target.the("CONFIRM PASSWORD_CONFIRM")
            .located(By.xpath("//input[contains(@name,'confirmPassword')]"));
    public static final Target CLICK_ACCEPT_TERMS = Target.the("CLICK ACCEPT")
            .located(By.xpath("//span[contains(@ng-class,'{error: userForm.termOfUse.$error.required}')]"));
    public static final Target CLICK_PRIVACY_SECURITY = Target.the("CLICK PRIVACY")
            .located(By.xpath("//span[contains(@ng-class,'{error: userForm.privacySetting.$error.required}')]"));
    public static final Target BUTTON_COMPLETE = Target.the("COMPLETE SETUP")
            .located(By.xpath("//a[contains(@aria-label,'Complete Setup')]"));
    public static final Target BUTTON_LOGIN = Target.the("SIGN IN")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__link'][contains(.,'Log In')]"));

}
