package start_app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.social.birds.R;

public class sc_choose_user extends Fragment {

    public sc_choose_user() { }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fg_choose_user, container, false);

        if (savedInstanceState == null) {
           // getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frameBottom, new sc_terms_of_use()).commit();
        }

        Button btPessoaFisica = v.findViewById(R.id.bt_pessoa_fisica);
        Button btPessoaJuridica = v.findViewById(R.id.bt_pessoa_juridica);

        btPessoaFisica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frameMain, new sc_login_pessoa_fisica()).commit();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frameBottom, new sc_terms_of_use()).commit();

            }
        });

        btPessoaJuridica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frameMain, new sc_login_pessoa_juridica()).commit();
            }
        });

        return v;
    }
}