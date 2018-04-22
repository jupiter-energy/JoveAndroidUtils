package com.jove.android.control;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

import java.util.HashMap;

/**
 * 通用的列表 (下拉刷新, 加载更多，空背景VIEW 等。)
 * @author gleamy
 */
public class CommonRecyclerView extends RecyclerView {

    public CommonRecyclerView(Context context) {
        super(context);
    }

    public CommonRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CommonRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public class Config {
        /**
         * 列表试图种类
         */
        private HashMap<Integer, EViewHolder> viewHolders = new HashMap<>(5);
    }

    public interface Events {

    }

    public abstract static class EViewHolder extends ViewHolder {

        public EViewHolder(View itemView) {
            super(itemView);
        }

        /**
         * 绑定数据项
         * @param dataItem
         */
        public abstract void bindData(Object dataItem);
    }

    private static class EAdapter extends Adapter<EViewHolder> {

        @NonNull
        @Override
        public EViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(@NonNull EViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }

        @Override
        public int getItemViewType(int position) {
            return super.getItemViewType(position);
        }
    }
}
