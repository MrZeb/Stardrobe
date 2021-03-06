package teacher.zeb.amelie;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity
{

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Clothes clot = new Clothes(); //Instantiera ett objekt

        Shirt shirt = new Shirt(); //Skapa en tröja

        List<Clothes> clothes = new ArrayList<>(  ); //Skapa en lista med kläder

        clothes.add( shirt ); // Lägg till ny tröja

        clothes.add( new Pants() ); //Lägg till nya byxor

        for( Clothes thing : clothes )
        {
            Shirt shirt2 = (Shirt) thing; //typecasting
        }
    }

    @Override
    public boolean onCreateOptionsMenu( Menu menu )
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate( R.menu.menu_main, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item )
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if( id == R.id.action_settings )
        {
            return true;
        }

        return super.onOptionsItemSelected( item );
    }
}
