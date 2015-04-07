package com.frameworkium.config;

public enum SystemProperty {

    BROWSER("browser"),
    BROWSER_VERSION("browserVersion"),
    CAPTURE_URL("captureURL"),
    PLATFORM("platform"),
    PLATFORM_VERSION("platformVersion"),
    DEVICE_NAME("deviceName"),
    GRID_URL("gridURL"),
    BUILD("build"),
    APP_PATH("appPath"),
    SAUCE("sauce"),
    JIRA_URL("jiraURL"),
    JIRA_RESULT_VERSION("jiraResultVersion"),
    JIRA_CYCLE_REGEX("jiraCycleRegEx"),
    JQL_QUERY("jqlQuery"),
    SUT_NAME("sutName"),
    SUT_VERSION("sutVersion");

    private String value;

    private SystemProperty(String key) {
        this.value = System.getProperty(key);
    }

    public String getValue() {
        return value;
    }

    public boolean isSpecified() {
        return null != value && !value.isEmpty();
    }
}
