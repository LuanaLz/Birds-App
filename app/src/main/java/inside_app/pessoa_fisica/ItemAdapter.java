package inside_app.pessoa_fisica;

import android.app.Dialog;
import android.app.Fragment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.social.birds.R;

import java.util.List;

import model_app.Model;
import start_app.sc_choose_user;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    Context mContext;
    List<Model> itemList1;
    Dialog mDialog;


    public ItemAdapter(List<Model> itemList) {
        this.itemList1 = itemList;
    }

    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sc_event_row_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        viewHolder.btVolunteer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(mContext,"Teste!", Toast.LENGTH_SHORT).show();
            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHolder holder, int position) {

        holder.itemTitle.setText(itemList1.get(position).getTitle());
        holder.itemStatus.setText(itemList1.get(position).getStatus());
        holder.itemLocalization.setText(itemList1.get(position).getLocalization());
        holder.itemDatetime.setText(itemList1.get(position).getDatetime());
        holder.itemBenefits.setText(itemList1.get(position).getBenefits());
        holder.itemMaterials.setText(itemList1.get(position).getMaterials());
        holder.itemClassification.setText(itemList1.get(position).getClassification());



    }

    @Override
    public int getItemCount() {
        return itemList1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView itemTitle;
        TextView itemStatus;
        TextView itemLocalization;
        TextView itemDatetime;
        TextView itemBenefits;
        TextView itemMaterials;
        TextView itemClassification;
        Button btVolunteer;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemTitle = itemView.findViewById(R.id.tv_title_event);
            itemStatus = itemView.findViewById(R.id.tv_status_event);
            itemLocalization = itemView.findViewById(R.id.tv_localization_event);
            itemDatetime = itemView.findViewById(R.id.tv_data_time_event);
            itemBenefits = itemView.findViewById(R.id.tv_benefits_event);
            itemMaterials = itemView.findViewById(R.id.tv_materials_used_event);
            itemClassification = itemView.findViewById(R.id.tv_classification_event);

            btVolunteer = itemView.findViewById(R.id.bt_accept_volunteer);
        }
    }
}
