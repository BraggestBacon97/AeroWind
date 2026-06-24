package net.bacon97.aerowind.core;

import net.minecraft.world.phys.Vec2;

public class WindManager {
    public static Vec2 getWind(long worldTime) {
        float timeFactor = (float) (worldTime * 0.00005);
        float windX = (float) Math.sin(timeFactor);
        float windZ = (float) Math.cos(timeFactor * 0.7);
        Vec2 windVec = new Vec2(windX, windZ).normalize();
        float gustFactor = 0.7f + 0.3f * (float) Math.sin(worldTime * 0.001);
        return windVec.scale(gustFactor);
    }

    public static int getWindAngleDegrees(long worldTime) {
        Vec2 wind = getWind(worldTime);
        double angleRad = Math.atan2(wind.x, wind.y);
        double angleDeg = Math.toDegrees(angleRad);
        return (int) ((angleDeg + 360) % 360);
    }
}