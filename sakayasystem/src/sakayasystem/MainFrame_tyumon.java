package sakayasystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainFrame_tyumon extends JFrame{
	public String[] useless = {" ", " "};
    public String[] PanelNames = {"top","request","confirm","finishOrder","fin","err","finishArrive","show"};
    
    TopPanel top = new TopPanel(this,PanelNames[0]);
    RequestPanel request = new RequestPanel(this,PanelNames[1]);
    ConfirmPanel confirm = new ConfirmPanel(this,PanelNames[2],useless);
    FinishOrderPanel finishOrder = new FinishOrderPanel(this, PanelNames[3],useless);
    FinPanel fin = new FinPanel(this,PanelNames[4]);
    ErrPanel err = new ErrPanel(this,PanelNames[5],useless);
    FinishArrivePanel finishArrive = new FinishArrivePanel(this,PanelNames[6],useless);
    ShowPanel show = new ShowPanel(this,PanelNames[7], useless);

   
    public MainFrame_tyumon(){
    	this.add(top);top.setVisible(true);
    	this.add(request);request.setVisible(false);
    	this.add(confirm);confirm.setVisible(false);
    	this.add(finishOrder);finishOrder.setVisible(false);
    	this.add(fin);fin.setVisible(false);
    	this.add(err);err.setVisible(false);
    	this.add(finishArrive);finishArrive.setVisible(false);
    	this.add(show);show.setVisible(false);
    	this.setBounds(350,250,400,300);
    }
    
    public static void main(String[] args){
    	//ファイルの読み込み&配列に保存
    	try{
    		File file = new File("src/sakayasystem/zaiko.txt");
    		FileReader filereader = new FileReader(file);
    		
    		int ch;
    		while( (ch = filereader.read())!=-1){
    			System.out.print((char)ch);
    		}
    		filereader.close();
    	}catch(FileNotFoundException e){
    		System.out.println(e);
    	}catch(IOException e){
    		System.out.println(e);
    	}
    
    	
    	MainFrame_tyumon mf = new MainFrame_tyumon();
    	mf.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	mf.setVisible(true);
    }
    
    public void PanelChange(JPanel jp, String str, String[] usel){
    	System.out.println(jp.getName());
    	String name = jp.getName();
    	if(name == PanelNames[0]){
    		top = (TopPanel)jp;
    		top.setVisible(false);
    	}else if (name == PanelNames[1]){
    		request = (RequestPanel)jp;
    		request.setVisible(false);
    		useless = usel;
    	}else if (name == PanelNames[2]){
    		confirm = (ConfirmPanel)jp;
    		confirm.setVisible(false);
    	}else if (name == PanelNames[3]){
    		finishOrder = (FinishOrderPanel)jp;
    		finishOrder.setVisible(false);
    		useless = null;
    	}else if (name == PanelNames[4]){
    		fin = (FinPanel)jp;
    		fin.setVisible(false);
    		useless = usel;
    	}else if (name == PanelNames[5]){
    		err = (ErrPanel)jp;
    		err.setVisible(false);
    		useless = null;
    	}else if (name == PanelNames[6]){
    		finishArrive = (FinishArrivePanel)jp;
    		finishArrive.setVisible(false);
    	}else if (name == PanelNames[7]){
    		
    		show = (ShowPanel)jp;
    		show.setVisible(false);
    		//ファイルへの書き込み
    		//**************
    		useless = null;
    		
    	}

		if(str == PanelNames[0]){
		    top.setVisible(true);
		}else if(str == PanelNames[1]){
			this.remove(request);
			request = new RequestPanel(this,PanelNames[1]);
			this.add(request);
		    request.setVisible(true);
		}else if(str == PanelNames[2]){
			this.remove(confirm);
			confirm = new ConfirmPanel(this,PanelNames[2],useless);
			this.add(confirm);
		    confirm.setVisible(true);
		}else if(str == PanelNames[3]){
			this.remove(finishOrder);
			finishOrder = new FinishOrderPanel(this, PanelNames[3],useless);
			this.add(finishOrder);
		    finishOrder.setVisible(true);
		}else if(str == PanelNames[4]){
			this.remove(fin);
			fin = new FinPanel(this,PanelNames[4]);
			this.add(fin);
		    fin.setVisible(true);
		}else if(str == PanelNames[5]){
			this.remove(err);
			err = new ErrPanel(this,PanelNames[5],useless);
			this.add(err);
		    err.setVisible(true);
		}else if(str == PanelNames[6]){
			this.remove(finishArrive);
			finishArrive = new FinishArrivePanel(this,PanelNames[6],useless);
			this.add(finishArrive);
		    finishArrive.setVisible(true);
		}else if(str == PanelNames[7]){
		    this.remove(show);
		    show = new ShowPanel(this,PanelNames[7], useless);
		    this.add(show);
			show.setVisible(true);
		}
	
    }
    
}
