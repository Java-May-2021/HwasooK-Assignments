package com.example.lookify.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.lookify.models.Song;
import com.example.lookify.repositories.SongRepository;

@Service
public class SongService {
	private final SongRepository sRepo;
	public SongService(SongRepository repo) {
		this.sRepo = repo;
	}
	
	//create endpoint display all song
	public List<Song> allSongs() {
		return this.sRepo.findAll();
	}
	
	//display one song
	public Song findSong(Long id) {
		return this.sRepo.findById(id).orElse(null);
	}
	
	//from SongRepo
	public List<Song> topTenByRating() {
		return this.sRepo.findTop10ByOrderByRatingDesc();
	}
	
	//from SongRepo
	public List<Song> songsContainingArtist(String artist) {
		return this.sRepo.findByArtistContaining(artist);
	}
	
	//create
	public Song createSong(Song song) {
		return this.sRepo.save(song);
	}
	
	//update
	public Song updateSong(Song song) {
		return this.sRepo.save(song);
	}
	
	//delete
	public void deleteSong(Long id) {
		this.sRepo.deleteById(id);
	}
	
}
