package activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.example.teste.R;

public class ListaReceitas extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lista_receitas);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lista_receitas, menu);
		return true;
	}

}
