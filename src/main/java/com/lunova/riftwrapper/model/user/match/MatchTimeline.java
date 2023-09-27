package com.lunova.riftwrapper.model.user.match;

import com.lunova.riftwrapper.model.user.UserObject;

public class MatchTimeline extends UserObject {
    private MetaData metaData;

    private MatchTimelineInfo info;

    private MatchTimeline(Builder builder) {
        this.metaData = builder.metaData;
        this.info = builder.info;
    }

    public MetaData getMetaData() {
        return metaData;
    }

    public MatchTimelineInfo getInfo() {
        return info;
    }

    public static class Builder {
        private MetaData metaData;

        private MatchTimelineInfo info;

        public Builder setMetaData(MetaData metaData) {
            this.metaData = metaData;
            return this;
        }

        public Builder setInfo(MatchTimelineInfo info) {
            this.info = info;
            return this;
        }

        public MetaData getMetaData() {
            return metaData;
        }

        public MatchTimelineInfo getInfo() {
            return info;
        }

        public MatchTimeline build() {
            return new MatchTimeline(this);
        }
    }
}
