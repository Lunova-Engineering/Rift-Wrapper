package com.lunova.riftwrapper.model.user.match;

import com.lunova.riftwrapper.model.user.UserObject;

public class PerkStyleSelection extends UserObject {
    private int perk, var1, var2, var3;

    private PerkStyleSelection(Builder builder) {
        this.perk = builder.perk;
        this.var1 = builder.var1;
        this.var2 = builder.var2;
        this.var3 = builder.var3;
    }

    public int getPerk() {
        return perk;
    }

    public int getVar1() {
        return var1;
    }

    public int getVar2() {
        return var2;
    }

    public int getVar3() {
        return var3;
    }

    public static class Builder {
        private int perk, var1, var2, var3;

        public int getPerk() {
            return perk;
        }

        public Builder setPerk(int perk) {
            this.perk = perk;
            return this;
        }

        public int getVar1() {
            return var1;
        }

        public Builder setVar1(int var1) {
            this.var1 = var1;
            return this;
        }

        public int getVar2() {
            return var2;
        }

        public Builder setVar2(int var2) {
            this.var2 = var2;
            return this;
        }

        public int getVar3() {
            return var3;
        }

        public Builder setVar3(int var3) {
            this.var3 = var3;
            return this;
        }

        public PerkStyleSelection build() {
            return new PerkStyleSelection(this);
        }
    }
}
