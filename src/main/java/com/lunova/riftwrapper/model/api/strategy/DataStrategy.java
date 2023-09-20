package com.lunova.riftwrapper.model.api.strategy;

import com.fasterxml.jackson.core.type.TypeReference;
import com.lunova.riftwrapper.model.dto.DataTransferObject;
import com.lunova.riftwrapper.model.user.UserObject;

public interface DataStrategy <DTO extends DataTransferObject, USER extends UserObject> {
    TypeReference<DTO> getDeserializeType();
    DTO transform(USER userObject);
    USER transform(DTO dataTransferObject);
    DTO getDefaultDataInstance();
    USER getDefaultUserInstance();
}
