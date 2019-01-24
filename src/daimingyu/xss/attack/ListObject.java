package daimingyu.xss.attack;

import java.util.List;

public class ListObject extends BaseJsonObject {  
	  
    // Êµ¼ÊÄÚÈİ 
    private List<?> items;  
  
    public List<?> getItems() {  
        return items;  
    }  
  
    public void setItems(List<?> items) {  
        this.items = items;  
    }
  
}  