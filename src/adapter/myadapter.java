package adapter;

import java.util.List;

import com.model.partouche.test;
import com.partouche.tagandtry.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class myadapter extends BaseAdapter {

	private Context mContext;
	private List<test> mList;

	public myadapter(Context context, List<test> list) {
		mContext = context;
		mList = list;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return mList.size();
	}

	public test getItem(int position) {
		// TODO Auto-generated method stub
		return mList.get(position);
	}

	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	  public View getView(int position, View convertView, ViewGroup parent) {
	    LayoutInflater inflater = (LayoutInflater) mContext
	        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    View rowView = inflater.inflate(R.layout.celluledeal, parent, false);
	    
	    
	    TextView textViewTaille = (TextView) rowView.findViewById(R.id.taille);
	    TextView textViewTitre = (TextView) rowView.findViewById(R.id.titre);
	    
	    test tmp = mList.get(position);
	    textViewTaille.setText(tmp.getTaille());
	    textViewTitre.setText(tmp.getDescription());
	    // Change the icon for Windows and iPhone

	    return rowView;
	  }

}
