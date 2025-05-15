package br.com.jogoespacial.entidades;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

public class Planeta {
    private Vector2 posicao; // Posição do planeta
    private Texture textura; // Textura do planeta
    private Sprite sprite; // Sprite do planeta
    private float tamanho; // Tamanho do planeta

    public Planeta(float x, float y, float tamanho, String caminhoTextura) {
        this.posicao = new Vector2(x, y);
        this.tamanho = tamanho;
        this.textura = new Texture(caminhoTextura);
        this.sprite = new Sprite(textura);
        this.sprite.setSize(tamanho, tamanho);
        this.sprite.setPosition(x, y);
    }

    public void renderizar() {
        sprite.draw(/* batch de renderização */);
    }

    public Vector2 getPosicao() {
        return posicao;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void dispose() {
        textura.dispose(); // Libera a textura quando não for mais necessária
    }
}