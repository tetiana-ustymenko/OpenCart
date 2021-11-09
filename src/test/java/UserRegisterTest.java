import enums.URLs;
import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;
import steps.RegisterPageBL;

import static enums.URLs.BASE_URL;

public class UserRegisterTest extends BaseTest {

    @Test
    public void registerUserWithValidParameters() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson();
        registerPageBL.verifyUserRegistration();
    }
}