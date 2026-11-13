package model;

public class mahasiswa {
    private String nim;
    private String nama;
    private String email;
    private int umur;

    public mahasiswa(String nim,String nama,String email){
        this.nim =nim;
        this.nama =nama;
        this.email= email;
    }
    public String getNim(){
        return nim;
    }
    public void setNim(String nim){
        this.nim=nim;
        
    }
}
