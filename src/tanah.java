
  public class tanah {
      double lebar;
      double panjang;

    public tanah() {
        panjang=20;
        lebar=220;
    }

    public tanah(double lebar, double panjang) {
        this.lebar = lebar;
        this.panjang = panjang;
    }
      
      
      
      void cetakInfo(){
          System.out.println("Panjang       :"+lebar);
          System.out.println("Panjang       :"+panjang);
          
          
      }
      
      
      double hitungLuas (){
          double luas;
          luas=panjang*lebar;
          return luas;
    }
      void cetakLuasTanah(){
          System.out.println("Luas Tanah = "+hitungLuas());
         
  }
  }
