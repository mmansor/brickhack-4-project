package space.gui.sprites;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;

import space.gui.Sprite;

public class SpriteRegistry {

	private HashMap<String, Sprite> sprites = new HashMap<String, Sprite>();
	
	private static SpriteRegistry instance = null;
	public static SpriteRegistry getSpriteRegistry() {
		if(instance == null) {
			instance = new SpriteRegistry();
		}
		
		return instance;
	}
	
	private SpriteRegistry() {
		
	}
	
	public Sprite getSprite(String id) {
		if(!sprites.containsKey(id)) {
			Sprite sprite;
			try {
				String path = "/sprites/" + id + ".png";
				sprite = new PngSprite(ImageIO.read(getClass().getResourceAsStream(path)));
			} catch (IOException e) {
				return null;
			}
			sprites.put(id, sprite);
		}
		
		return sprites.get(id);
	}
	
	private static class PngSprite implements Sprite {

		BufferedImage image = null;
		
		PngSprite(BufferedImage image) {
			this.image = image;
		}
		
		@Override
		public BufferedImage getImage() {
			return image;
		}
		
	}
}
