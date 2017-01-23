package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import File.data_handling;
import View.ESPGUI1;
import View.ESPGUI3;

public class ESPGUI3_Listener implements ActionListener {

	private ESPGUI3 gui;
	data_handling d;
	
	public ESPGUI3_Listener(ESPGUI3 gui)
	{
		this.gui = gui;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		data_handling.retrive();
		
		System.out.println(":H");
		// TODO Auto-generated method stub
		if(e.getActionCommand() == gui.btnNewButton.getActionCommand())
		{
			System.out.println(":H1");
			try 
			{
				gui.jta.setText(data_handling.retrive());
				
			} catch (NumberFormatException e1) 
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
	
}