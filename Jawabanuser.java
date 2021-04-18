import Java.util.Scanner;
public class Jawabanuser{

	private String nama;
	private String status;
	private Char jenisKelamin;
	private String jawabanuser;

	public Jawabanuser(String nama,String status,Char jenisKelamin,String jawabanuser){

		this.nama=nama;
		this.status.status;
		this.jenisKelamin=jenisKelamin;
		this.jawabanuser=jawabanuser;
	}

	public void setnama(String nama){
		this.nama=nama;
	}


	public void setstatus(String status){
		this.status=status;
	}


	public void setjeniskelamin(Char jenisKelamin){
		this.jenisKelamin=jenisKelamin;
	}
	

	public void setjawabanuser(String jawabanuser){
		this.jawabanuser=jawabanuser;
	}	
	
	public String getjawabanuser(){
		return this.jawabanuser;
	}	


	public String getnama(){
		return this.nama;
	}	

	public Char getjeniskelamin(){
		return this.jenisKelamin;
	}	


	public String getstatus(){
		return this.status;
	}	

}