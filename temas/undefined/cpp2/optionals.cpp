#include <optional>
#include <iostream>
#include <cstdlib>

class ScreenResolution {
private:
   int width;
   int height;
public:
   ScreenResolution(int width, int height){
    this->width = width;
    this->height = height;
  }
  int getWidth() {
    return width;
  }
  int getHeight() {
    return height;
  }
};


class DisplayFeatures {

private:
  std::string size; // In inches
  std::optional<ScreenResolution> resolution;   
  

public:
    DisplayFeatures(std::string size, std::optional<ScreenResolution> resolution){
    this->size = size;
    this->resolution = resolution;
  }
  std::string getSize() {
    return size;
  }
  std::optional<ScreenResolution> getResolution(){
    return resolution;
  }
};

class Mobile {
private:
    long id;
    std::string brand;
    std::string name;
    std::optional<DisplayFeatures> displayFeatures;
  // Like wise we can see MemoryFeatures, CameraFeatures etc.
  // For simplicity, using only one Features
public:
  Mobile(long id, std::string brand, std::string name, std::optional<DisplayFeatures> displayFeatures){
    this->id = id;
    this->brand = brand;
    this->name = name;
    this->displayFeatures = displayFeatures;
  }
  long getId() {
    return id;
  }
  std::string getBrand() { 
    return brand;
  }
  std::string getName() {
    return name;
  }
  std::optional<DisplayFeatures> getDisplayFeatures() {
    return displayFeatures;
  }
};


class MobileService {
  public:
   int getMobileScreenWidth(std::optional<Mobile> mobile){
     int r=0;
     if(mobile){ 
       std::optional<DisplayFeatures> df=mobile.value().getDisplayFeatures();  
       if(df){ 
	        std::optional<ScreenResolution> sr=df.value().getResolution();  
	        if(sr){ 
	          r= sr.value().getWidth();   
	        }
       }
    }
    return r;
  }
};



int main(int argc, char  **argv) {
    ScreenResolution resolution(750,1334);
    DisplayFeatures dfeatures("4.7", resolution);
    Mobile mobile(2015001, "Apple", "iPhone 6s", dfeatures);

    MobileService mService;

    int width = mService.getMobileScreenWidth(mobile);
    std::cout << "Apple iPhone 6s Screen Width = "  << width << std::endl;

    Mobile mobile2(2015001, "Apple", "iPhone 6s", std::nullopt);
    int width2 = mService.getMobileScreenWidth(mobile2);
    std::cout << "Apple iPhone 16s Screen Width = " << width2 << std::endl;
  
    return 0;
}


