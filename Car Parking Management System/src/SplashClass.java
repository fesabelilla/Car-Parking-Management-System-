
public class SplashClass {

    public static void main(String[] args) {
       
        Loading lod = new Loading();
        lod.setVisible(true);
        
        try {
            for(int i = 0 ; i<101 ; i+=2){
                Thread.sleep(50);
                lod.loadLabel.setText(Integer.toString(i)+"%");
                FirstPageJFrame fp = new FirstPageJFrame();
                if(i==100){
                    lod.dispose();
                    fp.show();
                }
            }
        } catch (Exception e) {
            
        }
    }
    
}
