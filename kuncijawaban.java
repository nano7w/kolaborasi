import java.util.*;
public class kuncijawaban{

	private int soal;
	private String jawabanbenar;
	private ArrayList<JawabanUser> jawabanuserbenar;


	public kuncijawaban(int soal, String jawabanbenar){

		this.soal=soal;
		this.jawabanbenar=jawabanbenar;
		this.jawabanuserbenar= new ArrayList<JawabanUser>;
	}

	public int getSoal(){
		return this.soal;
	}
	
	public String getjawabanbenar(){
		return this.jawabanbenar;
	}

	public getJumlahjawabanuser(){
		return this.jawabanbenaruser.size();
	}
}