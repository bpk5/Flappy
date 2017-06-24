package com.mygdx.bpk5.states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by bpk on 24.06.17.
 */

public class PlayState extends State {
    private Texture bird;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        bird = new Texture("bird.png");
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(bird, 50, 50);
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
