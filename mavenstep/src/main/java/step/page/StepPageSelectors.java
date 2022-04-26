package step.page;

public class StepPageSelectors {
    public String keywordsTabLink = "[ng-click=\"setView('functions')\"]";
    public String parametersTabLink = "[ng-click=\"setView('parameters')\"]";
    public String executionsTabLink = "[ng-click=\"setView('executions')\"]";
    public String schedulerTabLink = "[ng-click=\"setView('scheduler')\"]";

    public String keywordsTabVerifier = "//*[text()='New keyword']";
    public String parametersTabVerifier = "//*[text()='New parameter']";
    public String executionsTabVerifier = "//*[contains(text(), 'Execution list')]";
    public String schedulerTabVerifier = "//*[text()='New task']";


}
