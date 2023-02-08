package menu_information;

import java.io.Serializable;

import javax.swing.ImageIcon;

public class CoffeeProperties implements Serializable {
	private String Name;
	private String Explain;
	private ImageIcon imgicon;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getExplain() {
		return Explain;
	}

	public void setExplain(String explain) {
		Explain = explain;
	}

	public ImageIcon getImgicon() {
		return imgicon;
	}

	public void setImgicon(ImageIcon imgicon) {
		this.imgicon = imgicon;
	}

} // end of class
