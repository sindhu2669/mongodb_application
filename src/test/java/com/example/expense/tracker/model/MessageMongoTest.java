package com.example.expense.tracker.model;

import org.junit.jupiter.api.Test;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MessageMongoTest {

    @Test
    public void testIdAnnotation() throws NoSuchFieldException {
        assertFieldHasAnnotation("id", Id.class);
    }

    @Test
    public void testDocumentAnnotation() {
        assertClassHasAnnotation(Document.class);
    }

    private void assertFieldHasAnnotation(String fieldName, Class<? extends Annotation> annotationClass) throws NoSuchFieldException {
        Field field = MessageMongo.class.getDeclaredField(fieldName);
        assertTrue(field.isAnnotationPresent(annotationClass));
    }

    private void assertClassHasAnnotation(Class<? extends Annotation> annotationClass) {
        assertTrue(MessageMongo.class.isAnnotationPresent(annotationClass));
    }
}
