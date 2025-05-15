package br.com.jogoespacial.telas;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import br.com.jogoespacial.JogoEspacial;

public class TelaMenu implements Screen {
    private JogoEspacial jogo;
    private Stage stage;
    private Skin skin;
    private Texture fundoMenu;

    public TelaMenu(JogoEspacial jogo) {
        this.jogo = jogo;
        this.stage = new Stage();
        Gdx.input.setInputProcessor(stage);
        this.skin = new Skin(Gdx.files.internal("uiskin.json"));
        this.fundoMenu = new Texture("imagens/fundo_menu.png");

        criarBotoes();
    }

    private void criarBotoes() {
        TextButton botaoIniciar = new TextButton("Iniciar Jogo", skin);
        botaoIniciar.setPosition(400, 300);
        botaoIniciar.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                jogo.setScreen(new TelaJogo(jogo));
            }
        });

        stage.addActor(botaoIniciar);
    }

    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        SpriteBatch batch = jogo.getBatch();
        batch.begin();
        batch.draw(fundoMenu, 0, 0);
        batch.end();

        stage.act(delta);
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        stage.getViewport().update(width, height, true);
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void hide() {
    }

    @Override
    public void dispose() {
        stage.dispose();
        skin.dispose();
        fundoMenu.dispose();
    }
}