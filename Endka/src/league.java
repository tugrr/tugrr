public class league extends clubs{
private String semifinal;
private String semifinal1;
private String grandfinal;
private int choose;

	public league(String real, String barca, String bayern, String juve,String semifinal,String semifinal1,String grandfinal,int choose) {
		super(real, barca, bayern, juve);
		this.semifinal=semifinal;
	
		this.choose=choose;
		this.semifinal1=semifinal1;
		this.grandfinal=grandfinal;
	}
	public String getSemifinal() {
		return semifinal;
	}
	public void setSemifinal(String semifinal) {
		this.semifinal = semifinal;
	}
	public String getGrandfinal() {
		return grandfinal;
	}
	public void setGrandfinal(String grandfinal) {
		this.grandfinal = grandfinal;
	}
	public String getSemifinal1() {
		return semifinal1;
	}
	public void setSemifinal1(String semifinal1) {
		this.semifinal1 = semifinal1;
	}
	public int getChoose() {
		return choose;
	}
	public void setChoose(int choose) {
		this.choose = choose;
	}
	
	
	
}