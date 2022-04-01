package com.vk;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class StartApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(StartApplication.class);

	@Autowired
	private MvpteaminfoRepository teaminforepository;

	@Autowired
	private MvpinfoRepository mvpinforepository;

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}

	@Override
	public void run(String... args) {

		log.info("StartApplication...");
		System.out.println(teaminforepository.findAll());
		System.out.println(mvpinforepository.findAll());

	}

	@RequestMapping
	public String home() {
		return "<h1>Hello, From our First OCI service!!</h1>";
	}

	@GetMapping(value = "/mvpinfo", produces = "application/json")
	public List<MvpInfo> getMvpInfo() {
		List<MvpInfo> infos = (List<MvpInfo>) mvpinforepository.findAll();

		return infos;
	}

	@GetMapping(value = "/mvpteaminfo", produces = "application/json")
	public List<Mvpteaminfo> getMvpTeamInfo() {
		List<Mvpteaminfo> infos = (List<Mvpteaminfo>) teaminforepository.findAll();

		return infos;
	}

}