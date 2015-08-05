package com.vk.aazhushou;

import com.vk.Base.ActivityFrame;
import com.vk.adapter.AdapterAppGrid;

import android.os.Bundle;
import android.widget.GridView;

public class ActivityMain extends ActivityFrame{
	private GridView gvAppGrid;
	private AdapterAppGrid mAdapterAppGrid;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.lay_main);//��ActivityFrame�м���
		//����layMainBody,��ʱ��û�м���gridview�еĶ���
		appendMainBody(R.layout.main_body);
		initVariable();
		initView();
		initListeners();
		bindData();
	}
	public void initVariable(){
		mAdapterAppGrid = new AdapterAppGrid(this);
//		gvAppGrid = new GridView(this);
	}
	private void initView() {
		gvAppGrid = (GridView) findViewById(R.id.gvAppGrid);
	}
	private void initListeners() {
		// TODO Auto-generated method stub
		
	}
	private void bindData() {
		// TODO Auto-generated method stub
		gvAppGrid.setAdapter(mAdapterAppGrid);
	}
}
