package inside_app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.social.birds.R;

public class sc_feed_pessoa_fisica extends Fragment {

    public sc_feed_pessoa_fisica() { }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if (savedInstanceState == null) {
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frameSearch, new sc_search_feed()).commit();
        }

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fg_feed_pessoa_fisica, container, false);
    }
}