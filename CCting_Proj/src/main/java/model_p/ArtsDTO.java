package model_p;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ArtsDTO {
	String name, agency, arts, content, awards, photo1, photo2, bfile1, bfile2;
	Date edit_date;
	int id, age, height, weight;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E) hh:mm");

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public String getArts() {
		return arts;
	}
	
	public String getArtsBr() {
		return arts.replaceAll("\n", "<br>");
	}

	public void setArts(String arts) {
		this.arts = arts;
	}

	public String getContent() {
		return content;
	}
	
	public String getContentBr() {
		return content.replaceAll("\n", "<br>");
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAwards() {
		return awards;
	}

	public String getAwardsBr() {
		return awards.replaceAll("\n", "<br>");
	}

	public void setAwards(String awards) {
		this.awards = awards;
	}

	public String getPhoto1() {
		return photo1;
	}

	public void setPhoto1(String photo1) {
		this.photo1 = photo1;
	}

	public String getPhoto2() {
		return photo2;
	}

	public void setPhoto2(String photo2) {
		this.photo2 = photo2;
	}

	public String getBfile1() {
		return bfile1;
	}

	public void setBfile1(String bfile1) {
		this.bfile1 = bfile1;
	}

	public String getBfile2() {
		return bfile2;
	}

	public void setBfile2(String bfile2) {
		this.bfile2 = bfile2;
	}

	public Date getEdit_date() {
		return edit_date;
	}
	
	public String getEdit_dateStr() {
		return sdf.format(edit_date);
	}

	public void setEdit_date(Date edit_date) {
		this.edit_date = edit_date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "ArtsDTO [name=" + name + ", agency=" + agency + ", arts=" + arts + ", content=" + content + ", awards="
				+ awards + ", photo1=" + photo1 + ", photo2=" + photo2 + ", bfile1=" + bfile1 + ", bfile2=" + bfile2
				+ ", edit_date=" + edit_date + ", id=" + id + ", age=" + age + ", height=" + height + ", weight="
				+ weight + "]";
	}

}
