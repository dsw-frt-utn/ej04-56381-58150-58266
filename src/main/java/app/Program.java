package app;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
import views.ListarVehiculosView;
import views.RegitrarVehiculoView;


public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();
ListarVehiculosView listar = new ListarVehiculosView();
RegitrarVehiculoView registrar = new RegitrarVehiculoView(listar);
        listar.setVisible(true);
        registrar.setVisible(true);
    }
}
