package com.example;

public class MenuOptions implements ActionListenerCommand{  
	   private Document doc;  
	   
	  private ActionListenerCommand opencommad;
	  private ActionListenerCommand savecommad;
	  
	   
		public MenuOptions(ActionListenerCommand clickOpen, ActionListenerCommand clickSave) {
			super();
			
			this.opencommad=clickOpen;
			this.savecommad=clickSave;
		// TODO Auto-generated constructor stub
	}
		
		public void clickopen()
		{
			opencommad.execute();
		}

		public void clicksave()
		{
			savecommad.execute();
		}

		public void execute() {  
	        doc.save();  
	    }  
	}  