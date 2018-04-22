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
 * 通用的列表 (下拉刷新, 加载更多，空背景VIEW 等)
 * @author gleamy
 * @date 2018-04-22.
 */
public class CommonRecyclerView extends RecyclerView {

    /**
     * 应用级别的默认配置
     */
    private static Config appDefaultConfig = null;

    /**
     * 设置应用级的默认配置
     * @param config
     */
    public static void setAppDefaultConfig(Config config){
        appDefaultConfig = config;
    }

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
         * 列表视图种类，也就是ViewType所对应的Holder
         */
        private HashMap<Integer, EViewHolder> viewHolders = new HashMap<>(5);

        /**
         * 数据为空时的背景填充视图。 可以为空（空白背景）
         */
        private View emptyFillView;

        /**
         * 下拉刷新视图。 可以为空（使用默认视图）
         */
        private View pullRefreshView;

        /**
         * 载入更多时的视图。可以为空（使用默认视图）
         */
        private View loadMoveView;

        /**
         * 没有更视图。可以为空（使用默认视图）
         */
        private View noMoveView;
    }

    public interface Events {
        /**
         * @param parent
         * @param viewType 暂时计划这个里的viewType为数据项的class.hashCode, 即：item.getClass().hashCode();
         * @return
         */
        @NonNull
        EViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType);

        /**
         * 刷新 或 下拉刷新
         */
        void onRefresh();
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
