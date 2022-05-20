package com.example.shift;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CalendarViewHolder_2 extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public final TextView dayOfMonth;
    private final CalendarAdapter_2.OnItemListener_2 onItemListener_2;
    public CalendarViewHolder_2(@NonNull View itemView, CalendarAdapter_2.OnItemListener_2 onItemListener_2)
    {
        super(itemView);
        dayOfMonth = itemView.findViewById(R.id.cellDayText);
        this.onItemListener_2 = onItemListener_2;
        itemView.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        onItemListener_2.onItemClick(getAdapterPosition(),(String) dayOfMonth.getText());
    }
}
