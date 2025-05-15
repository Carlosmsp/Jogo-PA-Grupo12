package br.com.jogoespacial.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import br.com.jogoespacial.JogoEspacial;

public class DesktopLauncher {
    public static void main (String[] args) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "Jogo Espacial";
        config.width = 1280; // Largura da tela
        config.height = 720; // Altura da tela
        new LwjglApplication(new JogoEspacial(), config);
    }
}