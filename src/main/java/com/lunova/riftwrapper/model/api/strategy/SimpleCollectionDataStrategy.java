package com.lunova.riftwrapper.model.api.strategy;

import java.lang.reflect.Type;
import java.util.Collection;

public interface SimpleCollectionDataStrategy<T extends Collection<?>> {
    abstract Type getDeserializeType();
    abstract T getDefaultCollection();
}
