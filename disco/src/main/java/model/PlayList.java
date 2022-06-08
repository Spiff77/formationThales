package model;

import java.sql.Date;
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
@Table(name = "playlist")
@NoArgsConstructor
public @Data class PlayList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Date createOn;
	
	private String name;
	
	@ManyToMany(mappedBy = "includeOn", fetch = FetchType.EAGER)
	@ToString.Exclude
	private List<Album> content = new ArrayList<Album>();
	
	@ManyToOne
	@ToString.Exclude
	private User owner;
	
	
	public PlayList(Date createOn, String name, User owner) {
		this.createOn = createOn;
		this.name = name;
		this.owner = owner;
	}	
	
	
	public void addAlbum(Album al) {
		content.add(al);
	}


}
