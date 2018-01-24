package eecs1022.labtwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Labtwoactivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labtwoactivity);
    }
    private void setContentsOfTextView(int id, String newContents){
        View view=findViewById(id);
        TextView textView= (TextView) view;
        textView.setText(newContents);
    }
    private String getInputOfTextField(int id){
        View view =findViewById(id);
        EditText editText = (EditText) view;
        String input =editText.getText().toString();
        return input;

    }
    private String getItemSelected(int id) {
        View view = findViewById(id);
        Spinner spinner = (Spinner) view;
        String string = spinner.getSelectedItem().toString();
        return string;
    }
    public  void computeTaxButtonclicked(View view){
        String textname = getInputOfTextField(R.id.InputName);
        String textincome = getInputOfTextField(R.id.InputIncome);
        double income = Double.parseDouble(textincome);
        double tax = income;

        String selectedItem = getItemSelected(R.id.Statusspinner);
        Person user = new Person (textname,income,selectedItem);
        setContentsOfTextView(R.id.labelAnswer, user.toString());
    }
}
