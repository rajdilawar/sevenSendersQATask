package org.rajdilawar.properties;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {
    private Properties configuration;


    public Configuration() throws IOException {
        loadConfig();
    }

    private void loadConfig() throws IOException {

        configuration = new Properties();
        final InputStream inputStream = getClass().getClassLoader().getResourceAsStream("config.properties");
        final BufferedInputStream stream = new BufferedInputStream(inputStream);
        configuration.load(stream);
        stream.close();
    }
    public String baseurl() {

        return configuration.getProperty("base_url");
    }
    public String shopPageUrl() {

        return configuration.getProperty("shop_url");
    }
    public String loginPageUrl() {

        return configuration.getProperty("loginPage_url");
    }

    public String planPageUrl() {

        return configuration.getProperty("planPage_url");
    }

    public String email() {

        return configuration.getProperty("email");
    }
    public String displayName() {

        return configuration.getProperty("displayName");
    }
    public String password() {

        return configuration.getProperty("password");
    }
    public String browserName() {

        return configuration.getProperty("browser");
    }
}