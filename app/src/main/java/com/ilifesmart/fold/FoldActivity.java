package com.ilifesmart.fold;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ilifesmart.model.FoldData;
import com.ilifesmart.model.MOBase;
import com.ilifesmart.weather.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FoldActivity extends AppCompatActivity {

	private static final List<FoldData> mFoldData = new ArrayList<>();

	static {
		mFoldData.clear();

		List<FoldData> emptyData = new ArrayList<>();
		List<FoldData<String>> OneData = new ArrayList<>();
		OneData.add(new FoldData.FoldBuilder<MOBase>().build());

		List<FoldData<String>> TwoData = new ArrayList<>();
		TwoData.add(new FoldData.FoldBuilder<MOBase>().build());
		TwoData.add(new FoldData.FoldBuilder<MOBase>().build());

		List<FoldData<String>> ThreeData = new ArrayList<>();
		ThreeData.add(new FoldData.FoldBuilder<MOBase>().build());
		ThreeData.add(new FoldData.FoldBuilder<MOBase>().build());
		ThreeData.add(new FoldData.FoldBuilder<MOBase>().build());

		mFoldData.add(new FoldData.FoldBuilder<MOBase>().title("测试1").selected(true).mods(emptyData).build());
		mFoldData.add(new FoldData.FoldBuilder<MOBase>().title("测试2").selected(true).mods(emptyData).build());

		mFoldData.add(new FoldData.FoldBuilder<MOBase>().title("测试3").selected(true).mods(OneData).build());
		mFoldData.add(new FoldData.FoldBuilder<MOBase>().title("测试4").selected(false).mods(OneData).build());

		mFoldData.add(new FoldData.FoldBuilder<MOBase>().title("测试5").selected(false).mods(TwoData).build());
		mFoldData.add(new FoldData.FoldBuilder<MOBase>().title("测试6").selected(true).mods(TwoData).build());

		mFoldData.add(new FoldData.FoldBuilder<MOBase>().title("测试7").selected(true).mods(ThreeData).build());
		mFoldData.add(new FoldData.FoldBuilder<MOBase>().title("测试8").selected(true).mods(ThreeData).build());
	}

	@BindView(R.id.foldContainer)
	RecyclerView mFoldContainer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fold);
		ButterKnife.bind(this);

		FoldAdapter adapter = new FoldAdapter(new OnItemClickCallback() {
			@Override
			public void onItemClick(FoldData data) {
				Log.d("6666", "onItemClick: data " + data);
			}
		});
		mFoldContainer.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
		mFoldContainer.setAdapter(adapter);
	}

	private class FoldAdapter extends RecyclerView.Adapter<FoldItem> {

		private OnItemClickCallback cb;
		public FoldAdapter(OnItemClickCallback callback) {
			this.cb = callback;
		}

		@NonNull
		@Override
		public FoldItem onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
			View v = LayoutInflater.from(FoldActivity.this).inflate(R.layout.layout_fold_item_3, viewGroup, false);
			return new FoldItem(v);
		}

		@Override
		public void onBindViewHolder(@NonNull FoldItem foldItem, int i) {
			foldItem.onBind(mFoldData.get(i), cb);
		}

		@Override
		public int getItemCount() {
			return mFoldData.size();
		}
	}

	public class FoldItem extends RecyclerView.ViewHolder {

		@BindView(R.id.layout_item_0)
		LinearLayout mCont0;

		@BindView(R.id.layout_item_1)
		LinearLayout mCont1;

		@BindView(R.id.layout_item_2)
		LinearLayout mCont2;

		@BindView(R.id.layout_item_3)
		LinearLayout mCont3;

		private boolean isExpand;

		private FoldData mFoldData;
		private OnItemClickCallback cb;
		public FoldItem(@NonNull View itemView) {
			super(itemView);
			ButterKnife.bind(this, itemView);
		}

		public void onBind(FoldData<String> data, OnItemClickCallback cb) {
			mFoldData = data;
			updateUI(data, mCont0);
			switch(data.getMods().size()) {
				case 3:
					updateUI(data.getMods().get(2), mCont3);
					mCont3.setVisibility(View.VISIBLE);
					mCont3.setTag(data.getMods().get(2));
				case 2:
					updateUI(data.getMods().get(1), mCont2);
					mCont2.setTag(data.getMods().get(1));
					mCont2.setVisibility(View.VISIBLE);
				case 1:
					updateUI(data.getMods().get(0), mCont1);
					mCont1.setTag(data.getMods().get(0));
					mCont1.setVisibility(View.VISIBLE);
			}

			this.cb = cb;
		}

		private void updateUI(FoldData data, LinearLayout v) {
			((TextView)v.findViewById(R.id.fold_item_fold_title)).setText(data.getTitle());
			((TextView)v.findViewById(R.id.fold_item_fold_disp)).setText(data.getTitle());
			((CheckBox)v.findViewById(R.id.fold_item_check_box)).setChecked(data.isSelected());
		}

		@OnClick({R.id.layout_item_0,R.id.layout_item_1,R.id.layout_item_2,R.id.layout_item_3})
		public void onClick(View v) {
			CheckBox checkBox;
			int selected = -1;
			switch (v.getId()) {
				case R.id.layout_item_0:
					isExpand = !isExpand;
					mCont0.setSelected(isExpand);
					switch(mFoldData.getMods().size()) {
						case 3:
							mCont3.setVisibility(isExpand ? View.VISIBLE : View.GONE);
						case 2:
							mCont2.setVisibility(isExpand ? View.VISIBLE : View.GONE);
						case 1:
							mCont1.setVisibility(isExpand ? View.VISIBLE : View.GONE);
					}
					break;
				case R.id.layout_item_1:
					checkBox = v.findViewById(R.id.fold_item_check_box);
					setChecked(checkBox, !checkBox.isChecked());
					selected = 0;
					break;
				case R.id.layout_item_2:
					checkBox = v.findViewById(R.id.fold_item_check_box);
					setChecked(checkBox, !checkBox.isChecked());
					selected = 1;
					break;
				case R.id.layout_item_3:
					checkBox = v.findViewById(R.id.fold_item_check_box);
					setChecked(checkBox, !checkBox.isChecked());
					selected = 2;
					break;
			}

			if ((selected >= 0) && cb != null) {
				cb.onItemClick(mFoldData);
			}

		}

		private void setChecked(CheckBox check, boolean checked) {
			check.setChecked(checked);
		}

	}

	public interface OnItemClickCallback {
		public void onItemClick(FoldData data);
	}
}
