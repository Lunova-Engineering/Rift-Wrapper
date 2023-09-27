package com.lunova.riftwrapper.model.user.match;

import com.lunova.riftwrapper.model.user.UserObject;

public class MatchPosition extends UserObject {

    private int y;
    private int x;
    private MatchPosition(Builder builder) {
        this.y = builder.y;
        this.x = builder.x;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public static class Builder {
        private int y;
        private int x;

        public int getY() {
            return y;
        }

        public Builder setY(int y) {
            this.y = y;
            return this;
        }

        public int getX() {
            return x;
        }

        public Builder setX(int x) {
            this.x = x;
            return this;
        }

        public MatchPosition build() {
            return new MatchPosition(this);
        }
    }
}
