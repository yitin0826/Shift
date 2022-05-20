package com.example.shift;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CalendarAdapter_2 extends RecyclerView.Adapter<CalendarViewHolder_2>
{
    private final ArrayList<String> daysOfMonth;
    private final CalendarAdapter_2.OnItemListener_2 onItemListener_2;
    public CalendarAdapter_2(ArrayList<String> daysOfMonth, CalendarAdapter_2.OnItemListener_2 onItemListener_2) {
        this.daysOfMonth = daysOfMonth;
        this.onItemListener_2 = onItemListener_2;
    }

    @NonNull
    @Override
    public CalendarViewHolder_2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.calendar_cell, parent, false);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) (parent.getHeight()*0.166666666);
        return new CalendarViewHolder_2(view, onItemListener_2);
    }

    @Override
    public void onBindViewHolder(@NonNull CalendarViewHolder_2 holder, int position) {
        holder.dayOfMonth.setText(daysOfMonth.get(position));
    }

    @Override
    public int getItemCount()
    {
        return daysOfMonth.size();
    }

    public interface OnItemListener_2
    {
        void onItemClick(int position, String dayText);
    }
}
