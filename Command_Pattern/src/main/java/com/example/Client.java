package com.example;

public class Client {  
    public static void main(String[] args) {  
        Document doc = new Document();  
          
        ActionListenerCommand clickOpen = new ActionOpen(doc);  
        ActionListenerCommand clickSave = new ActionSave(doc);  
          
        MenuOptions menu = new MenuOptions(clickOpen, clickSave);  
          
        menu.clickopen();  
        menu.clicksave();  
   }  
}  