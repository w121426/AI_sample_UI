package csci567.sampleui;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener {
	int count1, count2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		count1 = 0;
		count2 = 0;
		Button btn1 = (Button) findViewById(R.id.button1);
		btn1.setOnClickListener(this);
		Button btn2 = (Button) findViewById(R.id.button2);
		btn2.setOnClickListener(this);
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}


	@Override
	public void onClick(View src) {
		TextView txt = (TextView) findViewById(R.id.textView1);
		switch (src.getId()) {
        	case R.id.button1:
        		count1++;
            	//Replace the text in the textView with the following text.      
            	txt.setText("1: " + count1);
            	break;
        	case R.id.button2:
        		count2++;
            	//Replace the text in the textView with the following text.      
            	txt.setText("2: " + count2);
            	break;
		}		
	}


}
