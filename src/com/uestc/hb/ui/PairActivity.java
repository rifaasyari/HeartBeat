package com.uestc.hb.ui;

import com.uestc.hb.R;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class PairActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pair, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	protected void initLayout() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	protected void initListener() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	protected void initValue() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	protected int setRootView() {
		return R.layout.layout_pair;
	}
}
