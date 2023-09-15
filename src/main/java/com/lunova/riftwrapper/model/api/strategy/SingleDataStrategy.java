package com.lunova.riftwrapper.model.api.strategy;

import com.lunova.riftwrapper.model.dto.DataTransferObject;
import com.lunova.riftwrapper.model.user.UserObject;

public interface SingleDataStrategy<T extends DataTransferObject, U extends UserObject> {
    Class<T> getDTOClass();
    T transform(U userObject);
    U transform(T dataTransferObject);
    U getDefaultInstance();
}
