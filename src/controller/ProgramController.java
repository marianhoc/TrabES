package controller;

import model.Material;
import view.ProgramView;

public class ProgramController {
	public static void IniciaPrograma() {
		String values = ProgramView.paginaCriacaoMaterial();
		String[] val = values.split(",");
		new Material(val[0],Integer.parseInt(val[1]),val[2]);
	    }
}


