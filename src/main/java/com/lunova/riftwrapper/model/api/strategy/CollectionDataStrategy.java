package com.lunova.riftwrapper.model.api.strategy;

import com.lunova.riftwrapper.model.dto.DataTransferObject;
import com.lunova.riftwrapper.model.user.UserObject;

import java.lang.reflect.Type;
import java.util.Collection;

public interface CollectionDataStrategy<T extends DataTransferObject, U extends UserObject> extends SingleDataStrategy<T, U> {
    Type getDTOCollectionType();
    Collection<U> transform(Collection<T> dataTransferObjectCollection);
    Collection<U> getDefaultCollectionInstance();
}
