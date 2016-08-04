package com.example.test;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;


import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button b;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		
		b = (Button) findViewById(R.id.button1);
		b.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				new text().execute();
			}
		});

	}


	class text extends AsyncTask<Void, String, String> {
		String result = null;

		@Override
		protected String doInBackground(Void... params) {
			Log.i("DoINg BackGround", "START");
			try {
				
				HttpClient httpClient = new DefaultHttpClient();
								HttpGet getReqwest = new HttpGet("http://192.168.1.13:80/phpvsandroid/index.php");
								HttpResponse httpResponse = httpClient.execute(getReqwest);
				String s = EntityUtils.toString(httpResponse.getEntity());
				Log.i("DoINg", s);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return result;
		}
	}
	
	

}
