package com.dyr.view;

import android.os.FileObserver;
import android.util.Log;

public  class SDCardListener extends FileObserver {

	public SDCardListener(String path) {
		super(path);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onEvent(int event, String path) {
		// TODO Auto-generated method stub
		switch (event){
			case FileObserver.CREATE:
				Log.d("dpyang", "path:"+path);
				break;
		}
		
	}

}
