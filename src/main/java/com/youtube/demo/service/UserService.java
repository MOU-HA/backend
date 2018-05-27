package com.youtube.demo.service;

import java.util.List;

import com.youtube.demo.model.User;

public interface UserService {	
	
	/**
	 * Modifier ou ajouter un tilisateur
	 * @param user
	 * @return l'utilisateur modifié
	 */
	User save(User user);
	
	/***
	 * Récupération de la liste des utilisateurs
	 * @return leste des utilisateurs
	 */
	List<User> findAll();
	
	/**
	 * Supprimer un utilisateur 
	 * @param id
	 */
	
	void deleteUser(Long id);

}
