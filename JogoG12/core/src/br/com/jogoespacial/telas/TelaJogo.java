package br.com.jogoespacial.telas;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import br.com.jogoespacial.JogoEspacial;
import br.com.jogoespacial.entidades.Nave;
import br.com.jogoespacial.mapas.MapaEspacial;

public class TelaJogo implements Screen {

    private JogoEspacial jogo;
    private OrthographicCamera camera;
    private SpriteBatch batch;
    private Nave nave;
    private MapaEspacial mapa;

    public TelaJogo(JogoEspacial jogo) {
        this.jogo = jogo;
        this.camera = new OrthographicCamera();
        this.batch = new SpriteBatch();
        this.nave = new Nave();
        this.mapa = new MapaEspacial();
    }

    @Override
    public void show() {
        // Inicializa a tela do jogo
        camera.setToOrtho(false, 800, 600); // Define a projeção da câmera
        nave.inicializar(); // Inicializa a nave
        mapa.carregar(); // Carrega o mapa espacial
    }

    @Override
    public void render(float delta) {
        // Limpa a tela
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // Atualiza a lógica do jogo
        nave.atualizar(delta);
        mapa.atualizar(delta);

        // Renderiza os elementos na tela
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        mapa.render(batch);
        nave.render(batch);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {
        camera.setToOrtho(false, width, height);
    }

    @Override
    public void pause() {
        // Lógica para pausar o jogo
    }

    @Override
    public void resume() {
        // Lógica para retomar o jogo
    }

    @Override
    public void hide() {
        // Lógica para esconder a tela
    }

    @Override
    public void dispose() {
        batch.dispose();
        nave.dispose();
        mapa.dispose();
    }
}