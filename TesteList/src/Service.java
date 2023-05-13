import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Service {
    
    private List<ControleDeGastosModel> listControleDeGastosModel;

    public Service (){
        this.listControleDeGastosModel = new ArrayList<>();
    }

    public void delete(ControleDeGastosModel controleDeGastosModel) {
       this.listControleDeGastosModel.remove(controleDeGastosModel);
       
    }

    public ControleDeGastosModel save(ControleDeGastosModel controleDeGastosModel) {
        this.listControleDeGastosModel.add(controleDeGastosModel);
        ControleDeGastosModel model = listControleDeGastosModel.get(0);
        return model;
    }

}
