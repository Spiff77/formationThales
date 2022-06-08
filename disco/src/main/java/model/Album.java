package model;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@Entity
@Table(name = "album")
@NoArgsConstructor
public @Data class Album {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String title;
	
	private int releaseYear;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@ToString.Exclude
	private Artist creator;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@ToString.Exclude
	private List<PlayList> includeOn = new ArrayList<PlayList>();
	
	
	public Album(String title, int releaseYear, Artist creator) {

		this.title = title;
		this.releaseYear = releaseYear;
		this.creator = creator;
	}
	
	public void addInPlaylist(PlayList pl) {
		includeOn.add(pl);
	}
	
	
}
