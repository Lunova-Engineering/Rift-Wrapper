package com.lunova.riftwrapper.model.user.match;

import com.lunova.riftwrapper.model.user.UserObject;

public class Match extends UserObject {
    private MetaData metaData;
    private Info info;

    private Match(Builder builder) {
        this.metaData = builder.metaData;
        this.info = builder.info;
    }

    public MetaData getMetaData() {
        return metaData;
    }

    public Info getInfo() {
        return info;
    }

    public static class Builder {
        private MetaData metaData;
        private Info info;

        public MetaData getMetaData() {
            return metaData;
        }

        public Builder setMetaData(MetaData metaData) {
            this.metaData = metaData;
            return this;
        }

        public Info getInfo() {
            return info;
        }

        public Builder setInfo(Info info) {
            this.info = info;
            return this;
        }

        public Match build() {
            return new Match(this);
        }
    }
}
