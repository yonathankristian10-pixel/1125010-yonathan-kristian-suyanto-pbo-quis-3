package implementasi;

import model.mahasiswa;

public class mahasiswaDataview {
    @Override 
    protected String[] getprimarykey(mahasiswa data){
        return new String[]{data.getNim()};
  }
  @Override
    protected String[] getFields(){
        return new String[]{"nim","nama","email","umur"};
    }
    @Override 
    protected Mahasiswa
    convertVeluesmodel(String[]values){
        return new mahasiswa(values[0],values[1],values[2]);
        integer.parseInt(values[3]);
    
    }
    @Override 
    protected String[]
    convertToStingArray(mahasiswa data){
        return new String[]{data.getNim();
            data.getNama();
            data.getEmail();
            String.valueOf(data.getUmur())};
    }

}
