package step.localhost;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

public class TestAllTabs extends TestBase{

    @Test
    public void verifyKeyboardTabIsLoading() {
        step.clickKeywordTabLink();
        step.verifyKeywordTabIsLoaded();
    }

    @Test
    public void verifyParametersTabIsLoading() {
        step.clickParametersTabLink();
        step.verifyParametersTabIsLoaded();
    }

    @Test
    public void verifyExecutionsTabIsLoading() {
        step.clickExecutionsTabLink();
        step.verifyExecutionsTabIsLoaded();
    }

    @Test
    public void verifySchedulerTabIsLoading() {
        step.clickSchedulerTabLink();
        step.verifySchedulerTabIsLoaded();
    }
}
