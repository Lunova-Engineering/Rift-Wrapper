package com.lunova.riftwrapper.model.dto.match;

import com.lunova.riftwrapper.model.dto.DataTransferObject;

public class ObjectiveDTO extends DataTransferObject {
    private boolean first;
    private int kills;

    public ObjectiveDTO(boolean first, int kills) {
        this.first = first;
        this.kills = kills;
    }

    public ObjectiveDTO() {

    }

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }
}
