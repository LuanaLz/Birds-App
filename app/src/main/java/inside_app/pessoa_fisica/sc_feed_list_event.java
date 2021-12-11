package inside_app.pessoa_fisica;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.social.birds.R;

import java.util.ArrayList;
import java.util.List;

import model_app.Model;

public class sc_feed_list_event extends Fragment {

    RecyclerView recyclerView;
    List<Model> itemList;

     public sc_feed_list_event() { }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fg_feed_list_event, container, false);

        recyclerView = v.findViewById(R.id.rv_list_event);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        //initData();

        recyclerView.setAdapter(new ItemAdapter(initData()));

        return v;

    }

    private List<Model> initData() {

         itemList = new ArrayList<>();
         itemList.add(new Model("Limpeza de praia", "Em andamento", "Balneario Camboriu/SC", "12/12/2021 10:00","Será sortiado Iphones", "Distribuição de sacolas, luvas e pegador de lixo", "Ambiental" ));
         itemList.add(new Model("Distribuição de cobertor para moradores de rua", "Encerrado", "São José/SC", "10/10/2021 15:00","Concorre a uma bicicleta", "", "Social" ));
         itemList.add(new Model("Ação Natalina - Distribuição de cestas básica", "Em andamento", "Itajaí/SC", "22/12/2021 09:30","Cupom de R$100 em compras do mercado Fort Atacadista", "", "Social" ));
         itemList.add(new Model("Plantio Coletivo", "Em andamento", "Brusque/SC", "18/12/2021 07:30","Concorra a 1(um) ano de produtos da Cacau Show", "Luvas e ferramentas para jardinagem", "Ambiental" ));
         itemList.add(new Model("Alimente um animalzinho", "Encerrado", "Florianópolis/SC", "11/11/2021 14:30","Cupom 250 reais em produtos Golden, o melhor alimento para o seu melhor amigo", "potes descartáveis e rações", "Social" ));

         return itemList;
    }


}