package com.lunova.riftwrapper.model.dto.match;

import com.lunova.riftwrapper.model.dto.DataTransferObject;

import java.util.List;

public class MatchTimelineInfoDTO extends DataTransferObject {

    private int frameInterval;
    private List<MatchFrameDTO> frames;

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
