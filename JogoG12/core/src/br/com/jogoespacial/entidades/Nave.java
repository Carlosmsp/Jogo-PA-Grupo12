package br.com.jogoespacial.entidades;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Nave {
    private Texture texturaNave;
    private Vector2 posicao;
    private float velocidade;

    public Nave() {
        this.texturaNave = new Texture(Gdx.files.internal("imagens/nave.png"));
        this.posicao = new Vector2(Gdx.graphics.getWidth() / 2 - texturaNave.getWidth() / 2, Gdx.graphics.getHeight() / 2 - texturaNave.getHeight() / 2);
        this.velocidade = 300; // velocidade da nave em pixels por segundo
    }

    public void mover(float delta) {
        if (Gdx.input.isKeyPressed(com.badlogic.gdx.Input.Keys.LEFT)) {
            posicao.x -= velocidade * delta;
        }
        if (Gdx.input.isKeyPressed(com.badlogic.gdx.Input.Keys.RIGHT)) {
            posicao.x += velocidade * delta;
        }
        if (Gdx.input.isKeyPressed(com.badlogic.gdx.Input.Keys.UP)) {
            posicao.y += velocidade * delta;
        }
        if (Gdx.input.isKeyPressed(com.badlogic.gdx.Input.Keys.DOWN)) {
            posicao.y -= velocidade * delta;
        }

        // Limitar a nave dentro da tela
        posicao.x = Math.max(0, Math.min(posicao.x, Gdx.graphics.getWidth() - texturaNave.getWidth()));
        posicao.y = Math.max(0, Math.min(posicao.y, Gdx.graphics.getHeight() - texturaNave.getHeight()));
    }

    public void renderizar(SpriteBatch batch) {
        batch.draw(texturaNave, posicao.x, posicao.y);
    }

    public void dispose() {
        texturaNave.dispose();
    }

    public Vector2 getPosicao() {
        return posicao;
    }
}