package org.apache.cmueller.sample.bundle;

import static org.junit.Assert.*;

import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;

public class CustomBundleTest {

    @Test
    public void bundleDe() {
        Locale currentLocale = new Locale("de");
        ResourceBundle bundle = ResourceBundle.getBundle("application", currentLocale);

        assertEquals("Vorname", bundle.getString("label1"));
        assertEquals("Mittelname", bundle.getString("label2"));
        assertEquals("Nachname", bundle.getString("label3"));
    }

    @Test
    public void bundleDeDE() {
        Locale currentLocale = new Locale("de", "DE");
        ResourceBundle bundle = ResourceBundle.getBundle("application", currentLocale);

        assertEquals("Vorname", bundle.getString("label1"));
        assertEquals("Mittelname_DE", bundle.getString("label2"));
        assertEquals("Nachname", bundle.getString("label3"));
    }

    @Test
    public void bundleDeDE9600() {
        Locale currentLocale = new Locale("de", "DE", "9600");
        ResourceBundle bundle = ResourceBundle.getBundle("application", currentLocale);

        assertEquals("Vorname", bundle.getString("label1"));
        assertEquals("Mittelname_DE", bundle.getString("label2"));
        assertEquals("Nachname_DE_9600", bundle.getString("label3"));
    }

    @Test
    public void bundleEn() {
        Locale currentLocale = new Locale("en");
        ResourceBundle bundle = ResourceBundle.getBundle("application", currentLocale);

        assertEquals("Firstname", bundle.getString("label1"));
        assertEquals("Midname", bundle.getString("label2"));
        assertEquals("Surname", bundle.getString("label3"));
    }

    @Test
    public void bundleEn9600() {
        Locale currentLocale = new Locale("en", "", "9600");
        ResourceBundle bundle = ResourceBundle.getBundle("application", currentLocale);

        assertEquals("Firstname", bundle.getString("label1"));
        assertEquals("Midname", bundle.getString("label2"));
        assertEquals("Surname_9600", bundle.getString("label3"));
    }
}