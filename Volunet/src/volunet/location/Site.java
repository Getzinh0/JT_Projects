package volunet.location;
//folha
import java.util.LinkedList;
import java.util.List;

public class Site {
	
	class Location{
		private double latitude;
		private double longitude;
		
		Location(double latitude, double longitude){
			this.latitude = latitude;
			this.longitude = longitude;
		}
		
		void setLatitude(double latitude){
			this.latitude = latitude;
		}
		
		void setLongitude(double longitude){
			this.longitude= longitude;
		}
		
		double getLatitude(){
			return latitude;
		}
		
		double getLongitude(){
			return longitude;
		}
	}
	
	class DataItem{
		String description;
		java.net.URL url; 
		
		DataItem(String description, java.net.URL url){
			this.description = description;
			this.url = url;
		}
		
		void setDescription(String description){
			this.description = description;
		}
		
		void setUrl(java.net.URL url){
			this.url = url;
		}
		
		String getDescription(){
			return description;
		}
		
		java.net.URL getUrl(){
			return url;
		}
	}
	
	LinkedList<DataItem> dataItems;
	
	Site(){
		dataItems = new LinkedList<Site.DataItem>();
	}
	
	List<DataItem> getDataItems(){
		return dataItems;
	}
	
	void addDataItem(DataItem data){
		dataItems.add(data);
	}
}
