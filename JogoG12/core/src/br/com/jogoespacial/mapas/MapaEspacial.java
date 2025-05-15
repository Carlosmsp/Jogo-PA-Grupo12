package br.com.jogoespacial.mapas;

import br.com.jogoespacial.entidades.Planeta;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.utils.Array;

public class MapaEspacial {
    private TiledMap mapa;
    private Array<Planeta> planetas;

    public MapaEspacial(String caminhoMapa) {
        this.mapa = new TmxMapLoader().load(caminhoMapa);
        this.planetas = new Array<>();
        carregarPlanetas();
    }

    private void carregarPlanetas() {
        // Lógica para carregar planetas do mapa
        // Exemplo: adicionar planetas à lista de planetas
    }

    public TiledMap getMapa() {
        return mapa;
    }

    public Array<Planeta> getPlanetas() {
        return planetas;
    }

    public void verificarColisoes() {
        // Lógica para verificar colisões entre a nave e os planetas
    }

    public void dispose() {
        mapa.dispose();
        for (Planeta planeta : planetas) {
            planeta.dispose();
        }
    }
}