package com.example.joaquinchou.bikesguide.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.amap.api.navi.model.AMapNaviGuide;
import com.example.joaquinchou.bikesguide.R;
import com.example.joaquinchou.bikesguide.utils.MapUtils;

import java.util.List;


public class RouteDetailAdapter extends RecyclerView.Adapter<RouteDetailAdapter.ViewHolder> {

    private List<AMapNaviGuide> aMapNaviGuideList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView text_detail;

        public ViewHolder(View view){
            super(view);
            text_detail=(TextView)view.findViewById(R.id.text_detail);
        }
    }

    public RouteDetailAdapter(List<AMapNaviGuide> aMapNaviGuideList){
        this.aMapNaviGuideList=aMapNaviGuideList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_detail, parent, false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        AMapNaviGuide guide=aMapNaviGuideList.get(position);
        StringBuilder stringBuilder=new StringBuilder();
        if(!guide.getName().equals("无名道路"))
            stringBuilder.append("沿"+guide.getName());
        stringBuilder.append("行进"+ MapUtils.getLengthStr(guide.getLength()));
        if(MapUtils.getActionStr(guide.getIconType())!=null){
            stringBuilder.append("后"+MapUtils.getActionStr(guide.getIconType()));
        }
        holder.text_detail.setText(stringBuilder);
    }

    @Override
    public int getItemCount() {
        return aMapNaviGuideList.size();
    }
}
