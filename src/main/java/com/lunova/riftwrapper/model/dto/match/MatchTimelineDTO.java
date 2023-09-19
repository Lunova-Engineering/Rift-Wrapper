package com.lunova.riftwrapper.model.dto.match;

import java.util.List;

public class MatchTimelineDTO {
    private MetaDataDTO metaData;
    private int frameInterval;
    private List<MatchFrameDTO> frames;

    public MatchTimelineDTO(MetaDataDTO metaData, int frameInterval, List<MatchFrameDTO> frames) {
        this.metaData = metaData;
        this.frameInterval = frameInterval;
        this.frames = frames;
    }

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
