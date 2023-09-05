package com.metorrite.riftwrapper.model.data.dto.league.match;

public class Match {
    private MetaData metaData;
    private Info info;

    public Match(MetaData metaData, Info info) {
        this.metaData = metaData;
        this.info = info;
    }

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }
}
