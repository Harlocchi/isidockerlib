package br.com.isiflix.isiroku.isidockerlib;

import java.util.Scanner;

import br.com.isiflix.isiroku.isidockerlib.service.IsiDockerService;

public class MainClass {
	public static void main(String[] args) {

		IsiDockerService dockerService = new IsiDockerService();
		System.out.println(dockerService.getlogs("b6cba75af5d392fa02bc1bf16773277ea07a27e4c6f03328025bca09f6894aa1", 3));
				
	}
}
