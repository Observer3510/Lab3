package org.translation;

import org.junit.Test;

import static org.junit.Assert.*;

public class JSONTranslationExampleTest {

    private JSONTranslationExample jsonTranslationExample = new JSONTranslationExample();

    @Test
    public void getCountryNameTranslation() {
        String expected = jsonTranslationExample.getCanadaCountryNameSpanishTranslation();
        String result = jsonTranslationExample.getCountryNameTranslation("can", "es");
        assertEquals("Translating 'can' to 'es' should be " + expected + " but was " + result, expected, result);
    }

    @Test
    public void getJapanNameTranslation() {
        String expected = jsonTranslationExample.getJapanCountryNameBasqueTranslation();
        String result = jsonTranslationExample.getCountryNameTranslation("jpn", "eu");
        assertEquals("Translating 'can' to 'es' should be " + expected + " but was " + result, expected, result);
    }
}