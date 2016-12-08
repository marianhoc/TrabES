package controller;

import java.io.IOException;
import model.Material;
import view.ProgramView;

public class ProgramController {
	public static void IniciaPrograma() {
            String continua = "S";
            while(continua.equalsIgnoreCase("S")){
		String values = ProgramView.paginaCriacaoMaterial();
		Material material = new Material(values);
                boolean sucesso = material.gravaObjeto();
                if (sucesso){
                    ProgramView.paginaMaterialCriadoComSucesso();
                }
                else {
                    ProgramView.paginaMaterialNaoPodeSerCriado();
                }
                continua = ProgramView.paginaContinua();
	    }
        }
}


