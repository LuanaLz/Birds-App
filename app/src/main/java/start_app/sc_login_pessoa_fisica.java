package start_app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.social.birds.R;

import inside_app.sc_feed_pessoa_fisica;


public class sc_login_pessoa_fisica extends Fragment {


    public sc_login_pessoa_fisica() { }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v = inflater.inflate(R.layout.fg_login_pessoa_fisica, container, false);

        Button btLoginGoogle = v.findViewById(R.id.bt_login_google);
        Button btCancel = v.findViewById(R.id.bt_cancel);

        btCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frameMain, new sc_choose_user()).commit();
            }
        });

        //Inserir condição se logado !

        btLoginGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frameMain, new sc_feed_pessoa_fisica()).commit();

            }
        });

       return v;
    }
}