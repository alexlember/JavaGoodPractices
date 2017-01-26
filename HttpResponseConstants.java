package ru.prime.server.business.utils;

import ru.prime.server.business.entity.Spread;
import ru.prime.server.business.entity.Spread1;

import java.util.Arrays;
import java.util.List;

public enum HttpResponseConstants {

    SPREAD(Spread.class.getSimpleName(), Spread.class),
    SPREAD1(Spread1.class.getSimpleName(), Spread1.class),
    ;

    private Class clazz;
    private String value;

    HttpResponseConstants(String value, Class clazz) {
        this.value = value;
        this.clazz = clazz;
    }

    // Все енумы в качестве списка для простоты анализа.
    private static List<HttpResponseConstants> enumsAsList = Arrays.asList(HttpResponseConstants.values());

    /**
     * Метод возвращает необходимое перечислимое по классу, если такое имеется.
     * @param clazz перечислимое для объекта какого класса необходимо.
     * @return нужное перечислимое или null, если такого нет.
     */
    public static HttpResponseConstants getEnumByClassIfExist(Class clazz) {
        for (HttpResponseConstants httpResponseConstant : enumsAsList) {
            if (clazz.equals(httpResponseConstant.getClazz())) {
                return httpResponseConstant;
            }
        }
        return null;
    }

    /**
     * Метод возвращает необходимое перечислимое по имени, если такое имеется.
     * @param value перечислимое для объекта с каким именем необходимо.
     * @return нужное перечислимое или null, если такого нет.
     */
    public static HttpResponseConstants getEnumByNameIfExist(String value) {
        for (HttpResponseConstants httpResponseConstant : enumsAsList) {
            if (value.equals(httpResponseConstant.getValue())) {
                return httpResponseConstant;
            }
        }
        return null;
    }

    public String getValue() {
        return value;
    }

    public Class getClazz() {
        return clazz;
    }
}
