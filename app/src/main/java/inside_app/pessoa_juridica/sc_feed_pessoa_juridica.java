package inside_app.pessoa_juridica;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.social.birds.R;

import start_app.sc_login_pessoa_fisica;


public class sc_feed_pessoa_juridica extends Fragment {

    public sc_feed_pessoa_juridica() {  }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fg_feed_pessoa_juridica, container, false);

        Button btAddEvent = v.findViewById(R.id.bt_add_new_event);

        btAddEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frameMain, new sc_add_event_pj()).commit();

            }
        });

        return v;
    }
}