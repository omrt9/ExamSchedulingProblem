package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import Bussiness_Logic.raw_logic;
import File.data_handling;
import View.ESPGUI1;
import View.ESPGUI2;

public class ESPGUI2_Listener implements ActionListener
{
	private ESPGUI2 gui;
	// private raw_logic R;
	private data_handling d;
	int i = 1;
	
	public ESPGUI2_Listener(ESPGUI2 gui)
	{
		this.gui = gui;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand() == gui.btnNewButton.getActionCommand())
		{
			try 
			{
				data_handling.insert(i, gui.jta.getText());
			} 
			catch (IOException e1) 
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			i++;
		}
	}
}
