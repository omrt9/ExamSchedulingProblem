package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Bussiness_Logic.raw_logic;
import View.ESPGUI1;
import View.ESPGUI2;

public class ESPGUI1_Listener implements ActionListener {

	private ESPGUI1 gui;
	private raw_logic R;
	
	public ESPGUI1_Listener(ESPGUI1 gui)
	{
		this.gui = gui;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
		if(e.getActionCommand() == "ADD")
		{
			R = new raw_logic(Integer.parseInt(gui.getTextField_1()));
			int a = Integer.parseInt(gui.getTextField_1());
			
			for(int i=1;i<=a;i++)
			{
				gui.combo(i);
			}
		}
		else if(e.getActionCommand() == "ADD CONNECTION")
		{
			R.create((int)gui.gettype(), (int)gui.gettype1());	
			R.print();
		}
		
		else if(e.getActionCommand() == "ADD SUBJECT")
		{
			R.insert();
			R.print();
			int a = Integer.parseInt(gui.getTextField_1()) + 1;
		
			gui.setTextField_1(""+a);
			gui.combo(a);
		}
		
		else if(e.getActionCommand() == "GENERATE TIME-TABLE")
		{
			ESPGUI2 gui2 = new ESPGUI2();
			gui2.setVisible(true);
			gui2.jta.setText(R.color());
		}	
		
		else if(e.getActionCommand() == "DELETE CONNECTION")
		{
			R.delete((int)gui.gettype(), (int)gui.gettype1());
		}
	}
}