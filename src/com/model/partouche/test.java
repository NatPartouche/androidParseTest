package com.model.partouche;

import com.parse.ParseObject;

public class test extends ParseObject {


	public test(String couleur,String description,String image,String taille, int idmagasin) {
		super("Vetement");
		put("couleur", couleur);
		put("description",description);
		put("idmagasin",idmagasin);
		put("image",image);
		put("taille",taille);
	}

	public test(ParseObject temp){
		super("Vetement");
		put("couleur", temp.getString("couleur"));
		put("description",temp.getString("description"));
		put("idmagasin",temp.getInt("idmagasin"));
		put("image",temp.getString("image"));
		put("taille",temp.getString("taille"));
	}
	
	public void save(){
		saveInBackground();
	}
	public void update(){
		update();
	}
	
	
	
	/*
	 * Getter Setter
	 */
	public String getCouleur() {
		return getString("couleur");
	}
	
	public String getDescription() {
		return getString("description");
	}
	
	public int getIdmagasin() {
		return getInt("idmagasin");
	}
	
	public String getImage() {
		return getString("image");
	}
	
	public String getTaille() {
		return getString("taille");
	}
	
	
}
