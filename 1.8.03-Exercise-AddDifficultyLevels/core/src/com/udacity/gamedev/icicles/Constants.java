package com.udacity.gamedev.icicles;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Vector2;


public class Constants {
    public static final float WORLD_SIZE = 10.0f;
    public static final Color BACKGROUND_COLOR = Color.BLUE;

    public static final float PLAYER_HEAD_RADIUS = 0.5f;
    public static final float PLAYER_HEAD_HEIGHT = 4.0f * PLAYER_HEAD_RADIUS;
    public static final float PLAYER_LIMB_WIDTH = 0.1f;
    public static final int PLAYER_HEAD_SEGMENTS = 20;
    public static final Color PLAYER_COLOR = Color.BLACK;
    public static final float PLAYER_MOVEMENT_SPEED = 10.0f;

    public static final float ACCELEROMETER_SENSITIVITY = 0.5f;
    public static final float GRAVITATIONAL_ACCELERATION = 9.8f;

    public static final float ICICLES_HEIGHT = 1.0f;
    public static final float ICICLES_WIDTH = 0.5f;
    public static final Vector2 ICICLES_ACCELERATION = new Vector2(0, -5.0f);
    public static final float ICICLE_SPAWNS_PER_SECOND = 10.0f;
    public static final Color ICICLE_COLOR = Color.WHITE;

    public static final float HUD_FONT_REFERENCE_SCREEN_SIZE = 480.0f;
    public static final float HUD_MARGIN = 20.0f;

    // TODO: Create constants for difficulty labels ("Cold", "Colder", "Coldest")


    // TODO: Create constants for the icicle spawn rates for the various difficulties


    // TODO: Create Difficulty enum holding the spawn rate and label for each difficulty
    enum Difficulty {
        EASY("Cold", 5),
        NORMAL("Colder", 10),
        HARD("Coldest", 20);

        public final String label;
        public final int spawnRate;

        Difficulty(String label, int spawnRate) {
            this.label = label;
            this.spawnRate = spawnRate;
        }
    }

}
