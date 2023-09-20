package com.lunova.riftwrapper.model.dto.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lunova.riftwrapper.model.dto.DataTransferObject;

public class MatchDTO extends DataTransferObject {
    @JsonProperty("metadata")
    private MetaDataDTO metaData;
    private InfoDTO info;

    public MetaDataDTO getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaDataDTO metaData) {
        this.metaData = metaData;
    }

    public InfoDTO getInfo() {
        return info;
    }

    public void setInfo(InfoDTO info) {
        this.info = info;
    }
}
