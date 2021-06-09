package com.yungnickyoung.minecraft.betterdungeons.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class BDConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ConfigGeneral general;
    public static final ConfigSpiderDungeon spiderDungeons;
    public static final ConfigSmallDungeons smallDungeons;

    static {
        BUILDER.push("YUNG's Better Dungeons");

        general = new ConfigGeneral(BUILDER);
        spiderDungeons = new ConfigSpiderDungeon(BUILDER);
        smallDungeons = new ConfigSmallDungeons(BUILDER);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
