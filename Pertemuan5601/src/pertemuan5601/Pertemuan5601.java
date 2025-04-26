
package pertemuan5601;

/**
 *
 * @author Rambu intan
 * TGL: 26-04-2005
 */
public class Pertemuan5601 {
    
    /**
     * 
     * @param args the command line arguments
     */

    public static void main(String[] args) {
       buah anggur = new buah (); 
       anggur. warna ="Hijau";
       anggur.SetRasa("Manis");
       
       System.out.printf("Warna Anggur diset %s\n",anggur.warna);
       System.out.printf("Rasa Anggur diset %s\n",anggur.GetRasa());
       
       buah semangka = new buah ();
       semangka.warna = "Merah";
       semangka.SetRasa("Manis");
       
       System.out.printf("Warna Semangka diset %s\n",semangka.warna);
       System.out.printf("Rasa Semangka diset %s\n",semangka);
                   
     
    }
}

class buah {
   public String warna;
   private String rasa;
   
   public void SetRasa(String txRasa){
       this.rasa = txRasa;
   
   }
   public String GetRasa(){
       return this.rasa;
   }
   
    
}

