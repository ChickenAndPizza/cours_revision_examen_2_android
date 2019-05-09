package com.example.a533.revision_examen_2;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class JobRecyclerAdapter extends RecyclerView.Adapter<JobRecyclerAdapter.MyViewHolder> {
    List<JobOfferModel> jobList;

    public JobRecyclerAdapter(List<JobOfferModel> toDoList){
        this.jobList = toDoList;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        TextView description;
        TextView salary;
        Button remove;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tv_title);
            description = itemView.findViewById(R.id.tv_description);
            salary = itemView.findViewById(R.id.tv_salary);
            remove = itemView.findViewById(R.id.btn_remove);
        }
    }


    @NonNull
    @Override
    public JobRecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.job_card, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull JobRecyclerAdapter.MyViewHolder holder, final int position) {
        JobOfferModel jobDisplay = jobList.get(position);
        holder.title.setText(jobDisplay.getTitle());
        holder.description.setText(jobDisplay.getDescription());
        holder.salary.setText(jobDisplay.getSalary().toString());
        holder.remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jobList.remove(position);
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return jobList.size();
    }
}
