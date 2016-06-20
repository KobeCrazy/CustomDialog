package com.dyr.view;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.dyr.custom.CustomDialog;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		SDCardListener listener = new SDCardListener(Environment.getExternalStorageDirectory().getPath()+"/android/data/com.iflytek.inputmethod/cache");
		listener.startWatching();
		System.out.println("dpyang1"+Environment.getExternalStorageDirectory().getPath()+"/android/data/com.iflytek.inputmethod/cache");
		
		listener.stopWatching();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public void showAlertDialog(View view) {

		CustomDialog.Builder builder = new CustomDialog.Builder(this);
		builder.setMessage("type = 0"+"/n");
		builder.setMessage("type = 0"+"/n"+"xunfeishurufa/n sshush/nshshshssh");
		builder.setTitle("错误堆栈信息");
		//builder.setPositiveButton("取消", new DialogInterface.OnClickListener() {
//			public void onClick(DialogInterface dialog, int which) {
//				dialog.dismiss();
//				
//			}
//		});

//		builder.setNegativeButton("再见",
//				new android.content.DialogInterface.OnClickListener() {
//					public void onClick(DialogInterface dialog, int which) {
//						dialog.dismiss();
//					}
//				});

		builder.create().show();

	}

}
