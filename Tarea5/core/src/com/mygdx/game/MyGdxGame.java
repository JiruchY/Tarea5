package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;



public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Texture img2;
	Texture im3;
	Texture im4;
	Texture  im5;


	@Override
	public void create () {

		batch = new SpriteBatch();
		img = new Texture("grass.png");
		img2= new Texture("background.png");
		im3= new Texture("cloud.png");
		im4= new Texture("littleshrooms_0.png");
		im5= new Texture("tree2-final.png");

	}
	@Override
	public void resize (int width, int height) {


	}
	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img2, 0, 0);
		batch.draw(img, 50, 50);
		batch.draw(im3, 150,250);
		batch.draw(im4, 85,85 );
		batch.draw(im5, 300,500 );
		batch.end();
	}

}
