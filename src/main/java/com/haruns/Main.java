package com.haruns;

import com.haruns.controller.LikeController;
import com.haruns.dto.request.UserRequestDTO;
import com.haruns.dto.response.UserResponseDTO;
import com.haruns.entity.Comment;
import com.haruns.entity.Like;
import com.haruns.entity.User;
import com.haruns.entity.Video;
import com.haruns.gui.MainGUI;
import com.haruns.model.VideoModel;
import com.haruns.repository.CommentRepository;
import com.haruns.repository.LikeRepository;
import com.haruns.repository.UserRepository;
import com.haruns.repository.VideoRepository;
import com.haruns.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
	public static void main(String[] args) {

//		UserRepository userRepository=new UserRepository();
//		VideoRepository videoRepository=new VideoRepository();
//		CommentRepository commentRepository=new CommentRepository();
//		LikeRepository likeRepository=new LikeRepository();
//		UserService userService=new UserService();
//		UserRequestDTO userRequestDTO=new UserRequestDTO();
//		userRequestDTO.setName("Harun");
//		userRequestDTO.setSurname("SAKIN");
//		userRequestDTO.setEmail("harunsakin@gmail.com");
//		userRequestDTO.setUsername("harunsakin");
//		userRequestDTO.setPassword("123456");
//		//Optional<UserResponseDTO> save = userService.save(userRequestDTO);
//		userRequestDTO.setPassword("qweqwe");
		
		MainGUI mainGUI = new MainGUI();
		mainGUI.mainGUI();
		//ctrl+shift f10 ile maini ddirek



		


	}

}