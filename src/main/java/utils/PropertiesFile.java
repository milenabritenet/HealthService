package utils;

import Tests.DoctorListTest;
import Tests.HealthServiceHomePageTest;
import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {
    public static void readPropertiesFile() throws IOException {
        Properties prop = new Properties();
        InputStream input = new FileInputStream("\\src\\test\\java\\Tests\\test.properties");
        prop.load(input);
        HealthServiceHomePageTest.url=prop.getProperty("URL");
        DoctorListTest.url= prop.getProperty("URL");
    }

/*
    public static Configuration loadProperties() throws ConfigurationException {
        Configurations configs = new Configurations();
        return configs.properties("src//test//test.properties");
        loadProperties()
    }

    public static void main(String[] args) throws ConfigurationException {
        Configuration config = loadProperties();
        config.getString("driver");
        config.getBoolean("isDev");
        HealthServiceHomePageTest.url=config.getString("URL");
        config.getString("driverPath");

    }*/
}

//comment

