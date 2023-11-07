//Xml Code  for design (copy paste or you can create your own design and replace id)
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android" android:orientation="vertical" android:layout_width="match_parent" android:layout_height="match_parent" android:layout_margin="20dp">

<EditText android:id="@+id/editText1"
android:layout_width="match_parent" android:layout_height="wrap_content" android:layout_weight="1" android:inputType="numberDecimal" android:textSize="20sp" />

<EditText android:id="@+id/editText2"
android:layout_width="match_parent" android:layout_height="wrap_content" android:layout_weight="1" android:inputType="numberDecimal" android:textSize="20sp" />

<Button android:id="@+id/Add"
android:layout_width="match_parent" android:layout_height="wrap_content" android:layout_weight="1" android:text="+" android:textSize="30sp"/>

<Button android:id="@+id/Sub"
android:layout_width="match_parent" android:layout_height="wrap_content" android:layout_weight="1" android:text="-" android:textSize="30sp"/>

<Button android:id="@+id/Mul"
android:layout_width="match_parent"
android:layout_height="wrap_content" android:layout_weight="1" android:text="*" android:textSize="30sp"/>

<Button android:id="@+id/Div"
android:layout_width="match_parent" android:layout_height="wrap_content" android:layout_weight="1" android:text="/" android:textSize="30sp"/>

<TextView android:id="@+id/textView"
android:layout_width="match_parent" android:layout_height="wrap_content" android:layout_marginTop="50dp" android:text="Answer is" android:textSize="30sp" android:gravity="center"/>
</LinearLayout> 

  Java code: 
import android.annotation.SuppressLint;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle; import android.text.TextUtils; import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button; import android.widget.EditText; import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements OnClickListener { EditText Num1;
EditText Num2; Button Add; Button Sub; Button Mul; Button Div; TextView Result;

@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
Num1 = (EditText) findViewById(R.id.editText1); Num2 = (EditText) findViewById(R.id.editText2); Add = (Button) findViewById(R.id.Add);
Sub = (Button) findViewById(R.id.Sub); Mul = (Button) findViewById(R.id.Mul); Div = ( Button ) findViewById ( R.id.Div );
Result = (TextView) findViewById(R.id.textView); Add.setOnClickListener(this); Sub.setOnClickListener(this); Mul.setOnClickListener(this); Div.setOnClickListener(this);
}
public void onClick (View v)
{
float num1 = 0; float num2 = 0; float result = 0; String oper = "";
if (TextUtils.isEmpty(Num1.getText().toString()) || TextUtils.isEmpty(Num2.getText().toString()))
return;
num1 = Float.parseFloat(Num1.getText().toString()); num2 = Float.parseFloat(Num2.getText().toString()); switch (v.getId())
{
case R.id.Add: oper = "+";
result = num1 + num2;
break;
case R.id.Sub: oper = "-";
result = num1 - num2;
break;
case R.id.Mul: oper = "*";
result = num1 * num2;
break; case R.id.Div:
oper = "/";
result = num1 / num2;
break; default:
break;
}
Result.setText(num1 + " " + oper + " " + num2 + " = " + result);
}
@Override
public void onPointerCaptureChanged(boolean hasCapture) {
}
 }
