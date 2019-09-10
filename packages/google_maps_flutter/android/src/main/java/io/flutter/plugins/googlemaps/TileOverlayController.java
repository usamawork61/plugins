package io.flutter.plugins.googlemaps;

import com.google.android.libraries.maps.model.TileOverlay;
import com.google.android.libraries.maps.model.TileProvider;

public class TileOverlayController implements TileOverlaySink {

    private final TileOverlay tileOverlay;

    public TileOverlayController(TileOverlay tileOverlay) {
        this.tileOverlay = tileOverlay;
    }

    void remove() {
        tileOverlay.remove();
    }

    @Override
    public void setFadeIn(boolean fadeIn) {
        tileOverlay.setFadeIn(fadeIn);
    }

    @Override
    public void setTransparency(float transparency) {
        tileOverlay.setTransparency(transparency);
    }

    @Override
    public void setZIndex(float zIndex) {
        tileOverlay.setZIndex(zIndex);
    }

    @Override
    public void setVisible(boolean visible) {
        tileOverlay.setVisible(visible);
    }

    @Override
    public void setTileProvider(TileProvider tileProvider) {
        // You can not change tile provider after creation
    }

}
