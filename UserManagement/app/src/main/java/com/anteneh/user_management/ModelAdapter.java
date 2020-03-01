package com.anteneh.user_management;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.MyViewHolder> {
private List tableModels ;
private Context context ;
public ModelAdapter(List tableModels,Context context   ){

    this.tableModels =tableModels;
    this.context =context;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_name,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder( MyViewHolder holder, int position) {
        TableModel tableModel = (TableModel) tableModels.get(position);
      holder.FirstName.setText(tableModel.getFIRST_NAME());
        holder.SecondName.setText(tableModel.getSECOND_NAME());
    }

    @Override
    public int getItemCount() {
    return tableModels.size();

    }
   public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView FirstName,SecondName;


       public MyViewHolder( View itemView) {
           super(itemView);

           FirstName=itemView.findViewById(R.id.firstname);
           SecondName=itemView.findViewById(R.id.secondname);
           itemView.setOnClickListener(this);
           itemView.setOnLongClickListener(new View.OnLongClickListener() {
               @Override
               public boolean onLongClick(View v) {
                   tableModels.remove(getAdapterPosition());
                   notifyItemRemoved(getAdapterPosition());



                   return true;
               }
           });

       }

       @Override
       public void onClick(View v) {
           Intent intent = new Intent(context,UserDetail.class);
           TableModel tableModel=(TableModel) tableModels.get(getAdapterPosition());
           String[] user_detail={tableModel.getFIRST_NAME()+tableModel.getSECOND_NAME(),
                   tableModel.getEMAIL(),tableModel.getGENDER(),tableModel.getUSER_NAME(),tableModel.getMOBILE(),tableModel.getUSER_PASS()};
           intent.putExtra("user",user_detail);
           context.startActivity(intent);
       }
   }
}





