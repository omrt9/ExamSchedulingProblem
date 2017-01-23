package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.ESPGUI;
import View.ESPGUI1;
import View.ESPGUI2;
import View.ESPGUI3;

public class ESPGUI_Listener implements ActionListener{

	private ESPGUI gui;
	
	public ESPGUI_Listener(ESPGUI gui)
	{
		this.gui = gui;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getActionCommand() == "CREATE A NEW TIMETABLE")
		{
			ESPGUI1 gui1 = new ESPGUI1();
			gui1.setVisible(true);
		}
		else if(e.getActionCommand() == "RETRIEVE AN OLD TIMETABLE")
		{
			ESPGUI3 gui3 = new ESPGUI3();
			gui3.setVisible(true);
		}
		
	}

}

