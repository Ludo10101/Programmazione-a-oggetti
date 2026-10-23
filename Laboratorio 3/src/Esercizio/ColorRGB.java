package Esercizio;

public class ColorRGB {
	private int col[];
	
	public ColorRGB(int red, int green, int blue) {
		col=new int[3];
		col[Color.RED.ordinal()]=red%256;
		col[Color.GREEN.ordinal()]=green%256;
		col[Color.BLUE.ordinal()]=blue%256;
	}
	public int getComponent(Color colo) {
		return col[colo.ordinal()];
	}
	public int[] getCol() {
		return col;
	}
	public void setCol(int[] col) {
		this.col = col;
	}
	
}
