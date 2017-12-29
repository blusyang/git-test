package com.design.patterns.bridge;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author yangchao<br>
 * 开发时间: 2017年9月27日<br>
 */
public class BridgeTest {

	/**
	 * @author yangchao
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractBridge bridge = new MyBridge();

		BridgeService bridgeService = new BridgeServiceImpl1();
		bridge.setBridgeService(bridgeService);
		bridge.method();

		BridgeService bridgeService2 = new BridgeServiceImpl2();
		bridge.setBridgeService(bridgeService2);
		bridge.method();
	}
}
