package no.mehl.libgdx.map.info.tilefactory;

import no.mehl.libgdx.map.info.AbstractTileInfo;

/**
 * Wires map to the MapQuest back end
 * http://developer.mapquest.com/web/products/open/map
 */
public class MapQuestTileFactoryInfo extends AbstractTileInfo {

    private static final int max = 18;

    public MapQuestTileFactoryInfo() {
        super("MapQuest",
                1, max, max,
                256, true, true, 					// tile size is 256 and x/y orientation is normal
                "http://otile1.mqcdn.com/tiles/1.0.0/map",
                "x", "y", "z");						// 5/15/10.png
    }

    @Override
    public String getTileUrl(int x, int y, int zoom) {
        // zoom = max - zoom;
        String url = this.baseURL + "/" + zoom + "/" + x + "/" + y + ".png";
        return url;
    }

}
