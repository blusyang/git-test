package com.design.patterns.facade;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月27日<br>
 */
public class Computer {

	private CPU cpu;
	private Memory memory;
	private Disk disk;

	public Computer() {
		cpu = new CPU();
		memory = new Memory();
		disk = new Disk();
	}

	public void startup() {
		System.out.println("the computer begin to start ");
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println("the computer started");
	}

	public void shutdown() {
		System.out.println("the computer begin to shutdown");
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
		System.out.println("the computer have been shutdown");
	}
}
