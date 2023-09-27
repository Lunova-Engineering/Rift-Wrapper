package com.lunova.riftwrapper.model.dto.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lunova.riftwrapper.model.dto.DataTransferObject;

public class MatchTimelineDTO extends DataTransferObject {
    @JsonProperty("metadata")
    private MetaDataDTO metaData;

    private MatchTimelineInfoDTO info;

    public MetaDataDTO getMetaData() {
        return metaData;
    }

    public MatchTimelineDTO setMetaData(MetaDataDTO metaData) {
        this.metaData = metaData;
        return this;
    }

    public MatchTimelineInfoDTO getInfo() {
        return info;
    }

    public MatchTimelineDTO setInfo(MatchTimelineInfoDTO info) {
        this.info = info;
        return this;
    }
}
