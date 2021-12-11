package start_app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.social.birds.R;

import inside_app.pessoa_juridica.sc_feed_pessoa_juridica;

public class sc_login_pessoa_juridica extends Fragment {

    public sc_login_pessoa_juridica() {}


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fg_login_pessoa_juridica, container, false);

       Button btCancelPj = v.findViewById(R.id.bt_cancel);
       Button btLoginPj = v.findViewById(R.id.bt_login_pj);

       btCancelPj.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frameMain, new sc_choose_user()).commit();
           }
       });

       btLoginPj.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frameMain, new sc_feed_pessoa_juridica()).commit();
           }
       });

        return v;
    }
}