package io.flutter.plugins.googlemaps;


import com.google.android.libraries.maps.model.TileOverlayOptions;
import com.google.android.libraries.maps.model.TileProvider;

public class TileOverlayBuilder implements TileOverlaySink {
    private final TileOverlayOptions tileOverlayOptions;

    TileOverlayBuilder() {
        this.tileOverlayOptions = new TileOverlayOptions();
    }

    TileOverlayOptions build() {
        return tileOverlayOptions;
    }

    @Override
    public void setFadeIn(boolean fadeIn) {
        tileOverlayOptions.fadeIn(fadeIn);
    }

    @Override
    public void setTransparency(float transparency) {
        tileOverlayOptions.transparency(transparency);
    }

    @Override
    public void setZIndex(float zIndex) {
        tileOverlayOptions.zIndex(zIndex);
    }

    @Override
    public void setVisible(boolean visible) {
        tileOverlayOptions.visible(visible);
    }

    @Override
    public void setTileProvider(TileProvider tileProvider) {
        tileOverlayOptions.tileProvider(tileProvider);
    }

}
