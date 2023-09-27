package com.lunova.riftwrapper.model.user.match;

import com.lunova.riftwrapper.model.user.UserObject;

import java.util.List;

public class MatchTimelineInfo extends UserObject {

    private int frameInterval;
    private List<MatchFrame> frames;

    private MatchTimelineInfo(Builder builder) {
        this.frameInterval = builder.frameInterval;
        this.frames = builder.frames;
    }

    public int getFrameInterval() {
        return frameInterval;
    }

    public List<MatchFrame> getFrames() {
        return frames;
    }

    public static class Builder {
        private int frameInterval;
        private List<MatchFrame> frames;

        public int getFrameInterval() {
            return frameInterval;
        }

        public Builder setFrameInterval(int frameInterval) {
            this.frameInterval = frameInterval;
            return this;
        }

        public List<MatchFrame> getFrames() {
            return frames;
        }

        public Builder setFrames(List<MatchFrame> frames) {
            this.frames = frames;
            return this;
        }

        public MatchTimelineInfo build() {
            return new MatchTimelineInfo(this);
        }
    }
}
