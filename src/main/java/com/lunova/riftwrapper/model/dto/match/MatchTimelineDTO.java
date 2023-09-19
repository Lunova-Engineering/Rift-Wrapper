package com.lunova.riftwrapper.model.dto.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lunova.riftwrapper.model.dto.DataTransferObject;

import java.util.List;

public class MatchTimelineDTO extends DataTransferObject {
    @JsonProperty("metadata")
    private MetaDataDTO metaData;
    private int frameInterval;
    private List<MatchFrameDTO> frames;

    public MetaDataDTO getMetaDataDTO() {
        return metaData;
    }

    public void setMetaDataDTO(MetaDataDTO metaDataDTO) {
        this.metaData = metaDataDTO;
    }

    public int getFrameInterval() {
        return frameInterval;
    }

    public void setFrameInterval(int frameInterval) {
        this.frameInterval = frameInterval;
    }

    public List<MatchFrameDTO> getFrames() {
        return frames;
    }

    public void setFrames(List<MatchFrameDTO> frames) {
        this.frames = frames;
    }
}
