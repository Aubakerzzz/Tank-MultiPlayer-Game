package tankgame.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.ImageObserver;

/* This is where the scrolling background is drawn*/
public class Background extends BackgroundObject {
	int w, h;

	public Background(int w, int h, Point speed, Image img) {
		super(new Point(0,0), speed, img);
		this.img = img;
		this.w = w;
		this.h = h;
	}
	
    public void update(int w, int h) {
    }
	
    public void draw(Graphics g, ImageObserver obs) {
        int TileWidth = img.getWidth(obs);
        int TileHeight = img.getHeight(obs);

        int NumberX = (int) (w / TileWidth);
        int NumberY = (int) (h / TileHeight);

        for (int i = -1; i <= NumberY; i++) {
            for (int j = 0; j <= NumberX; j++) {
                g.drawImage(img, j * TileWidth, i * TileHeight + (TileHeight), TileWidth, TileHeight, obs);
            }
        }
    }
	
	

}
