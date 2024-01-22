package com.ssct.votingsystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.AdapterView;
import android.graphics.Typeface;
import com.shashank.sony.fancytoastlib.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class Signup2Activity extends  AppCompatActivity  { 
	
	
	private String str = "";
	private String str1 = "";
	
	private ArrayList<String> status = new ArrayList<>();
	private ArrayList<String> department = new ArrayList<>();
	private ArrayList<String> course = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear4;
	private ImageView imageview1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear5;
	private LinearLayout linear7;
	private EditText edittext1;
	private EditText edittext2;
	private TextView textview1;
	private Spinner spinner1;
	private TextView textview3;
	private Spinner spinner3;
	private Button button1;
	
	private Intent i = new Intent();
	private SharedPreferences sp;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.signup2);
		initialize(_savedInstanceState);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		edittext2 = (EditText) findViewById(R.id.edittext2);
		textview1 = (TextView) findViewById(R.id.textview1);
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		textview3 = (TextView) findViewById(R.id.textview3);
		spinner3 = (Spinner) findViewById(R.id.spinner3);
		button1 = (Button) findViewById(R.id.button1);
		sp = getSharedPreferences("sp", Activity.MODE_PRIVATE);
		
		edittext1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_charSeq.length() > 9) {
					str = _charSeq.substring((int)(0), (int)(9));
					edittext1.setText("");
				}
				if (_charSeq.length() == 0) {
					edittext1.append(str);
					str = "";
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext2.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_charSeq.length() > 30) {
					str1 = _charSeq.substring((int)(0), (int)(30));
					edittext2.setText("");
				}
				if (_charSeq.length() == 0) {
					edittext2.append(str1);
					str1 = "";
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (_position == 0) {
					textview1.setText("New Student");
				}
				if (_position == 1) {
					textview1.setText("Old Student");
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (_position == 0) {
					textview3.setText("Course");
				}
				if (_position == 1) {
					textview3.setText("BSCE");
				}
				if (_position == 2) {
					textview3.setText("BSECE");
				}
				if (_position == 3) {
					textview3.setText("BSEE");
				}
				if (_position == 4) {
					textview3.setText("BSIT");
				}
				if (_position == 5) {
					textview3.setText("BSIS");
				}
				if (_position == 6) {
					textview3.setText("BSCS");
				}
				if (_position == 7) {
					textview3.setText("Course");
				}
				if (_position == 8) {
					textview3.setText("BSED");
				}
				if (_position == 9) {
					textview3.setText("BEED");
				}
				if (_position == 10) {
					textview3.setText("BTTE");
				}
				if (_position == 11) {
					textview3.setText("BPED");
				}
				if (_position == 12) {
					textview3.setText("BTVTED");
				}
				if (_position == 13) {
					textview3.setText("Course");
				}
				if (_position == 14) {
					textview3.setText("BMET-MIT");
				}
				if (_position == 15) {
					textview3.setText("BAET");
				}
				if (_position == 16) {
					textview3.setText("BEET");
				}
				if (_position == 17) {
					textview3.setText("BARET");
				}
				if (_position == 18) {
					textview3.setText("BEXET");
				}
				if (_position == 19) {
					textview3.setText("BSHM");
				}
				if (_position == 20) {
					textview3.setText("BSTM");
				}
				if (_position == 21) {
					textview3.setText("BSIT-ADT");
				}
				if (_position == 22) {
					textview3.setText("BSID-ELXT");
				}
				if (_position == 23) {
					textview3.setText("Course");
				}
				if (_position == 24) {
					textview3.setText("AB-EL");
				}
				if (_position == 25) {
					textview3.setText("AB-ELL");
				}
				if (_position == 26) {
					textview3.setText("BSES");
				}
				if (_position == 27) {
					textview3.setText("BSMATH");
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!(textview1.getText().toString().contains("Status") && ("".contains("Department") && textview3.getText().toString().contains("Course")))) {
					if ((edittext1.getText().toString().length() > 0) && (edittext2.getText().toString().length() > 0)) {
						sp.edit().putString("lrn", edittext1.getText().toString()).commit();
						sp.edit().putString("section", edittext2.getText().toString()).commit();
						sp.edit().putString("status", textview1.getText().toString()).commit();
						sp.edit().putString("course", textview3.getText().toString()).commit();
						i.setClass(getApplicationContext(), Signup3Activity.class);
						startActivity(i);
						finish();
					}
					else {
						FancyToast.makeText(Signup2Activity.this, "Field is empty", FancyToast.LENGTH_LONG, FancyToast.CONFUSING, true).show();
					}
				}
				else {
					FancyToast.makeText(Signup2Activity.this, "Field is empty", FancyToast.LENGTH_LONG, FancyToast.CONFUSING, true).show();
				}
			}
		});
	}
	
	private void initializeLogic() {
		button1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/poppinsm.ttf"), 0);
		edittext1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/poppinsr.ttf"), 0);
		edittext2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/poppinsr.ttf"), 0);
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/poppinsr.ttf"), 0);
		
		textview3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/poppinsr.ttf"), 0);
		linear2.setElevation((float)5);
		linear3.setElevation((float)5);
		linear7.setElevation((float)5);
		linear5.setElevation((float)5);
		linear2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFF5F5F5));
		linear3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFF5F5F5));
		button1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF0FD3A5));
		linear5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFF5F5F5));
		linear7.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFF5F5F5));
		edittext1.setRawInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
		edittext2.setRawInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
		status.add("New Student");
		status.add("Old Student");
		spinner1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, status));
		((ArrayAdapter)spinner1.getAdapter()).notifyDataSetChanged();
		course.add("-CEIT DEPARTMENT-");
		course.add("BSCE");
		course.add("BSECE");
		course.add("BSEE");
		course.add("BSIT");
		course.add("BSIS");
		course.add("BSCS");
		course.add("-CET DEPARTMENT-");
		course.add("BSED");
		course.add("BEED");
		course.add("BTTE");
		course.add("BPED");
		course.add("BTVTED");
		course.add("-COT DEPARTMENT-");
		course.add("BMET-MIT");
		course.add("BAET");
		course.add("BEET");
		course.add("BARET");
		course.add("BEXET");
		course.add("BSHM");
		course.add("BSTM");
		course.add("BSIT-ADT");
		course.add("BSIT-ELXT");
		course.add("-CAS DEPARTMENT-");
		course.add("AB-EL");
		course.add("AB-ELL");
		course.add("BSES");
		course.add("BSMATH");
		spinner3.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, course));
		((ArrayAdapter)spinner3.getAdapter()).notifyDataSetChanged();
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
