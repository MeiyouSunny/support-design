package com.zhangqi.percentagebar;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	private PercentageBar mBarGraph;
	private ArrayList<Float> respectTarget;
	private ArrayList<String> respName;

	private Toolbar mToolBar;
	private TabLayout mTabLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_support);
		// respectTarget = new ArrayList<Float>();
		// respName = new ArrayList<String>();
		// respectTarget.add(35.0f);
		// respectTarget.add(20.0f);
		// respectTarget.add(18.0f);
		// respectTarget.add(15.0f);
		// respectTarget.add(10.0f);
		// respectTarget.add(8.0f);
		// respectTarget.add(5.0f);
		// respName.add("滴滴");
		// respName.add("小米");
		// respName.add("京东");
		// respName.add("美团");
		// respName.add("魅族");
		// respName.add("酷派");
		// respName.add("携程");
		// mBarGraph = (PercentageBar) findViewById(R.id.bargraph);
		// mBarGraph.setRespectTargetNum(respectTarget);
		// mBarGraph.setRespectName(respName);
		// mBarGraph.setTotalBarNum(7);
		// mBarGraph.setMax(40);
		// mBarGraph.setBarWidth(50);
		// mBarGraph.setVerticalLineNum(4);
		// mBarGraph.setUnit("亿元");

		mToolBar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(mToolBar);
		mToolBar.setTitle("Support Design");

		mTabLayout = (TabLayout) findViewById(R.id.tabLayout);
		mTabLayout.addTab(mTabLayout.newTab().setText("联系人"));
		mTabLayout.addTab(mTabLayout.newTab().setText("消息"));
		mTabLayout.addTab(mTabLayout.newTab().setText("设置"));

		final CoordinatorLayout rootView = (CoordinatorLayout) findViewById(R.id.rootLayout);
		final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
		fab.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Snackbar.make(rootView, "This is a SnackBar..",
						Snackbar.LENGTH_LONG)
						.setAction("Undo", new OnClickListener() {

							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								Toast.makeText(MainActivity.this,
										"Undo click ..", Toast.LENGTH_SHORT)
										.show();
							}
						}).show();
			}
		});

	}

}
