import java.awt.Color;
import java.util.Random;

public class Square extends Shape {
	
	private int shapeWidth;
	
	public Square(int shapeWidth){
		// TODO Constructor
		this.shapeWidth = shapeWidth;
	}
	
	
	@Override
	public Color getRandomColor() {		
		// TODO Return random color produce from java.util.Random;
		// Java 'Color' class takes 3 floats, from 0 to 1.
		Random random = new Random();
		float r,g,b;
		Color a;
		r = random.nextFloat();
		g = random.nextFloat();
		b = random.nextFloat();
		if (r<0) r = -r;
		if (g<0) g = -g;
		if (b<0) b = -b;
		while (r>1) r--;
		while (g>1) g--;
		while (b>1) b--;
		a = new Color(r,g,b);
		// TODO Return color produced by three rgb floats.
		return a;
	}
	
	@Override
	public int getShapeWidth(){
		// TODO Return Square width
		return shapeWidth;
	}
	
	@Override
	public int getShapeHeight(){
		// TODO Return Square height
		return shapeWidth;
	}


	@Override
	public int getCenterX(int mouseX) {
		// TODO Input mouse X position and return center X of square
		return mouseX - shapeWidth/2;
	}


	@Override
	public int getCenterY(int mouseY) {
		// TODO Input mouse Y position and return center Y of square
		return mouseY - shapeWidth/2;
	}


}