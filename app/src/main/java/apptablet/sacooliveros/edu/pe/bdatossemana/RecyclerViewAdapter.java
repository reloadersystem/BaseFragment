package apptablet.sacooliveros.edu.pe.bdatossemana;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<Model> mModelList;

    public RecyclerViewAdapter(Context mContext, List<Model> mModelList) {
        this.mContext = mContext;
        this.mModelList = mModelList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.item_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Model model= mModelList.get(position);

        holder.textView.setText(model.getText());

        boolean habilita= model.isHabilitar();

        if(habilita)
        {
            holder.textView.setEnabled(false);
            holder.textView.setBackgroundColor(Color.GRAY);
            holder.textView.setTextColor(Color.DKGRAY);
        }
        else
        {
            holder.textView.setEnabled(true);
        }



        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

    }

    @Override
    public int getItemCount() {
        return mModelList==null ? 0 : mModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private View view;
        private TextView textView;

        public MyViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            textView = itemView.findViewById(R.id.text_view);
        }
    }
}
